public class Calculator {
    
    public static int add(int a, int b) {
        return a + b;
    }
    //the file is edited
    
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        }
        return a / b;
    }
    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        }
        return a / b;
    }
    
    public static int modulus(int a, int b) {
        return a % b;
    }
    
    public static double modulus(double a, double b) {
        return a % b;
    }
    
    public static void unaryOperators() {
        int x = 5;
        System.out.println("x: " + x);
        System.out.println("Post increment x++: " + (x++));
        System.out.println("After post-increment x: " + x);
        System.out.println("Pre increment ++x: " + (++x));
        System.out.println("Post decrement x--: " + (x--));
        System.out.println("After post decrement x: " + x);
        System.out.println("Pre decrement --x: " + (--x));
    }
    
    public static void operatorPrecedence() {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 100 / 10 / 2;
        
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("100 / 10 / 2 = " + result3);
    }
    
    public static void main(String[] args) {
        System.out.println("Addition (int): " + Calculator.add(10, 5));
        System.out.println("Addition (double): " + Calculator.add(10.5, 5.5));
        System.out.println("Subtraction (int): " + Calculator.subtract(10, 5));
        System.out.println("Multiplication (int): " + Calculator.multiply(10, 5));
        System.out.println("Division (int): " + Calculator.divide(10, 5));
        System.out.println("Modulus (int): " + Calculator.modulus(10, 3));
        
        System.out.println("\nUnary Operators");
        Calculator.unaryOperators();
        
        System.out.println("\nOperator Precedence");
        Calculator.operatorPrecedence();
    }
}
