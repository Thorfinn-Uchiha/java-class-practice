class Patter15
{
    public static void main(String...s)
    {
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=4;j++)
            {
                System.out.print(" " + (char)(65+j+i));
            }
            System.out.println();
        }
    }
}