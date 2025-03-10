public class Ejercicio26 {
    public static void main(String[] args){

        int[] num={1,2,3,4,5};


    }
    static int maximoIndice(int[] a){
        int maximo=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>=maximo){
                maximo=a[i];
            }
        }
        return maximo;
    }
}
