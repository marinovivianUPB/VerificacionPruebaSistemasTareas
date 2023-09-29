package ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EstudianteTest {

    @ParameterizedTest
    @CsvSource(
            {
                "-1, 'Nota incorrecta, ingresar nuevamente'", "101,'Nota incorrecta, ingresar nuevamente'",
                    "0, Tienes que mejorar: Juan"
            }
    )
    public void verifyMessage(int nota, String expectedMessage){
        Estudiante est = new Estudiante(nota, "Juan");
        Assertions.assertEquals(expectedMessage, est.mensajePorNota(), "ERROR: no detecta notas incorrectas");
    }
}
