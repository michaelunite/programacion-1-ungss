public class Ejercicio29 {
    public static void main(String[] args){
        double[] n={1.2,2.2,3.4};
        System.out.println(promedio(n));
    }
    static double promedio(double[] n){
        double suma=0;
        for (int i = 0; i < n.length-1; i++) {
            suma+=n[i];
        }
        return suma/n.length;
    }
}
