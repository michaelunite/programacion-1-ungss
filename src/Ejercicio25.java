public class Ejercicio25 {
    public static void main(String[] args){

        int[] numeros={1,2,7,4};
        System.out.println(maximo(numeros));

    }

    static int maximo(int[] numeros){
        int num_max=0;
        for (int i = 0; i <(numeros.length); i++) {

            if (numeros[i]>=num_max){
                num_max=numeros[i];
            }
            
        }
        return num_max;
    }
}
