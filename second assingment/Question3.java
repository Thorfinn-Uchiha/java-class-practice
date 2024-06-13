class Question3
{
    public static void main(String[] args) 
    {
        System.out.println("Please enter a positive integer:");
        int n = new java.util.Scanner(System.in).nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " X " + i +"=" + n*i);
        }
    }
}