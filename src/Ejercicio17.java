public class Ejercicio17 {
    public static void main(String[] args){
        char b='e';
        String text="see";
        System.out.println(cantidadAparecidas(text,b));

    }

    static int cantidadAparecidas(String text,char b){
        int cantidad=0;

        for (int i =0; i <text.length(); i++) {
            if (b==text.charAt(i)){
                cantidad++;
            }

        }
        return cantidad;
    }
}
