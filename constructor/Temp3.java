//In java you can also make a method with the same name as your class name.
class Temp3
{
    Temp3()
    {
        System.out.println("default");
    }
    void Temp3()//This is method because we don't give any return type in constructor
    {
        System.out.println("This is method not constructor");
    }
    public static void main(String...s)
    {
        new Temp3();//This will call constructor Temp3 from Temp3()
        new Temp3().Temp3();//This will first call constructor Temp3 from Temp3() and Then it called void Temp3 which is a method.
    }
}