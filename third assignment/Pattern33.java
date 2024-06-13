// 1
// 01
// 010
// 0101
// 01010

class Pattern33 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print("1");
                } else if (j % 2 == 1) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

}
