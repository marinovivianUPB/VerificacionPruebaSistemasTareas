package ejercicios;

public class Estudiante {
    String nombre;
    int nota;
    Estudiante(int nota, String nombre){
        this.nota=nota;
        this.nombre=nombre;
    }
    public String mensajePorNota(){
        if (nota<0){
            return "Nota incorrecta, ingresar nuevamente";
        } else if(nota<=70){
            return "Tienes que mejorar: "+nombre;
        } else if(nota<81){
            return "Bien: "+nombre;
        } else if(nota<91){
            return "Muy Bien: "+nombre;
        } else if(nota<=100){
            return "Excelente: "+nombre;
        } else{
            return "Nota incorrecta, ingresar nuevamente";
        }
    }
}