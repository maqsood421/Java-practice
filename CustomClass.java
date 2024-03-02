class Student {
    String studentName;
    int studentId;

    public void printDetails() {
        System.out.println("My name is: " + studentName);
        System.out.println("My ID is: " + studentId);
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentName = "Maqsood";
        student.studentId = 38186;

        System.out.println("Name: " + student.studentName);
        System.out.println("ID: " + student.studentId);

        student.printDetails();
    }
}
