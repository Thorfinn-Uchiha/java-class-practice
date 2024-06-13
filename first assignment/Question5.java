class Question5
{
    public static void main(String...s)
    {
        System.out.println("Enter your marks: ");
        int marks = new java.util.Scanner(System.in).nextInt();
        if(marks>80)
        System.out.println("A");
        else if(marks>60 && marks<=80)
        System.out.println("B");
        else if(marks>50 && marks<=60)
        System.out.println("C");
        else if(marks>45 && marks<=50)
        System.out.println("D");
        else if(marks>25 && marks<=45)
        System.out.println("E");
        else
        System.out.println("F");
    }
}
