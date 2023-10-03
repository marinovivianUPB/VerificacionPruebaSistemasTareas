package mockExample;

public class ServiceCalc {

    public int add(){
        return 0;
    }

    public int mult(int a, int b){
        return 0;
    }

    public static int add(int a, int b ){
        return 0;
    }
    public static int subs(int a, int b) {
        return 0;
    }
    public static int times(int a, int b ){
        System.out.println(" *-***** usando metodo real -********");
        return a*b*-1;
    }
    public static int div(int a, int b ){
        return 0;
    }
}
