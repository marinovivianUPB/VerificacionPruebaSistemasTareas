package ejercicios.mock2;

public class Prize {
    Check check;

    public void setCheck(Check check){
        this.check=check;
    }
    public int generatePrize(int num){
        if(num <=10){
            return check.isPrime(num) ? num*100 : num;
        } else{
            return check.isPrime(num) ? num*80 : 0;
        }
    }
}
