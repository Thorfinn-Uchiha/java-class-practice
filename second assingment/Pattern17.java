
class Pattern17 {

    public static void main(String... s) {
        int num = 5;
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                for (int l = 1; l < 10; l++) {
                    System.out.print("* ");
                }
            } else {

                for (int k = 2; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = num; j >= i; j--) {
                    if (j == num || j == i) {
                        System.out.print(" *");
                    } else {
                        System.out.print(" ");
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
