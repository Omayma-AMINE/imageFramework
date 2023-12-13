package org.example;

import org.example.imageCompress.CompressorSubClass1;
import org.example.imageCompress.CompressorTemplate;
import org.example.imageFilter.FilterProcess;
import org.example.imageFilter.FilterStrategy;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws Exception {
        int [] image = {2,6,12,3,5,8};
        FilterProcess filterProcess = new FilterProcess();
        CompressorTemplate compressorTemplate ;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choisir 1 pour appliquer un filter - 2 pour compresser l'image :");
            int choix = scanner.nextInt();
            if (choix == 1 ){
                System.out.print("Choisir l'implémentation du filtre à appliquer :");
                String filtreClassName = scanner.next();
                FilterStrategy filter = (FilterStrategy) Class.forName(filtreClassName).getConstructor().newInstance();
                filterProcess.setFilterStrategy(filter);
                filterProcess.applyFilter(image);
            } else if (choix == 2) {
                System.out.print("Choisir l'implémentation du compresseur à appliquer :");
                String templateClassName = scanner.next();
                compressorTemplate = (CompressorTemplate) Class.forName(templateClassName).getConstructor().newInstance();
                compressorTemplate.compresser(image);
            }else break;
            System.out.println("");
            System.out.print("Pour quittez tapez Y  , pour continuer taper N : ");
            String fin = scanner.next();
            if (fin.equalsIgnoreCase("Y"))
                break;
        }

    }

}
