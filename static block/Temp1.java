class Temp
{
    static Demo d;
    static 
    {
        d=new Demo();
    }
}
class Demo
{
    void show(int x)
    {
        System.out.println(x);
    }
}
class Temp1
{
    public static void main(String[] args) {
        Temp.d.show(10);
        System.out.println(10);

    }
}