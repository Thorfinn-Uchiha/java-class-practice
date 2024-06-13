//one args but different data type 
class DifferentArgs
{
    static void show()
    {
        System.out.println("first method call");
    }
    static void show(int a , long b)
    {
        System.out.println("2nd method call");
    }
    static void show (long a, int b)
    {
        System.out.println("3rd method call");
    }
    public static void main(String...s)
    {
        
       // show(10,10); .................this show error because in this both second and third fuctions are behaving same for this call.
       show();
       show(10,10l);
       show(10l,10);

    }
}
