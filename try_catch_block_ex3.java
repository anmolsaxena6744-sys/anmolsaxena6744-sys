class Main {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }

        finally {
            System.out.println("Finally block executed");
        }
    }
}
