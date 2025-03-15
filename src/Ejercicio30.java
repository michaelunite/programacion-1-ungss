
public class Ejercicio30 {
    public static void main(String[] args){
        int num=3;
        System.out.println(sumatoria(num));

        //EJERCICIO B

        System.out.print("la suma de los numeros pares es:");
        System.out.println(SumatoriaPares(6));

        //EJERCICIO C
        System.out.println("ejecicio c");
        System.out.println(potencia(2,4));

        //EJERCICIO D

        System.out.println("el factorial de 6 es: "+factorial(5));

        System.out.println(resta(6));
    }

    static int sumatoria(int n){
        if (n==0){
            return 0;
        }
        else {
            int resultado =n+sumatoria(n-1);
            System.out.println("("+n+"+"+(n-1)+")="+ resultado );
            return resultado;
        }
    }

    //EJERCICIO B
     static int SumatoriaPares(int n) {
         if (n == 0) {
             return 0;
         }
         if (n % 2 != 0) {
             return SumatoriaPares(n - 1);
         }
         int resultado = n + SumatoriaPares(n - 2);
         System.out.println("sumaPares(" + n + " + ("+(n-1)+") = " + resultado);
         return resultado;
     }

     // EJERCICIO C

    static int potencia(int x,int a){
        if (a==0){
            return 1;
        }
            int total=x*potencia(x,a-1);
            System.out.println("("+x+")=("+(a-1)+")");
            return total;
    }

    //EJERCICIO D
    static int factorial(int n){
        if (n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    static int resta(int a){
        if (a==0){
            return 0;
        }
        else {
            if (a%2!=0){
                return resta(a-1);
            }
            int p=a+resta(a-2);
            System.out.println(a);
            return p;

        }
    }
}
