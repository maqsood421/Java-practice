class Abstract {
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();
    }
}

abstract class Parent {
    public void myName() {
        System.out.println("My name is Maqsood");
    }
    abstract public void greet();
    abstract public void sayHi();
}

class Child extends Parent {
    @override
    public void greet() {
        System.out.println("Hello,");
    }
}

class Child2 extends Parent {
    public void sayHi() {
        System.out.println("Hi, Maqsood!");
    }
}