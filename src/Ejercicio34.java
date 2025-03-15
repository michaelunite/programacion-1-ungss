

public class Ejercicio34 {
    public static void main(String[] args){

        String n="hola";
        System.out.println(lo(n,n.length()-1));

    }
    static String lo(String a, int i){
        if (i<0){
            return "";
        }else {
            if (i==0){
                return lo(a, i-1)+a.charAt(i);
            }

        return lo(a, i-1)+"*"+a.charAt(i);
    }
    }
}
