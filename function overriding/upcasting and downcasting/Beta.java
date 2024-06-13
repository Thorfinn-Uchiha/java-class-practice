
class Papa {

    int x = 20;

    void show() {
        System.out.println("Papa");
    }

    void display() {
        System.out.println("display");
    }
}

class Beta extends Papa {

    int x = 30;

    void show() {
        System.out.println("Beta");
    }

    public static void main(String[] args) {
        Papa p1 = new Beta();//upcasting
        p1.show();
        Beta b1 = (Beta) p1;//downcasting
        b1.show();
        p1.display();
        System.out.println(p1.x);
        System.out.println(b1.x);
    }
}
