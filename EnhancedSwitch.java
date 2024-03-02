public class EnhancedSwitch {
    public static void main(String[] args) {
        int n = 1;
    
        switch(n) {
            case 0 -> System.out.print("This is zero");
            case 1 -> {
                System.out.println("This is 1");
                System.out.println("This is 1");
                System.out.println("This is 1");
            }
            default -> System.out.println("Default");
        }
    }
}