// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

public class Pattern14 {

    public static void main(String[] args) {
        System.out.println("enter the number of lines :-");
        int num = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
