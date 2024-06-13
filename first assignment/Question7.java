class Question7
{
    public static void main(String...s)
    {
        System.out.println("Enter the number:");
        int num = new java.util.Scanner(System.in).nextInt();
        if(num<0)
        System.out.println(-num);
        else
        System.out.println(num);
    }
}