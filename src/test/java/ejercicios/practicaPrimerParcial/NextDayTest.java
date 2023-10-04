package ejercicios.practicaPrimerParcial;

import ejercicios.Inverse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NextDayTest {
    @ParameterizedTest
    @CsvSource(
            {
                    "28,2,2003, 01/03/2003",
                    "28,2,2004, 29/02/2004",
                    "31,1,2003, 01/02/2003",
                    "31,12,2003, 01/01/2004",
                    "1,3,2003, 02/03/2003",
                    "31,10,2003, 01/11/2003",
                    "27,2,2004, 28/02/2004",
                    "27,7,2004, 28/07/2004",
                    "27,5,2004, 28/05/2004",
                    "27,8,2004, 28/08/2004",
                    "27,9,2004, 28/09/2004",
                    "14,3,2004, 15/03/2004",
                    "16,4,2004, 17/04/2004",
                    "14,5,2004, 15/05/2004",
                    "16,6,2004, 17/06/2004",
                    "14,7,2004, 15/07/2004"
            }
    )
    public void verifyNum(int day, int month, int year, String expected){
        NextDay next = new NextDay();
        Assertions.assertEquals(expected, next.nextDay(day, month, year), "ERROR: No devuelve fecha correcta");
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "28,Febrero,2003, 01/Marzo/2003",
                    "28,Febrero,2004, 29/Febrero/2004",
                    "31,Enero,2003, 01/Febrero/2003",
                    "31,Diciembre,2003, 01/Enero/2004",
                    "1,Marzo,2003, 02/Marzo/2003",
                    "31,Octubre,2003, 01/Noviembre/2003",
                    "27,Febrero,2004, 28/Febrero/2004",
                    "27,Julio,2004, 28/Julio/2004",
                    "27,Mayo,2004, 28/Mayo/2004",
                    "27,Agosto,2004, 28/Agosto/2004",
                    "27,Septiembre,2004, 28/Septiembre/2004",
                    "14,Marzo,2004, 15/Marzo/2004",
                    "16,Abril,2004, 17/Abril/2004",
                    "14,Mayo,2004, 15/Mayo/2004",
                    "16,Junio,2004, 17/Junio/2004",
                    "14,Julio,2004, 15/Julio/2004",
                    "16,Noviembre,2004, 17/Noviembre/2004"
            }
    )
    public void verifyNumString(int day, String month, int year, String expected){
        NextDay next = new NextDay();
        Assertions.assertEquals(expected, next.nextDay(day, month, year), "ERROR: No devuelve fecha correcta");
    }
}
