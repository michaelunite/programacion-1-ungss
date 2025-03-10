import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1=scanner.nextInt();
        System.out.println("ingrese un numero");
        int num2=scanner.nextInt();
        System.out.println(imprimirPromedio(num1,num2));

    }
     static String imprimirPromedio(int num1, int num2){
        return (num1/2)+" "+(num2/2);

    }
}
