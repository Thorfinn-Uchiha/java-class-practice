
interface A {

    void show();
}

interface B extends A {

    void display();
}

class Child implements A, B {

    public void show() {
        System.out.println("show");
    }

    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {
        A a1 = new Child();
        a1.show();
        B b1 = new Child();
        b1.show();
        b1.display();
    }

}
