class Pattern8
{
    public static void main(String[] args)
    {   int x=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
            x=(x%5)+1;
        }
       
    }
}