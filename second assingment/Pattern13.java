//* * * * *
// * * * *
//  * * *
//   * *
//    *

class Pattern13 {

    public static void main(String... s) {
        System.out.println("enter the number of lines:-");
        int num = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = num + 1 - i; k >= 1; k--) {
                System.out.print(" *");
            }
            System.out.println();

        }

    }

}
