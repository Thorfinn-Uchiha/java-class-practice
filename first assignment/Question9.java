class Question9
{
    public static void main(String...s) throws java.io.IOException
    {
        System.out.println("Enter number of class held:");
        float cheld = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter number of class attended:");
        float catt = new java.util.Scanner(System.in).nextInt();
        float percentage = (float)catt/cheld*100 ;
        System.out.println("percentage of class attended is: "+ percentage);
        if(percentage<75)
        {
            System.out.println("do you have medical cause?");
             int m = System.in.read();
             char medical =(char)m;
            if(medical=='Y' || medical=='y')
            System.out.println("Student is allowed to sit in exam");
            else
            System.out.println("Student is not allowed to sit in exam");
        }
       
        else
        System.out.println("Student is allowed to sit in exam");
    }
}