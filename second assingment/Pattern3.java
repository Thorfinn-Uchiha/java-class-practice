//*****
// *****
//  *****
//   *****
//    *****
class Pattern3
{
    public static void main(String...s)
    {
        System.out.println("enter the number of lines: ");  
        int num = new java.util.Scanner(System.in).nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int k=1;k<=i;k++)
            {
            System.out.print(" ");
            }

            for(int j=1;j<=num;j++)
            {
            System.out.print("*");
            }
            
            System.out.println("");
        }
        
    }
}