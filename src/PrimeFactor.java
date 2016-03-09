import java.util.ArrayList;

public class PrimeFactor {

    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(30));


    }

    private static ArrayList generate(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

        return primeFactors;
    }
}