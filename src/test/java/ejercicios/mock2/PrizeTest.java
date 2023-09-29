package ejercicios.mock2;

import mockExample.CalcAdvanced;
import mockExample.ServiceCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class PrizeTest {
    Check checkMock = Mockito.mock(Check.class);
    @ParameterizedTest
    @CsvSource(
            {
                    "2, true, 200",
                    "9, false, 9",
                    "13, true, 1040",
                    "15, false, 0",
                    "75, false, 0",
                    "100, false, 0",
            }
    )
    public void verifyFactorial(int a, boolean value, int expected){
        Mockito.when(checkMock.isPrime(a)).thenReturn(value);
        Prize prize = new Prize();
        prize.setCheck(checkMock);
        int actual = prize.generatePrize(a);
        Assertions.assertEquals(expected, actual, "ERROR: premio incorrecto");
        Mockito.verify(checkMock).isPrime(a);
    }
}
