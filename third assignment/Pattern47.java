// 55555
// 4444
// 333
// 22
// 1

class Pattern47 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
