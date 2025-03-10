public class Ejercicio10 {
    public static void main(String[] args){
        System.out.println(sumatoria(3));
    }
    static int sumatoria(int n){
        int suma=0;
        for (int i = 1; i <=n; i++) {
            suma=suma+i;
        }

        return suma;

    }
}
