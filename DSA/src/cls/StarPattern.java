package cls;

public class StarPattern {
    public static void main(String[] args) {
        // number of rows
        int rows = 5;

        // outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // inner loop for columns
            for (int j = 1; j <= i; j++) {
                // print star
                System.out.print("* ");
            }

            // new line
            System.out.println();
        }
    }
}
