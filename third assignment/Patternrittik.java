
public class Patternrittik {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            int a = i;
            for (int l = 1; l <= i; l++) {
                System.out.print(a);
                a++;
            }
            int b = 2 * i - 2;
            for (int k = 1; k < i; k++) {
                System.out.print(b);
                b--;
            }
            System.out.println();
        }
        for (int i = num; i > 1; i--) {
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            int a = i - 1;
            for (int l = 1; l < i; l++) {
                System.out.print(a);
                a++;
            }
            int b = 2 * (i - 1) - 2;
            for (int k = 1; k < i - 1; k++) {
                System.out.print(b);
                b--;
            }
            System.out.println();
        }

    }

}
