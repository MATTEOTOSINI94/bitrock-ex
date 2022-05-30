import it.bitrock.comparator.PaintComparator;
import it.bitrock.ex.Paint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaintComparatorTest {
    PaintComparator paintComparator = new PaintComparator();
    @Test
    void paintComparatorEquals(){
     Paint paint1= new Paint(5,"Arturo","Romanticismo",1998);
     Paint paint2= new Paint(5,"Arturo","Romanticismo",1998);
     Assertions.assertEquals(0,paintComparator.compare(paint1,paint2));
    }
    @Test
    void paintComparatorBigger(){
     Paint paint1= new Paint(5,"Brturo","Romanticismo",1998);
     Paint paint2= new Paint(5,"Arturo","Romanticismo",1998);
     Assertions.assertEquals(1,paintComparator.compare(paint1,paint2));
    }
    @Test
    void paintComparatorLess(){
        Paint paint1= new Paint(5,"Arturo","Romanticismo",1998);
        Paint paint2= new Paint(5,"Brturo","Romanticismo",1998);
        Assertions.assertEquals(-1,paintComparator.compare(paint1,paint2));
    }

}
