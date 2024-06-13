//     *
//    ---
//   *****
//  -------
// *********
//  -------
//   *****
//    ---
//     *

class Pattern21 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");

                }
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                if (i % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");

                }
            }
            System.out.println();
        }
    }
}
