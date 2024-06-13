// *           *
// * *         * *
// * * *       * * *
// * * * *     * * * *
// * * * * *   * * * * *
// * * * * * * * * * * * *
// * * * * * * * * * * * *
// * * * * *   * * * * *
// * * * *     * * * *
// * * *       * * *
// * *         * *
// *           *

class Pattern20 {

    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            for (int k = num; k > i; k--) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" *");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int l = num; l >= i; l--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

}
