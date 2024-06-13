
class Papa {

    A show() {
        System.out.println("A");
        return new A();
    }

}

class Beta extends Papa {

    B show() {
        System.out.println("B");
        super.show();
        return new B();
    }

    public static void main(String[] args) {
        Beta b1 = new Beta();
        b1.show();

    }
}

class A {

}

class B extends A {

}
