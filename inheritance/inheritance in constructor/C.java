
class A {

    A() {
        //here A checks for a parent which is nothing but Object class and no class is higher than Object class.
        System.out.println("A");
    }

    A(int x) {
        //here A checks for a parent which is nothing but Object class and no class is higher than Object class.
        System.out.println(x);
    }
}

class B extends A {

    B() {

        //here super is inserted by compiler implicitely and because of that constructor chain goes to A
        System.out.println("B");
    }

    B(int x) {
        super(99);
        //here super is inserted by compiler implicitely and because of that constructor chain goes to A
        System.out.println(x);
    }
}

class C extends B {

    C() {
        super(30);
        //this(10);
        System.out.println("C");
    }

    C(int x) {
        //here super is inserted by compiler implicitely and because of that constructor chain goes to B
        System.out.println(x);
    }

    public static void main(String[] args) {
        //new C();
        new C(20);

    }
}
