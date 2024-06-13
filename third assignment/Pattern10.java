class Pattern10
{
    public static void main(String...s)
    {   int x=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(x%2==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(x);
                }
            }
            x++;
            System.out.println();
        }
    }
}