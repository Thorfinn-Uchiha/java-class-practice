// 12345
// 1234
// 123
// 12
// 1

class Pattern42 {

    public static void main(String[] args) {

        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(num + 1 - j);
            }
            System.out.println();
        }
    }

}
