public class Ejercicio21 {
    public static void main(String[] args){
        String s="holao";
        System.out.println(esSinRepetidos(s));
    }

    static boolean esSinRepetidos(String s){

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)){
                    return false;
                }
            }

        }
        return false;
    }
}
