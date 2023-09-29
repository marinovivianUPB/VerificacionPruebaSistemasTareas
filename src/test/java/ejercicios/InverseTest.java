package ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class InverseTest {

    @ParameterizedTest
    @CsvSource(
            {
                    "9999, 9999",
                    "9998, 8999",
                    "9997, 7999",
                    "9876, 6789",
                    "5432, 2345",
                    "4562, 2654",
                    "150, 051",
                    "1, 1",
                    "-5, Not Valid",
                    "-100, Not Valid"
            }
    )
    public void verifyNum(int num, String expectedMessage){
        Inverse inv = new Inverse();
        Assertions.assertEquals(expectedMessage, inv.invertir(num), "ERROR: No revierte numero o no detecta fallas");
    }
}
