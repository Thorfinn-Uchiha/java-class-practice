// *****
// *  * 
// *  * 
// *  * 
// *****
class Pattern4
{
    public static void main(String...s)
    {
        int  num =5;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
            if(j==1||j==4)
            System.out.print("*");
            else if(i==1 || i==5)
            System.out.print("*");
            else
            System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
}
