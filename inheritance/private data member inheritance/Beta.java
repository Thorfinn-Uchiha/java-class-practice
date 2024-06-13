class Papa
{
    private int x=10;
    void show()
    {
        System.out.println(x);
    }
}
class Beta extends Papa
{
    public static void main(String[] args) {
        Beta b = new Beta();
        b.show();
    }
}