public class Ejercicio13 {
    public static void main(String[] args){
        int n=5;
        System.out.println(factorial(n));


    }

    static double factorial(int n){
        double total=1;
        for (int i = 1; i <=n; i++) {
            total=total*i;
        }
        return total;
    }
}
