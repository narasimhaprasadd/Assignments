
public class Diamond {
    public static void main(String[] args) {
        create(6);
    }

    public static void create(int number) {
        Triangle triangle = new Triangle();

        triangle.designTriangle(number);
        createReverseBottom(number - 1);
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

