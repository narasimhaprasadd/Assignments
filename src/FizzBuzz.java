/**
 * Created by nprasad on 09/03/2016 AD.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(100);
    }

    private static void fizzBuzz(int n) {
        for (int count = 1; count <= n; count++) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(count);
            }
        }
    }
}

