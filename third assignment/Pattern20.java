class Pattern20
{
    public static void main(String...s)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<=4;j++)
            {
                if(i%2==1)
                {
                    System.out.print(" " + "*");
                }
                else
                {
                    System.out.print(" " + (char)(65+j));
                }
            }
            System.out.println();
        }
    }
}