class Dada
{
   int x=80;
}
class Papa extends Dada
{
    int x=50;
}
class Beta extends Papa{
    //int y=20;
    int x=30;
    void show()
    {
        //System.out.println(y);
        //System.out.println(this);
        //System.out.println(((Papa)this));
        System.out.println(((Dada)this).x);
        System.out.println(((Papa)this).x);
        System.out.println(super.x);
        System.out.println(x);


    }
    public static void main(String...s)
    {
        Beta b = new Beta();
        b.show();
        System.out.println(((Dada)b).x);
    }
}
