public class Ejercicio35 {
    public static void main(String[] args){

        String n="ohhholla";
        System.out.println(sinrepetidos(n));

    }
    static String sinrepetidos(String a) {
        String nueva = "";

        for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
            if (nueva.indexOf(c)==-1){
                nueva+=c;
            }
        }
        return nueva;
    }
}
