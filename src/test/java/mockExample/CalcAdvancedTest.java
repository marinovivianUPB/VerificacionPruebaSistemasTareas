package mockExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalcAdvancedTest {

    ServiceCalc serviceCalcMock = Mockito.mock(ServiceCalc.class);
    @Test
    public void verifyFactorial(){
        Mockito.when(serviceCalcMock.mult(1,1)).thenReturn(1);
        Mockito.when(serviceCalcMock.mult(1,2)).thenReturn(2);
        Mockito.when(serviceCalcMock.mult(2,3)).thenReturn(6);
        CalcAdvanced calcAdvanced = new CalcAdvanced();
        calcAdvanced.setCalc(serviceCalcMock);
        int actual = calcAdvanced.getFactorial(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual, "ERROR: factorial incorrecto");
        Mockito.verify(serviceCalcMock).mult(1,1);
    }
}
