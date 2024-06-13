// EDCBA
// EDCB
// EDC
// ED
// E

class Pattern49 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            int E = 69;
            for (int j = num; j >= i; j--) {
                System.out.print((char) E);
                E--;
            }
            System.out.println();
        }
    }

}
