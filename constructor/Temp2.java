//If you want to initialize the data members of each object with the different different values than always use parameterised constructor
class Temp2
{
    int x,y;
    Temp2(int x ,int y)
    {
        this.x=x;
        this.y=y;
    }
    void show()
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String...s)
    {
        Temp2 t1 = new Temp2(10,20);
        t1.show();
        Temp2 t2 = new Temp2(100,200);
        t2.show();
    }
}
