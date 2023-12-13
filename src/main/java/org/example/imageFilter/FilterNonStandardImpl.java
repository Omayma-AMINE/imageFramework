package org.example.imageFilter;

public class FilterNonStandardImpl {
    public int[] appliquerFiltre(String filterName,int[] data){
        System.out.println("C'est une ancienne implémentation du filter "+filterName);
        int [] rslt = new int[data.length];
        for(int i =0; i< data.length ; i++){
            rslt[i]=data[i]*10;
        }
        return rslt;
    }
}
