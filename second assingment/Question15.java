class Question15
{
    public static void main(String...s)
    {
    float a = 1;
    System.out.println("enter the number");
    int num = new java.util.Scanner(System.in).nextInt();
    for(int i=2;i<=num;i++)
    {
        a=a+(1/(float)(i));
    }
    System.out.println(a);
   }
}
