// A
// AB
// ABC
// ABCD
// ABCDE

class Pattern29 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int a = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (a));
                a++;
            }
            System.out.println();
        }
    }

}
