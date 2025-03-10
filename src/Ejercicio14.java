public class Ejercicio14 {
    public static void main(String[] args){
        int n=12;
        System.out.println(canCifras(n));

    }

    static int canCifras(int n){
        String cifras=String.valueOf(n);
        return cifras.length();
    }
}
