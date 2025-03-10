public class Ejercicio22 {
    public static void main(String[] args)
    {
        String s="palabra";
        System.out.println(sinreptidos(s));
    }
    static String sinreptidos(String s){
        String nueva="";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if (nueva.indexOf(c)==-1){
                nueva+=c;
            }
        }
        return nueva;
    }
}
