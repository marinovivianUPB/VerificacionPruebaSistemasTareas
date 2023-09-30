package ejercicios.practicaUnitYMocks.ejercicio1;

public class CheckPalindrome {

    //Para unit tests sin mocks
    public boolean isPalindrome(String word){
        for(int i =0; i<word.length()/2;i++){
            if(word.charAt(i)!= word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
