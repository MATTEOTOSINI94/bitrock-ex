package it.bitrock.comparator;

import it.bitrock.ex.Paint;

import java.util.Comparator;

public class PaintComparator implements Comparator<Paint> {
    @Override
    public int compare(Paint o1, Paint o2) {
        int r;
        if(o1.getId()>o2.getId()){
            r= 1;
        } else if (o1.getId()<o2.getId()) {
            r= -1;
        }else{
                r=o1.getTitle().compareTo(o2.getTitle());
                if (r==0){
                   r=o1.getArtisticWave().compareTo(o2.getArtisticWave());
                   if (r==0){
                       r=o1.getYearOfCreation()-o2.getYearOfCreation();
                   }
                }
        }
        return r;
    }
}
