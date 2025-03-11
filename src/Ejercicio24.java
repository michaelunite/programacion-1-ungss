public class Ejercicio24 {
    public static void main(String[] args){

        String a="banana";
        System.out.println(doblete(a));

    }

    static boolean capicua(String a){
        String b="";
        for (int i = a.length(); i >=0; i--) {
            b+=a.charAt(i);
            
        }
        if (b==a)
            return true;
        }
        else {
            return false;
        }
    }

    static boolean doblete(String s){
        for (int i = 0; i < s.length(); i++) {
            String primera=s.substring(0,i);
            String segunda=s.substring(i);

            if (capicua(primera) && capicua(segunda)){
                return true;
            }
        }
        return false;
    }
}
