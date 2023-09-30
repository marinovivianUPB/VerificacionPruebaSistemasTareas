package ejercicios.practicaUnitYMocks.ejercicio1;

import ejercicios.Inverse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CheckPalindromeTest {
    @ParameterizedTest
    @CsvSource(
            {
                    "saippuakivikauppias, true",
                    "onomatopeya, false",
                    "ornitorrinco, false",
                    "rotavator, true",
                    "malayalam, true",
                    "jose, false",
                    "oro, true"
            }
    )
    public void verifyNum(String word, boolean expected){
        CheckPalindrome palindrome = new CheckPalindrome();
        Assertions.assertEquals(expected, palindrome.isPalindrome(word), "ERROR: No verifica si es palindromo correctamente");
    }
}
