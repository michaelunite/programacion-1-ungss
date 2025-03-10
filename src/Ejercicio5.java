import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        System.out.println("el promedio es "+(numeros()/2));

    }

    public static int numeros(){
        Scanner scanner=new Scanner(System.in);
        int suma=0;
        for (int i = 0; i < 2; i++) {
            System.out.println("ingrese un numero");
            int num=scanner.nextInt();
            suma=num+suma;
        }
        return suma;
    }
}
