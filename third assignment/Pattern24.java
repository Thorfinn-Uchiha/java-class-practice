// 1
// 23
// 345
// 4567
// 56789

class Pattern24 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int a = i;
            for (int j = 1; j <= i; j++) {

                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }

}
