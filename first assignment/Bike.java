class Bike
{
    String bno,name;
    int days,charge;
    void get()
    {
        System.out.println("enter bike no:");
        bno=new java.util.Scanner(System.in).nextLine();
        System.out.println("enter customer name:");
        name=new java.util.Scanner(System.in).nextLine();
        System.out.println("enter number of days bike is taken on rent:");
        days=new java.util.Scanner(System.in).nextInt();
    }
    void display()
    {
        if(days<=5)
        charge=500*days;
        else if(days<10)
        charge=(500*5)+(400*(days-5));
        else
        charge=(500*5)+(400*5)+(200*(days-10));
        System.out.print("Bike No.\t\t");
        System.out.print("Name \t\t");
        System.out.print("No. of days \t\t");
        System.out.println("Charge");
        System.out.print(bno + "\t\t");
        System.out.print(name + "\t\t");
        System.out.print(days + "\t\t\t\t");
        System.out.print(charge + "\t\t");

        
    }
    public static void main(String...s)
    {
        Bike b1 = new Bike();
        b1.get();
        b1.display();
    }
}