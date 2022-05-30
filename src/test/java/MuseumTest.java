import it.bitrock.comparator.MuseumComparator;
import it.bitrock.ex.Museum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MuseumTest {
    MuseumComparator museumComparator = new MuseumComparator();
    @Test
    void museumComparatorEquals(){
        Museum m1 = new Museum(2,"Aa","Via abc","Taiwan",3,123456);
        Museum m2 = new Museum(2,"Aa","Via abc","Taiwan",3,123456);
        Assertions.assertEquals(0,museumComparator.compare(m1,m2));
    }

    @Test
    void museumComparatorBigger(){
        Museum m1 = new Museum(3,"Aa","Via abc","Taiwan",3,123456);
        Museum m2 = new Museum(2,"Aa","Via abc","Taiwan",3,123456);
        Assertions.assertEquals(1,museumComparator.compare(m1,m2));
    }
       @Test
    void museumComparatorLess(){
        Museum m1 = new Museum(1,"Aa","Via abc","Taiwan",3,123456);
        Museum m2 = new Museum(2,"Aa","Via abc","Taiwan",3,123456);
        Assertions.assertEquals(-1,museumComparator.compare(m1,m2));
    }
}
