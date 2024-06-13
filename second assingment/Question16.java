class Question16
{
    public static void main(String...s)
    {
    float a = 1;
    float b = 0;
    System.out.println("enter the number");
    int num = new java.util.Scanner(System.in).nextInt();
    for(int i=2;i<=num;i++)
    {
        if(i%2!=0)
        a=a+(1/(float)(i));
        else
        b=b-(1/(float)(i));
    }
    a=a+b;
    System.out.println(a);
   }
}
