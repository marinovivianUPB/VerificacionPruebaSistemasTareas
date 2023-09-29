package example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcParamTest {
    @ParameterizedTest
    @CsvSource(
            {
                    "2,2,4",
                    "3,3,6",
                    "-5,4,-1",
                    "-4,-3,-7"
            }
    )
    public void verifyAddition(int numA, int numB, int expectedResult){
        Calc calc = new Calc();
        int actualResult = calc.add(numA,numB);
        Assertions.assertEquals(expectedResult, actualResult,"ERROR: incorrect result");
    }
}
