// 11111
// 2222
// 333
// 44
// 5

class Pattern45 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
