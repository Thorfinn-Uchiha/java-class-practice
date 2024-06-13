// ABCDE
// ABCD
// ABC
// AB
// A

class Pattern48 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            int A = 65;
            for (int j = num; j >= i; j--) {
                System.out.print((char) A);
                A++;
            }
            System.out.println();
        }
    }

}
