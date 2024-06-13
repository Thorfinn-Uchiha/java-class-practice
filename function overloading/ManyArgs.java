//many arguments but same return type 
class ManyArgs
{
    static void show()
    {
        System.out.println("zero arguments");
    }
    static void show(int a)
    { 
        System.out.println("one argument");
    }
    static void show(int a , int b)
    {
        System.out.println("two arguments");
    }
    static void show(int a , int b ,int c)
    {
        System.out.println("three arguments");
    }
    public static void main(String[] args)
    {
        show();
        show(10);
        show(10,10);
        show(10,10,10);
    }
}