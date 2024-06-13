//            1
//          2 2 2
//        3 3 3 3 3
//      4 4 4 4 4 4 4
//    5 5 5 5 5 5 5 5 5

class Pattern7 {

    public static void main(String... s) {
        System.out.println("Enter the number:- ");
        int num = new java.util.Scanner(System.in).nextInt();
        int a = 1;
        for (int i = 1; i <= num * 2; i++) {
            if (i % 2 != 0) {
                for (int j = num * 2; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(" " + a);

                }
                a++;

                System.out.println();
            }

        }
    }
}
