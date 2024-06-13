//     1
//    212
//   32123
//  4321234
// 543212345

class Pattern12 {

    public static void main(String[] args) {
        System.out.println("enter the number here:");
        int num = new java.util.Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            int a = i;
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {

                System.out.print(a);
                a--;

            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

}
