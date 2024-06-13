class Pattern16
{
    public static void main(String...s)
    {
        for(int i=0;i<=4;i++)
        {
            for(int j=4;j>=0;j--)
            {
                System.out.print(" " + (char)(65+i+j));
            }
            System.out.println();
        }
    }
}