class Question6
{
    public static void main(String...s)
    {
        System.out.println("Enter age of first person: ");
        int person1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter age of Second person: ");
        int person2 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Enter age of third person: ");
        int person3 = new java.util.Scanner(System.in).nextInt();

        if(person1<person2 && person1<person3) 
        {
        System.out.println("first person is the youngest");
        if(person2>person3)
        System.out.println("second person is oldest");
        else
        System.out.println("third person is the oldest");
        }

        else if(person2<person1 && person2<person3) 
        {
        System.out.println("second person is the youngest");
        if(person1>person3)
        System.out.println("first person is oldest");
        else
        System.out.println("third person is the oldest");
        }

        else 
        {
        System.out.println("third person is the youngest");
        if(person1>person2)
        System.out.println("first person is oldest");
        else
        System.out.println("second person is the oldest");
        }

    }
}