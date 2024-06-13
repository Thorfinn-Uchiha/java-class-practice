class Question12
{
    public static void main(String...s)
    {
        System.out.println("Enter a year here:");
        int year = new java.util.Scanner(System.in).nextInt();
        if(year%100==0)
        {
            if(year%400==0)
            System.out.println(year + " is a leap year");
            else
            System.out.println(year + " is not a leap year");
        }
        else if(year%4==0)
        System.out.println(year + " is a leap year");
        else
        System.out.println(year + " is not a leap year");
        
    }
}