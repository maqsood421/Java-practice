public class VarArgs {
    
    static int varArgsFuncExp(int ...arr) {
        int sum = 0;

        for(int e: arr) {
            sum += e;
        } return sum;
    }

    public static void main(String[] args) {

        System.out.println("The sum of Nothing is: " + varArgsFuncExp());
        System.out.println("The sum of 3 is: " + varArgsFuncExp(3));
        System.out.println("The sum of 3 and 2 is: " + varArgsFuncExp(3, 2));
        System.out.println("The sum of 3, 1, and 2 is: " + varArgsFuncExp(3, 1, 2));
        System.out.println("The sum of 3, 5, 8 and 7 is: " + varArgsFuncExp(3, 5, 8, 7));
    }
}
