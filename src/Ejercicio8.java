import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){

        System.out.println(ponerNota(3,4));

    }

    static  String ponerNota(double a,double b) {

        double promedio = (a + b) / 2;

        if (promedio >= 7) {
            System.out.println("Promociona");
        } else if (promedio <= 7 & promedio >= 4) {
            System.out.println("aprobado");
        } else if (promedio < 4) {
            System.out.println("debe recuperar");
        }
        return "";
    }
}
