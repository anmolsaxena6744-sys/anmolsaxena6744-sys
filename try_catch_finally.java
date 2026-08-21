class Main {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // Exception occurs
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        finally {
            System.out.println("Finally block is always executed");
        }
    }
}
