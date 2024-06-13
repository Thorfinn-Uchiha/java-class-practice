//checking whether prime number or not
class Question8 
{
    public static void main(String[] args)
    {
        System.out.println("enter the number:- ");
        int num = new java.util.Scanner(System.in).nextInt();
        int b=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
            b=1;
            break;
            }
            else
            b=0;
        } 
        if(b==1)
        {
            System.out.println(num + " is a not a prime number");
        }
        else
        System.out.println(num + " is a prime number");

           
    }
}
