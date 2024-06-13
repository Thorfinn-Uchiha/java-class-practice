
class Temp {
//init block is always executed before any constructor.
//YOu can have more than one init block in a single class and they are executed in a order in which they are defined in the class.

    {
        System.out.println("i am init block");
    }

    Temp() {

        System.out.println("A");
        this(40);
        //if you have done constructor chaining then the complete code of intit block will be inserted into that constructor as first line in which you have not used this() as first line.
    }

    Temp(int x) {
        //if you have not done constructor chaining then the complete code of init block will be inserted into the every constructor of your class as a first line.
        System.out.println(x);
    }

    Temp(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        new Temp();
        new Temp(4, 5);
    }
}
