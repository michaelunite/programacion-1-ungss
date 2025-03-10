public class Ejercicio20 {
    public static void main(String[] args){
        String palabra="tenet";
        if (palabra.equals(esCapicua(palabra))){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }
    static String esCapicua(String palabra){
        String reversa="";
        for (int i =palabra.length()-1 ; i>=0 ; i--) {
            reversa=reversa+palabra.charAt(i);
        }
        return reversa;
    }
}
