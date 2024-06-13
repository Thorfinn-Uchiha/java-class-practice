// AAAAA
// BBBB
// CCC
// DD
// E

class Pattern52 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            int A = i;
            for (int j = num; j >= i; j--) {
                System.out.print((char) (A + 64));
            }
            System.out.println();
        }
    }

}
