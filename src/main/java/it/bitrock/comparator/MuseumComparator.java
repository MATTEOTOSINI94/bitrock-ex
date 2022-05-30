package it.bitrock.comparator;

import it.bitrock.ex.Museum;

import java.util.Comparator;

public class MuseumComparator implements Comparator<Museum> {
    @Override
    public int compare(Museum o1, Museum o2) {
        int r=o1.getNumberOfPainting()-o2.getNumberOfPainting();
        if (r==0){
            r=o1.getId()-o2.getId();
            if(r==0){
                r=o1.getName().compareTo(o2.getName());
                if(r==0){
                    r=o1.getAddress().compareTo(o2.getAddress());
                }
            }
        }
        return r;
    }
}
