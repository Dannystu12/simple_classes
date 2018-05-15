import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void setup(){
        printer = new Printer(10, 10);
    }

    @Test
    public void hasSheets(){
        Printer defaultPrinter = new Printer();
        assertEquals(100, defaultPrinter.getSheets());
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void hasToner(){
        Printer defaultPrinter = new Printer();
        assertEquals(100, defaultPrinter.getToner());
        assertEquals(10, printer.getToner());
    }

    @Test
    public void testPrintSuccess(){
        printer.print(2, 5);
        assertEquals(0, printer.getSheets());
        assertEquals(0, printer.getToner());
    }

    @Test
    public void testPrintNoPaper(){
        printer.print(2, 5);
        assertEquals(0, printer.getSheets());
        assertEquals(0, printer.getToner());
    }

    @Test
    public void testPrintNoToner(){
        Printer printer = new Printer(100, 0);
        printer.print(2, 5);
        assertEquals(100, printer.getSheets());
        assertEquals(0, printer.getToner());
    }

    @Test
    public void testPrintNoSheets(){
        Printer printer = new Printer(0, 100);
        printer.print(2, 5);
        assertEquals(0, printer.getSheets());
        assertEquals(100, printer.getToner());
    }

    @Test
    public void testRefillPaper(){
        printer.refillPaper(90);
        assertEquals(100, printer.getSheets());
        assertEquals(10, printer.getToner());
    }

    @Test
    public void testRefillToner(){
        printer.refillToner(90);
        assertEquals(10, printer.getSheets());
        assertEquals(100, printer.getToner());
    }
}
