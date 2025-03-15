public class Ejercicio33 {
    public static void main(String[] args){
        System.out.println(mcd(36,20));

    }
    static int mcd(int a,int b){
        if (b==0){
            return a;
        }else{
            return mcd(b,a%b);
        }
    }
}
