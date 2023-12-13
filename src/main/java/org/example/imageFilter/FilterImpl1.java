package org.example.imageFilter;

public class FilterImpl1 implements FilterStrategy {
    @Override
    public int[] filtrer(int[] data) {
        System.out.println("Le filtre 1 :");

        int [] rslt = new int[data.length];
        for(int i =0; i< data.length ; i++){
            rslt[i]=data[i]*3;
        }
        return rslt;
    }
}
