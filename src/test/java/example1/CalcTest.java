package example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalcTest {

    @Test
    public void verifyAdditionSameNumbers(){
        Calc calc = new Calc();
        int actualResult = calc.add(5,5);
        int expectedResult = 10;
        Assertions.assertEquals(expectedResult, actualResult, "ERROR: incorrect result");
    }

    @Test
    public void verifyAdditionDifferentNumbers(){
        Calc calc = new Calc();
        int actualResult = calc.add(5,4);
        int expectedResult = 9;
        Assertions.assertEquals(expectedResult, actualResult, "ERROR: incorrect result");
    }

    @Test
    public void verifyAdditionNegative(){
        Calc calc = new Calc();
        int actualResult = calc.add(-5,4);
        int expectedResult = -1;
        Assertions.assertEquals(expectedResult, actualResult, "ERROR: incorrect result");
    }

    @Test
    public void verifyDivZero() throws Exception {
        Calc calc = new Calc();
        Assertions.assertThrows(Exception.class, () -> {
            calc.div(4, 0);
        });
    }
}
