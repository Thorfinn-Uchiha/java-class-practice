class Question5
{
    public static void main(String...s)
    {
        System.out.println("Enter first number:");
        int n1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter second number:");
        int n2 = new java.util.Scanner(System.in).nextInt();
        int n3=n1;
        for(int i=1;i<n2;i++)
        {
            n3=n3*n1;
        }
        System.out.println(n1+" raise to the power " + n2+ " is "+n3);
    }
}