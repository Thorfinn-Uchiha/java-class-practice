class Question3
{
    public static void main(String...s)
    {
        System.out.println("Enter the quantity");
        int quant = new java.util.Scanner(System.in).nextInt();
        if(quant>1000)
        System.out.println("total cost is: " + (int)(quant*100 -(quant*0.1*100) ));//why 10/100 is not working 
        else
        System.out.println("total cost is: " + (quant*100));
    }
}
