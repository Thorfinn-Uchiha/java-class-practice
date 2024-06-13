class Pattern9
{
    public static void main(String[] args)
    {   char alpha = 'A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(alpha);
                alpha++;
            }
            alpha='A';
            System.out.println();
        }
    }
}
