public class Recurrsion {
    
    static int fibSeries(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return fibSeries(n - 2) + fibSeries(n - 1);
    }


    static void pattern1(int n) {
        if(n > 0) {
            
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            } 
            System.out.println(); // new line

            pattern1(n - 1);
        }
    }

    static void pattern2(int n) {
        
        if(n > 0) {
            pattern2(n - 1);

            for(int i = 0; i < n; i++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    public static void main(String [] args) {
        int n = 10;

        System.out.println(fibSeries(n));
        pattern1(n);
        System.out.println("\n");
        pattern2(n);
    }
}