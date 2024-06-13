class Question9
{
    public static void main(String...s)
    {
        System.out.println("enter first number:-");
        int num1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("enter second number:-");
        int num2 = new java.util.Scanner(System.in).nextInt();
        int hcf =1;
        int i=2;
        while(true)
        {
            if(num1/i!=0 || num2/i!=0)
            {
                num1=num1/i;
                num2=num2/i;
                hcf = hcf*i;
                System.out.println("HCF of both number is " + hcf);
                i++;
            }
            else
            break;
        }
        System.out.println("HCF of both number is " + hcf);
    }
}