// 1
// 23
// 456
// 78910
// 1112131415

class Pattern28 {

    public static void main(String... s) {
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }

}
