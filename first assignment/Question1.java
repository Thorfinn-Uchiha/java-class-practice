class Question1
{
    public static void main(String...s)
    {
    System.out.println("Enter length of the rectangle:-");
    int l= new java.util.Scanner(System.in).nextInt();
    System.out.println("Enter breadth of the rectangle:-");
    int b= new java.util.Scanner(System.in).nextInt();
    if(l==b)
    System.out.println("It is a square");
    else
    System.out.println("It is not a square");
    }
}