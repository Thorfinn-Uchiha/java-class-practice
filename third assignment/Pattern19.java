public class Pattern19 
{
    public static void main(String[] args) 
    {
        int x=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(" " + (char)(65+x));
                x++;
            }
            System.out.println();
        }
    }
}
