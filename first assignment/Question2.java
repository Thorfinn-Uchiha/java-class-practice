class Question2
{
    public static void main(String...s)
    {
        System.out.println("Enter first number:-");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter second number:-");
        int b = new java.util.Scanner(System.in).nextInt();
        if(a>b)
        System.out.println(a +"is greater");
        else if (a==b)
        System.out.println("both "+ a + " and " + b + " equal");
        else
        System.out.println(b +"is greater");
    }
}