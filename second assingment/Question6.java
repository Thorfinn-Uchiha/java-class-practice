class Question6
{
    public static void main(String...s)
{
        System.out.println("enter the number to be reversed:- ");
        int num = new java.util.Scanner(System.in).nextInt();
        int rnum = 0;
        int c = 0;
        while(num!=0)
        {
            c = num%10;//extract last digit from num eg:- 5 from 12345
            num = num/10;// remove last digit from num eg:- 5 from 1234 
            rnum = rnum*10 + c;
        }
        System.out.println("reversed number:- " + rnum);
        
}
}