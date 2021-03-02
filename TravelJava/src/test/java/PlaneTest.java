import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.LIGHTENINGSPEEDA320);
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, plane.getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(1000, plane.getWeight());
    }





}
