public class Ejercicio32 {
    public static void main(String[] args) {

        System.out.println(collatz(6));

    }
    static float collatz(int n){
        if (n==1){
            return 1;
        }
        else {
            if (n%2==0){
               float resultado=collatz(n/2);
                System.out.println(""+n+"/2= "+n/2);
                return resultado;
            }
            else{
                float resultado=collatz(3*n+1);
            System.out.println(""+n+"*3+1="+(3*n+1)+"");
            return resultado;
        }
        }
    }
}
