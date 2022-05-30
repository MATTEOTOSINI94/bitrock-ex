package it.bitrock.main;

import it.bitrock.comparator.MuseumComparator;
import it.bitrock.comparator.PaintComparator;
import it.bitrock.ex.Artist;
import it.bitrock.ex.Museum;
import it.bitrock.ex.Paint;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paint> paints = new ArrayList<>();
        paints.add(new Paint(5,"Arturo","Romanticismo",1998));
        paints.add(new Paint(5,"Arturo","Romanticismo",1992));
        paints.add(new Paint(5,"Arturo","Romanticismo",1982));
        paints.add(new Paint(1,"Arturo","Futurismo",1990));
        paints.add(new Paint(3,"Bart","Futurismo",1991));
        paints.add(new Paint(2,"Positive","Futurismo",1992));
        paints.add(new Paint(1,"Arturo","Romanticismo",1992));
        paints.add(new Paint(6,"Arturo","Romanticismo",1998));
        for (Paint p: paints
             ) {
            System.out.println(p);
        }
        System.out.println("-------------");
        Collections.sort(paints,new PaintComparator());
        for (Paint ps:paints){
            System.out.println(ps);
        }

        ArrayList<Museum> museums = new ArrayList<>();
        museums.add(new Museum(2,"Aa","Via abc","Taiwan",3,123456));
        museums.add(new Museum(1,"Dc","Via abc","Taiwan",1,123456));
        museums.add(new Museum(3,"Bc","Via abc","Taiwan",5,123456));
        museums.add(new Museum(1,"Zc","Via abc","Taiwan",1,123456));
        museums.add(new Museum(4,"Bc","Via abc","Taiwan",1,123456));
        museums.add(new Museum(5,"Bc","Via abc","Taiwan",1,123456));
        museums.add(new Museum(3,"Bc","Via abc","Taiwan",4,123456));
        museums.add(new Museum(3,"Bc","Via abc","Taiwan",6,123456));
        museums.add(new Museum(3,"Bc","Via abc","Taiwan",7,123456));

        Collections.sort(museums,new MuseumComparator());
        for (Museum m:museums
             ) {
            System.out.println(m);
        }


        ArrayList<Artist> artists = new ArrayList<>();
         artists.add(new Artist(4,"Mauro","Rossi","Classicista","03/04/1994"));
       // artists.add(new Artist(2,"Mauro","Rossi","Classicista","1905-03-19"));
      //  artists.add(new Artist(1,"Mauro","Rossi","Classicista","05-03-1994"));
//          artists.add(new Artist(5,"Mauro","Rossi","Classicista","05-03-1994"));
      //  Collections.sort(artists);
        for (Artist a: artists
             ) {
            System.out.println(a);
        }
    }
}
