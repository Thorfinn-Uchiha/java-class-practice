// ABCDE
// BCDE
// CDE
// DE
// E

class Pattern50 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= 5; i++) {
            int A = i;
            for (int j = num; j >= i; j--) {
                System.out.print((char) (A + 64));
                A++;
            }
            System.out.println();
        }
    }

}
