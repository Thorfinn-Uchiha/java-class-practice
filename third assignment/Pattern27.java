// 1
// 32
// 543
// 7654
// 98765

class Pattern25 {

    public static void main(String... s) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            int a = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a--;
            }
            System.out.println();
        }
    }
}
