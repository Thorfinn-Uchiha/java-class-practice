class Question17
{
    public static void main(String...s)
    {
        System.out.println("fix a random number:");
        int num = new java.util.Scanner(System.in).nextInt();
        while(true)
        {
            System.out.println("enter your number:");
            int i= new java.util.Scanner(System.in).nextInt();
            if(i<num)
            {
                System.out.println("Too low, try again");
            }
            else if(i>num)
            {
                System.out.println("Too high,try again");

            }
            else 
            {
                System.out.println("Congratulations number matched!!");
                break;
            }
        
        }
    }
}
