import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        String text="la suma es ";
        text=text+numeros();
        System.out.println(text);

    }

    public static int numeros() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1=scanner.nextInt();
        System.out.println("ingrese un numero");
        int num2=scanner.nextInt();

        return num1+num2;
    }
}
