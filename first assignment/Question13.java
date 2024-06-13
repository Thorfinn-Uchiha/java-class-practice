class Question13 
{
    public static void main(String...s)throws java.io.IOException
    {
        System.out.println("Enter your age:");
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter your sex:");
        int se = System.in.read();
        char sex = (char)se;
        while (System.in.read() != '\n');
        System.out.println("Enter your marital status:");
        int m = System.in.read();                          //not reading marital input
        char marital = (char)m;
        if(sex=='f' || sex=='F')
        System.out.println("This employee will work only in urban areas");
        else if((sex=='m' || sex=='F') && age>20 && age<40)
        System.out.println("This employee may work anywhere");
        else if ((sex=='m' || sex=='M') && age>40 && age<60)
        System.out.println("This employee will work in urban areas only");
        else 
        System.out.println("ERROR!!");

    }
}
