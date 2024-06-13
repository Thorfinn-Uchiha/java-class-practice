//       *
//     * * *
//   * * * * *
//     * * *
//       *

class Pattern10 {

    public static void main(String... s) {
        System.out.println("Enter the number:- ");
        int num = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                if (num % 2 != 0) {
                    for (int j = num; j >= i; j--) {
                        System.out.print("t");
                    }
                } else {
                    for (int j = num - 1; j >= i; j--) {
                        System.out.print(" ");
                    }
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                for (int k = 0; k <= i + 1; k++) {
                    System.out.print(" ");
                }
                if (num % 2 != 0) {
                    for (int j = num - 1; j >= i + 1; j--) {
                        System.out.print(" *");
                    }
                } else {
                    for (int j = num - 2; j >= i + 1; j--) {
                        System.out.print(" *");
                    }
                }
                System.out.println();
            }
        }
    }
}
