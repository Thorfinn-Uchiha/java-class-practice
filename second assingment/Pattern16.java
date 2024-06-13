//      *
//     * *
//    *   *
//   *     *
//  * * * * * * * * *

class Pattern16 {

    public static void main(String... s) {
        int num = 5;
        for (int i = 1; i <= 5; i++) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }

            if (i != num) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print(" *");
                    } else {
                        System.out.print(" ");
                        System.out.print(" ");
                    }
                }
            } else {
                for (int l = 1; l < 10; l++) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
