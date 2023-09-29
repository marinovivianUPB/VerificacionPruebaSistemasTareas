package mockExample;

import javafx.concurrent.Service;

public class CalcAdvanced {

    String name = "calc x";
    ServiceCalc calc;
    public CalcAdvanced(){
        calc = new ServiceCalc();
    }

    public int getFactorial(int number){
        int f=1;
        for(int i=1; i<=number;i++){
            f=calc.mult(f,i);
        }
        return f;
    }

    public void setCalc(ServiceCalc calcService){
        this.calc = calcService;
    }
}
