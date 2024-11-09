class NotEligibleForVotingException extends Exception {
    public NotEligibleForVotingException(String message) {
        super(message);
    }
}

public class p6 {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new NotEligibleForVotingException("Student's age is less than 18, not cast his/her vote");
            } else {
                System.out.println("Eligible for voting.");
            }
        } catch (NotEligibleForVotingException e) {
            System.out.println(e.getMessage());
        }
    }
}
