package org.example.imageFilter;

public class FilterProcess {
    FilterStrategy filterStrategy = new FilterDefaultImpl();
    public void applyFilter(int [] data){
        int[] filtredData = filterStrategy.filtrer(data);
        for ( int d: filtredData) {
            System.out.print("\t"+d);
        }
        System.out.print("\n");
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }
}
