package org.example.imageFilter;

public class FilterImpl2 implements FilterStrategy {
    @Override
    public int[] filtrer(int[] data) {
        System.out.println("Le filtre 2 :");
        int [] rslt = new int[data.length];
        for(int i =0; i< data.length ; i++){
            rslt[i]=data[i]*5;
        }
        return rslt;
    }
}
