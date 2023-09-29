package ejercicios;

public class Inverse {

    public String invertir(int num){
        if(num<0){
            return "Not Valid";
        }
        String actualNum = ((Integer) num).toString();
        String newNum="";
        for(int i=0; i<actualNum.length();i++){
            char aux = actualNum.charAt(i);
            newNum=aux+newNum;
        }
        return newNum;
    }
}
