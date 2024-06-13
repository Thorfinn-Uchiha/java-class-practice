//* * * * *
// * * * *
//  * * *
//   * *
//    *
//    *
//   * *
//  * * *
// * * * *
//* * * * *

class Pattern15 {

    public static void main(String[] args) {
        System.out.println("enter the number of lines:");
        int num = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = num; k >= i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }

}
