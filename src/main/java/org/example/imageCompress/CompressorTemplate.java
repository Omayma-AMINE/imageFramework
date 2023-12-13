package org.example.imageCompress;

import java.util.ArrayList;

public abstract class CompressorTemplate {

    public int[] compresser(int [] data ){
        preCompress(data);
        int size = data.length;
        int[] result = new int[data.length];
        for ( int i=0; i<size;i++) {
            if(data[i]%2==0){
                result[i]= data[i]/2;
                System.out.print("\t"+result[i]);
            }
            else{
                result[i] = data[i];
                System.out.print("\t"+result[i]);
            }
        }
        System.out.print("\n");
        postCompress(result);

        return result;
    }
    public abstract void preCompress(int [] data);
    public abstract void postCompress(int [] data);

}
