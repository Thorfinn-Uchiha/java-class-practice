// 1
// 22
// 333
// 4444
// 55555

class Pattern23 {

    public static void main(String... s) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
