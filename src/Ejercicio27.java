public class Ejercicio27 {
    public static void main(String[] args){
        int[] num={1,2,3};

        System.out.println(total(num));

    }
    static int total(int[] a){
        int suma=0;
        for (int i = 0; i < a.length; i++) {
            suma+=a[i];
        }
        return suma;
    }
}
