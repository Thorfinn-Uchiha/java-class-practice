//     * 
//    - -
//   * * *
//  - - - -
// * * * * *
//  - - - -
//   * * *
//    - -
//     *

class Pattern23 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

    }

}
