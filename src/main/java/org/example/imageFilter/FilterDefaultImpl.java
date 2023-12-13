package org.example.imageFilter;

public class FilterDefaultImpl implements FilterStrategy {
    @Override
    public int[] filtrer(int[] data) {
        System.out.println("Ceci est un le filtre standard");
        return data;
    }
}
