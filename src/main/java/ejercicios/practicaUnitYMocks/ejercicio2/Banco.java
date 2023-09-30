package ejercicios.practicaUnitYMocks.ejercicio2;

public class Banco {

    ASFI asfi;

    public Banco(){
        this.asfi = new ASFI();
    }

    public void setAsfi(ASFI asfi) {
        this.asfi = asfi;
    }

    public String getMaximoPrestamo(String ci){
        String max = "";
        switch(asfi.getCategoria(ci)){
            case "A":
                max="Maximo a prestar 200000";
                break;
            case "B":
                max="Maximo a prestar 100000";
                break;
            case "C":
                max="No se puede prestar ningun monto ALERTA!";
                break;
        }
        return max;
    }
}