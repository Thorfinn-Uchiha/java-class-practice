

class Question11
{
    public static void main(String...s)throws java.io.IOException
    {
        System.out.println("Enter the alphabet character:");
        int a = System.in.read();
        if(a<=90 && a>=65)
        System.out.println((char)a + " is uppercase");
        else if (a>=97 && a<=122)
        System.out.println((char)a + " is lowercase");
        else
        System.out.println("please enter a valid alphabet character!!");
    }
}