public class Ejercicio36 {
    public static void main(String[] args){

        System.out.println(prodCifras(2034));
        System.out.println(2034%10);

    }
    public static int prodCifras(int n){
        if (n==0){
            return 1;
        }
        int ultimacifra=n%10;
        if (ultimacifra==0){
                return prodCifras(n/10);
            }
            return ultimacifra*prodCifras(n/10);
    }
}
