//      *
//     * *
//    *   *
//   *     *
//  *       *
//   *     *
//    *   *
//     * *
//      *

class Pattern19 {

    public static void main(String... s) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = num - 1; k >= i; k--) {
                if (k == num - 1 || k == i) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
