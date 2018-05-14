import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle wb;

    @Before
    public void setup(){
        wb = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, wb.getVolume());
    }

    @Test
    public void canEmpty(){
        wb.empty();
        assertEquals(0, wb.getVolume());
    }

    @Test
    public void canFill(){
        wb.empty();
        wb.fill();
        assertEquals(100, wb.getVolume());
    }

    @Test
    public void canDrink(){
        wb.drink();
        assertEquals(90, wb.getVolume());
        wb.empty();
        wb.drink();
        assertEquals(0, wb.getVolume());
    }
}
