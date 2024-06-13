class Question7
{
    public static void main(String...s)
    {
        System.out.println("Enter the set of integers:- ");
        int num = new java.util.Scanner(System.in).nextInt();
        int length = Integer.toString(num).length();
        int b = 0;
        int e = 0;
        int o = 0;
        for(int i=0;i<=length;i++)
        {
            b = num%10;
            num = num/10;
            if(b%2==0)
            {
                e = e + b;
            }
            else
            {
                o = o + b;
            }
        }

        System.out.println("sum of even numbers: " + e);
        System.out.println("sum of odd numbers: " + o);
    }
}

        // System.out.println("Enter the set of integers:");
        // int num = new java.util.Scanner(System.in).nextInt();
        // int e = 0; 
        // int o = 0; 
        // int b = 0;         
        // while (num != 0) {
        //     int b = num % 10; 
        //     num /= 10; 
            
        //     if (b % 2 == 0) {
        //         e += b; 
        //     } else {
        //         o += b; 
        //     }
        // }
        
        // System.out.println("Sum of even digits: " + e);
        // System.out.println("Sum of odd digits: " + o);