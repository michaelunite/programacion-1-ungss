public class Ejercicio15 {
    public static void main(String[] args){

        int a=12;
        int b=7;
        System.out.println(esDivisible(a,b));

    }
    static boolean esDivisible(int a,int b){
        return a % b == 0;
    }
}
