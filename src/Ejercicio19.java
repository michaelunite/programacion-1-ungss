public class Ejercicio19 {
    public static void main(String[] args){
        String palabra="amor";
        System.out.println(abecedario(palabra));

    }
    static boolean abecedario(String palabra){

        palabra=palabra.toLowerCase();
        for (int i = 0; i < palabra.length()-1; i++){

            if (palabra.charAt(i)>palabra.charAt(i+1)){
                return  false;
            }
        }
        return true;
    }
}
