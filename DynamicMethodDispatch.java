class DynamicMethodDispatch {
    public static void main(String[] args) {
        // SmartPhone p = new Phone(); // not allowed
        Phone p = new SmartPhone();
        p.on(); 
        p.func();
        // p.foo(); // not allowed
    }
}


class Phone {
    public void on() {
        System.out.println("Turning on phone...");
    }
    public void func() {
        System.out.println("Phone function");
    }
}

class SmartPhone extends Phone {
    public void on() {
        System.out.println("Turning on Smart Phone...");
    }

    public void foo() {
        System.out.println("Smart Phone function");
    }
}