public class Ejercicio34 {
    public static void main(String[] args){
        String m="hola";

        String nueva="";

        for (int i = 0; i < m.length(); i++) {

            nueva+=m.charAt(i)+"*";
        }
        System.out.println(nueva);
    }
}
