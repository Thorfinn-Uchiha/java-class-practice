class Question4
{
    public static void main(String...s)
    {
        System.out.println("Enter salary of the employee: ");
        int salary = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter your year of service: ");
        int years = new java.util.Scanner(System.in).nextInt();
        if(years>5)
        System.out.println("net bonus amount is: " + (int)(salary*0.05));
        else
        System.out.println("net bonus amount is zero");

    }
}
