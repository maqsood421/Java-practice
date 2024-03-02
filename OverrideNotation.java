class OverrideNotation {
    public static void main(String[] args) {
        B b = new B(7, 8);
        b.method();
    }
}

class A {

    A() {
        System.out.println("This is default the constructor of A");
    }

    A(int x) {
        System.out.println("This is the constructor of A and the value of x is " + x);
    }

    public void method() {
        System.out.println("This is the method of class A");
    }
}

class B extends A {
    B() {
        System.out.println("This is the default constructor of B");
    }

    B(int x, int y) {
        super(x);
        System.out.println("This is the constructor of B and the value of y is " + y);
    }

    @Override  // override notation
    public void method() {
        System.out.println("This is the method of class B");
    }
}

