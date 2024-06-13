class Pattern18
{
    public static void main(String...s)
    {
        for(int i=1;i<=5;i++)
        {
            for (int j=4; j>=0; j--) 
            {
                System.out.print(" " + (char)(65+j));
            }
            System.out.println();
        }
    }
}