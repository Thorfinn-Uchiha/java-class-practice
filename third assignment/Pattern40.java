// 1 2 3 4 5 
//   2      4
//     3      3
//       4      2
//         5 4 3 2 1

class Pattern40 {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++) {
                if (i == 1) {
                    System.out.print(j + " ");
                } else if (i == 5) {
                    System.out.print(num + 1 - j + " ");
                } else {
                    if (j == 1) {
                        System.out.print(i);
                    } else if (j == 5) {
                        System.out.print(num + 1 - i + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

}
