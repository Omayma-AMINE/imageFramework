package org.example;


import org.example.imageCompress.CompressorSubClass1;
import org.example.imageCompress.CompressorSubClass2;
import org.example.imageCompress.CompressorTemplate;
import org.example.imageFilter.*;

public class Application {
    public static void main(String[] args) {
        int [] image = {2,6,12,3,5,8};
        FilterProcess filterProcess = new FilterProcess();

        //default filter
        filterProcess.applyFilter(image);
        //first Filter Implementation
        filterProcess.setFilterStrategy(new FilterImpl1());
        filterProcess.applyFilter(image);
        //second Filter Implementation
        filterProcess.setFilterStrategy(new FilterImpl2());
        filterProcess.applyFilter(image);
        //Non standard Implementation (ancienne )
        String filterName = "GoldFilter";
        FilterAdapter adapter = new FilterAdapter();
        adapter.setFilterName(filterName);
        filterProcess.setFilterStrategy(adapter);
        filterProcess.applyFilter(image);


        //Compresser :
        //Compressor Impl1
        CompressorTemplate compressorTemplate = new CompressorSubClass1();
        image = compressorTemplate.compresser(image);


        //Compressor Impl2
        compressorTemplate = new CompressorSubClass2();
        compressorTemplate.compresser(image);

    }

}
