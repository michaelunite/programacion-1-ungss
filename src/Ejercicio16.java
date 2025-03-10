public class Ejercicio16 {
    public static void main(String[] args){

        String palabra="hola";
        System.out.println(reversa(palabra));

    }
    static String reversa(String text){
        StringBuilder nueva_palabra= new StringBuilder(" ");
        for (int i = text.length()-1; i>=0 ; i--) {

            nueva_palabra.append(text.charAt(i));
        }

        return nueva_palabra.toString();
    }
}
