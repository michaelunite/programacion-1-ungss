public class Ejercicio22 {
    public static void main(String[] args)
    {
        String s="palabra";
        System.out.println(sinreptidos(s));
    }
    static String sinreptidos(String s){
        String nueva="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <s.length(); j++) {

                if (s.charAt(i)!=s.charAt(j)){
                    nueva=nueva+s.charAt(j);
                }
                
            }
        }
        return nueva;
    }
}
