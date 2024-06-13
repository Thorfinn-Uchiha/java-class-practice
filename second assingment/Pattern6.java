//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *

class Pattern6 {

    public static void main(String... s) {
        System.out.println("Enter the number:- ");
        int num = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= num * 2; i++) {
            if (i % 2 != 0) {
                for (int j = num * 2; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
