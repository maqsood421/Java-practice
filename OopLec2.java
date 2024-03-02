import java.util.Scanner;

class OopLec2 {
    public static void main(String[] args) {

         Student student = new Student("John", 1);
         System.out.println("Student name is " + student.name + " and id is " + student.rollNo);
    }
}


class Area {

    double radius;
    double calcArea;
    double PI = 3.141;

    Scanner input = new Scanner(System.in);

    public void getRadius() {
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();
    }

    public void display() {
        calcArea = PI * radius * radius;
        System.out.println("The area of circle is: " + calcArea);
    }      
}


class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}


 