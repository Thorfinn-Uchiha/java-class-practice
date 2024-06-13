class Pattern13
{
    public static void main(String...s)
    {  
        for(int i=0;i<5;i++)
         {  
             for(int j=5;j>=1;j--)
             {
                 System.out.print(j+i);

             }
            
             System.out.println();
         }
        //.....................This is what I did at first......................................
        // int x=5;
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print(x);
        //         x--;
        //     }
        //     x=6+x;
        //     System.out.println();
        // }
    }
}