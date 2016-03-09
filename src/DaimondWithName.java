/**
 * Created by nprasad on 09/03/2016 AD.
 */
public class DaimondWithName {
    public static void main(String[] args) {
        create(10, "Simha");
    }

    public static void create(int number, String name) {
        createTop(number - 1);
        System.out.println(name);
        new DaimondWithName().createReverseBottom(number - 1);
    }

    public static void createTop(int number) {
        for (int outer = 1; outer < number * 2; outer += 2) {
            for (int inner = 1; inner < (number - (outer / 2) + 1); inner++) {
                System.out.print(" ");
            }
            for (int j = 0; j < outer; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    public static void createReverseBottom(int number) {
        for (int i = number * 2; i > 1; i -= 2) {
            for (int j = (number - (i / 2) + 1); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

