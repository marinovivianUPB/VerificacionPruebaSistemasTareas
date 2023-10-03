package mockExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CalcAdvancedStaticTest {
    @Test
    public void verifyFactorial() {
        // Create Mock
        MockedStatic<ServiceCalc> serviceCalcStaticMockedStatic = Mockito.mockStatic(ServiceCalc.class);
        // Create method - mock
        serviceCalcStaticMockedStatic.when(() -> ServiceCalc.times(1, 1)).thenReturn(1);
        serviceCalcStaticMockedStatic.when(() -> ServiceCalc.times(1, 2)).thenReturn(2);
        serviceCalcStaticMockedStatic.when(() -> ServiceCalc.times(2, 3)).thenReturn(6);

        CalcAdvanced calculatorAdvanced = new CalcAdvanced();
        int actualResult = calculatorAdvanced.getFactorial(3);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult, actualResult, "ERROR! el factorial generado es incorrecto");
    }
}
