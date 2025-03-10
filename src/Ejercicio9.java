public class Ejercicio9 {
    public static void main(String[] args){
        int dia=5;
        int mes=2;
        int ano=2030;
        System.out.println(imprimirFecha(dia,mes,ano));

    }

    static String imprimirFecha(int dia, int mes, int ano){

       String[] meses={"enero","febrero","marzo"};

       return dia+" "+meses[mes]+" "+ano;

    }
}
