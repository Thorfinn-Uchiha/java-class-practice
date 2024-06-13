// EDCBA
// DCBA
// CBA
// BA
// A

public class Pattern51 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            int E = i;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (E + 64));
                E--;
            }
            System.out.println();
        }
    }

}
