package ejercicios.practicaPrimerParcial.ejercicio2;

import ejercicios.practicaUnitYMocks.ejercicio2.ASFI;
import ejercicios.practicaPrimerParcial.ejercicio2.Banco;
import mockExample.ServiceCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class BancoTest {


    @ParameterizedTest
    @CsvSource(
            {
                    "454566, A, Maximo a prestar 200000",
                    "999999, B, Maximo a prestar 100000",
                    "77777, C, No se puede prestar ningun monto ALERTA!",
                    "777778, B, Maximo a prestar 100000",
            }
    )
    public void verifyMaxPrestamo(String ci, String categoria, String expected){
        MockedStatic<ASFIStatic> asfiStatic = Mockito.mockStatic(ASFIStatic.class);
        asfiStatic.when(() -> ASFIStatic.getCategoria(ci)).thenReturn(categoria);
        ejercicios.practicaPrimerParcial.ejercicio2.Banco banco = new Banco();
        String actual = banco.getMaximoPrestamo(ci);
        Assertions.assertEquals(expected, actual, "ERROR: categoria o prestamo incorrecto");
        asfiStatic.close();
    }
}
