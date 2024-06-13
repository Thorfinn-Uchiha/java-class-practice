
class Question12 {

    public static void main(String... s) {
        // for (;;) {
        //     System.out.println("enter the number here:");
        //     int num = new java.util.Scanner(System.in).nextInt();
        //     for (;;) {
        //         System.out.println("do you want to enter other number also?");
        //         String ans = new java.util.Scanner(System.in).nextLine();
        //         if (ans.equals("y")) {
        //             break;
        //         } else {
        //             System.exit(0);
        //         }
        //     }

        int num, lar = 0, small = 0, i = 1;
        while (i > 0) {
            System.out.println("Enter a number");
            num = new java.util.Scanner(System.in).nextInt();
            if (num > lar) {
                lar = num;
                continue;
            } else if (small < num) {
                small = num;
                continue;
            }
            i++;
            System.out.println("Enter you choice do yo want to exit");
            char ch = new java.util.Scanner(System.in).nextLine().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                break;
            } else {
                continue;
            }
        }
        System.out.println("smallest= " + small);
        System.out.println("largest " + lar);
    }
}
