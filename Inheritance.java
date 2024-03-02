class Base {
    
    int x;

    public void setX(int x) {
        this.x = x;
    }
    
    public int getX() {
        return x;
    }

    public void printMe() {
        System.out.println("This is a Constructor");
    }
}


class Derived extends Base {
    int y;

    public void setY(int y) {
        this.y = y;
    }
    
    public int getY() {
        return y;
    }

}


class Inheritance {

    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(4);

        System.out.println(d.getX());
    }
}

            

