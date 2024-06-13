
public class Arm500 {

    public static void main(String[] args) {
        int i, arm = 0;
        int rem;
        for (i = 1; i <= 500; i++) {
            rem = i % 10;
            arm = arm + rem * rem * rem;
            i = i / 10;
            System.out.println(arm);
        }
    }

}
