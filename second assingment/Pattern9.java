class Pattern9
{
    public static void main(String...s)
    {
        System.out.println("Enter the number:- ");
        int num = new java.util.Scanner(System.in).nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=num-1;j>=i;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}