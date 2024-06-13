// A
// BC
// CDE
// DEFG
// EFGHI

class Pattern34 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int a = 64 + i;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (a));
                a++;
            }
            System.out.println();
        }
    }

}
