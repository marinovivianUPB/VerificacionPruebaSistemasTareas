package ejercicios.practicaPrimerParcial.ejercicio2;

public class Banco {

    ASFIStatic asfiStatic;

    public Banco(){
        this.asfiStatic = new ASFIStatic();
    }

    public void setAsfi(ASFIStatic asfiStatic) {
        this.asfiStatic = asfiStatic;
    }

    public String getMaximoPrestamo(String ci){
        String max = "";
        switch(ASFIStatic.getCategoria(ci)){
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