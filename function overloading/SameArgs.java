//Different return type and different data type
class SameArgs
{
    static void show(char a)
    {
        System.out.println("hi");
    }
    static int show(int a)
    {
        return a;
    }
    public static void main(String[] args) 
    {
        show('A');
        int z= show(20);
        System.out.println(z);
    }
}