// *****
// ****
// ***
// **
// *

class Pattern8 {

    public static void main(String... s) {
        System.out.println("enter the number");
        int num = new java.util.Scanner(System.in).nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
