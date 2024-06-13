//making copy constructor   
class Temp4 
{
    int x;
    int y;

    Temp4(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void show()
    {
        System.out.println(x);
        System.out.println(y);
    }
    Temp4(Temp4 z) // This is the copy the copy constructor and here Temp4 z is an instance of type Temp4.
    {
        this.x=z.x;
        this.y=z.y;
    }
    public static void main(String...s)
    {
        Temp4 t1 = new Temp4(10,20);
        t1.show();
        Temp4 t2 = new Temp4(t1);
        t2.show();
    }

}


