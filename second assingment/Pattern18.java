//  1 2 3 4 5
//   2 3 4 5
//    3 4 5
//     4 5
//      5
//     4 5
//    3 4 5
//   2 3 4 5
//  1 2 3 4 5

class Pattern18 {

    public static void main(String... s) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            int a = i;
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = num; j >= i; j--) {
                System.out.print(" " + a);
                a++;
            }
            System.out.println();
        }
        int b = 1;

        for (int i = num; i > 1; i--) {
            int a = i;

            for (int k = num - 1; k > b; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= b; j++) {
                System.out.print(" " + (a - 1));
                a++;
            }
            b++;
            System.out.println();
        }

    }
}
