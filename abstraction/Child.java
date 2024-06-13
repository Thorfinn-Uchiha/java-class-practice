
abstract class Base {

    int x;
    int y;

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

    abstract void display();
}

class Myregister {

    void register(Base b) {
        b.display();
    }
}

class Child extends Base {

    int x;
    int y;

    void get(int x, int y) {
        this.x = x;
        this.y = y;

    }

    void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.get(10, 20);
        c1.show();
        // Base b1 = new Child();
        // b1.display();
        // b1.show();
        // Myregister mr = new Myregister();
        // mr.register(c1);

    }
}
