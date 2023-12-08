package inheritance;

/**
 *
 * @author yasin
 */
public class pascle {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        int space = n;

        for (int i = 0; i < n; i++) {

            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            space--;
            System.out.println("");
        }

    }
}
