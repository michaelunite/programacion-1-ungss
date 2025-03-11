public class Ejercicio28 {
    public static void main(String[] args){
        int[] n={1,2,8,4};
        System.out.println(ordenada(n));

    }

    static boolean ordenada(int[] a){
        for (int i = 0; i < (a.length)-1; i++) {
            if (a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }
}
