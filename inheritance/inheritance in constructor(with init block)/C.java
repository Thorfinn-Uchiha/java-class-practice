
class A {

    {
        System.out.println("this is init block of class A");
    }

    A() {
        //super()
        //init block will be pasted here after compilation
        System.out.println("A");
    }

}

class B extends A {

    {
        System.out.println("this is init block of class B");
    }

    B() {
        //super() will be placed here by compiler
        //init block will be pasted here after compilation
        System.out.println("B");
    }

    B(int x) {
        //super() will be placed here by compiler
        //init block will be pasted here after compilation
        System.out.println(x);
    }
}

class C extends B {

    {
        System.out.println("this is init block of class C");
    }

    C() {
        //super() will be placed here by compiler
        //init block will be pasted here after compilation by the compiler
        System.out.println("C");
    }

    C(int x) {
        super(10);
        //init block will be pasted here after compilation
        System.out.println(x);
    }

    public static void main(String[] args) {
        // new C();
        new C(70);

    }
}
