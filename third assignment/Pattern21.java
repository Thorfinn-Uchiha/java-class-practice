// ABCDE
// abcde
// ABCDE
// abcde
// ABCDE

public class Pattern21 {

    public static void main(String... s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int A = 64;
                int a = 96;
                if (i % 2 == 1) {
                    System.out.print((char) (A + j));
                } else {
                    System.out.print((char) (a + j));
                }

            }
            System.out.println();
        }
    }
}
