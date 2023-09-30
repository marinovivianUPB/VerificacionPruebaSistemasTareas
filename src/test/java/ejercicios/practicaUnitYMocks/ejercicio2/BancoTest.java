package ejercicios.practicaUnitYMocks.ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class BancoTest {
    ASFI asfiMock = Mockito.mock(ASFI.class);
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
        Mockito.when(asfiMock.getCategoria(ci)).thenReturn(categoria);
        Banco banco = new Banco();
        banco.setAsfi(asfiMock);
        String actual = banco.getMaximoPrestamo(ci);
        Assertions.assertEquals(expected, actual, "ERROR: categoria o prestamo incorrecto");
        Mockito.verify(asfiMock).getCategoria(ci);
    }
}
