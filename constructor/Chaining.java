
class Chaining {

    {
        System.out.println("first init function");
    }

    Chaining() {
        this(1, 3);
        System.out.println("temp1");
    }

    Chaining(int x, int y) {
        this(10);
        System.out.println(x);
        System.out.println(y);

    }

    Chaining(int x) {
        System.out.println(x);
    }

    {
        System.out.println("second init function");
    }

    public static void main(String... s) {
        new Chaining();
    }
}
