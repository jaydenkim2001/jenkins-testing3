import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CalculatorTest {


    @Test
    public void addition(){
        Calculator Tester = new Calculator();

        assertEquals(7, Tester.add(2, 5), "2 + 5 is supposed to be 7!");
        //assertEquals(19, Tester.add(18, 12), "18 + 12 is supposed to be 30!"); //failed test
    }
    @Test
    public void subtraction(){
        Calculator Tester = new Calculator();

        assertEquals(15, Tester.subtract(30 , 15), "30 - 15 is supposed to be 15!");
        assertEquals(-5, Tester.subtract(8, 13), "8 - 13 is supposed to be -5!");
        //assertEquals(7, Tester.subtract(9, 6), "9 - 6 is supposed to be 3!"); //failed test
    }

    @Test
    public void multiplication(){
        Calculator Tester = new Calculator();

        assertEquals(48, Tester.multiply(6, 8), "6 * 8 is supposed to be 48!");
        assertEquals(0, Tester.multiply(18, 0), "18 * 0 is supposed to be 0!");
        //assertEquals(180, Tester.multiply(2, 85), "2 * 85 is supposed to be 170!"); //failed test
    }

    @Test
    public void division(){
        Calculator Tester = new Calculator();

        assertEquals(8, Tester.divide(96, 12), "96 / 12 is supposed to be 8!");
        assertEquals(0, Tester.divide(0, 42), "0 / 42 is supposed to be 0!");
        //assertEquals(7, Tester.divide(70, 7), "70 / 7 is supposed to be 10!"); //failed test
    }
}
