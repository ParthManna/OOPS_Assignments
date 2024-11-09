class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class p5 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]);
            if (number < 10 || number > 50) {
                throw new OutOfRangeException("Number is out of range.");
            } else {
                System.out.println("Square of " + number + " is " + (number * number));
            }
        } catch (OutOfRangeException e) {
            System.out.println("OutOfRangeException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No input provided. Please enter a number.");
        }
    }
}
