// 12345
// ABCDE
// 12345
// ABCDE
// 12345

class Pattern22 {

    public static void main(String... s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int A = 64;
                if (i % 2 == 1) {
                    System.out.print(j);
                } else {
                    System.out.print((char) (A + j));
                }

            }
            System.out.println();
        }
    }

}
