package org.example.imageFilter;

public class FilterAdapter implements FilterStrategy{
    FilterNonStandardImpl oldFilter = new FilterNonStandardImpl();
    String filterName;
    @Override
    public int[] filtrer(int[] data) {
        if(filterName==null)
            filterName = " ";
        return oldFilter.appliquerFiltre(filterName,data);
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }
}
