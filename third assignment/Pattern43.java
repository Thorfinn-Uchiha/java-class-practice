// 54321
// 5432
// 543
// 54
// 5

class Pattern43 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
