public class LeftTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 2 * (rows - i); j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
