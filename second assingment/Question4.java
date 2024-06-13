class Question4
{
    public static void main(String...s)
    {
        System.out.println("enter the number you want factorial of:");
        int n = new java.util.Scanner(System.in).nextInt();
        int n1=n;
        for(int i=1;i<n;i++)
        {
            n1=n1*i;
        }
        System.out.println("factorial of " + n + " is " + n1 );
    }
}
