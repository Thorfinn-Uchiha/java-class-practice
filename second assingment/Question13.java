//armstrong numbers

class Question13 {

    public static void main(String[] args) {
        int num = 500;
        for (int i = 1; i <= num; i++) {
            // for three digit numbers
            if (i <= 500 && i >= 100) {
                int a = i % 10;//extracting last number
                a = a * a * a;
                int b = (i / 10) % 10;//extracting second number
                b = b * b * b;
                int c = i / 100;//extracting first number
                c = c * c * c;
                if (i == a + b + c) {
                    System.out.println(i);
                }
            } //for 2 digit numbers
            else if (i <= 99 && i >= 10) {
                int a = i % 10;//extracting last number
                a = a * a * a;
                int b = i / 10;//extracting first number
                b = b * b * b;

                if (i == a + b) {
                    System.out.println(i);
                }
            } //for 1 digit numbers
            else {
                int a = i;
                a = a * a * a;

                if (i == a) {
                    System.out.println(i);
                }
            }

        }
    }
}
