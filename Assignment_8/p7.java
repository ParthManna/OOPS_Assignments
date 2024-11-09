public class p7 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Two numbers must be provided as arguments.");
            }
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer numbers.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
