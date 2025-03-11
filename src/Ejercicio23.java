public class Ejercicio23 {
    public static void main(String[] args){

        String a="loca";
        String b="anana";
        String c="anana";

        System.out.println(puede(a,b,c));

    }
    static boolean puede(String a,String b,String c){
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(i)==b.charAt(i)){
                i++;
                for (int j =i; j <b.length() ; j++) {
                    if (c.charAt(j)==b.charAt(j)){
                        return true;
                    }
                    
                }
            }
            
        }
        return false;
    }
}
