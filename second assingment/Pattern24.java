//       *       * 
//     * * *     * * *
//   * * * * *   * * * * *
// * * * * * * * * * * * * * *

class Pattern24 {

    public static void main(String... s) {
        int num = 4;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            for (int l = num; l > i; l--) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
