class Question14 
{
    public static void main(String[] args) {
        System.out.print("Enter the number of terms: ");
        int n = new java.util.Scanner(System.in).nextInt();;
        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(n);
    }
}
    

