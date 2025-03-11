public class Ejercicio32 {
    public static void main(String[] args) {
        int n = 6;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 != 0) {
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
    }
}
