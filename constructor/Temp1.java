//in java you can also call a method at class level to intialize the data members of that class.

class Temp1
{
    int x=getX();
    int getX()
    {
    System.out.println(x);
    return 10;
    }
    Temp1()
    {
        x=0;
        x=getX();
        System.out.println(x);
    }
    public static void main(String...s)
    {
        Temp1 t = new Temp1();
        
    }
}
