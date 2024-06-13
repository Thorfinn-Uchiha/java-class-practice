// *-------*
//  *-----*
//   *---*
//    *-*
//     *

class Pattern26 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k >= 1; k--) {
                if (k == 2 * i - 1 || k == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
