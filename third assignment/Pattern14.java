class Pattern14
{
    public static void main(String...s)
    {
        for(int i=0;i<=4;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i+j)%2==1)
                {
                    System.out.print(" " + "1");
                }
                else
                {
                    System.out.print(" " + "0");
                }
            }
            System.out.println();
        }
    }
}