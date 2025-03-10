public class Ejercicio11 {
    public static void main(String[] args){

        int n=4;
        System.out.println(sumatoriaPares(n));
    }

    static int sumatoriaPares(int n){
        int sumaPares=0;
        for (int i = 2; i <=n; i++) {
            if (i%2==0){
                sumaPares+=i;
            }
        }
        return sumaPares;
    }
}
