class Pattern17
{
    public static void main(String...s)
    {
        for(int i=4;i>=0;i--)
        {
            for(int j=0;j<=4;j++)
            {
                System.out.print(" " + (char)(65+i));
            }
            System.out.println();
        }
    }
}