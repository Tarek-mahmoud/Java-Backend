
public interface PaymentProcessor {

        int RETRY_ATTEMPTS = 5;
        // public static final

        void processPayment(PaymentData payment);
        // public abstract

        default void someDefaultMethods() {
            System.out.println("This is the default method");
            // Default methods enable you to add new functionality to the interfaces of your libraries and ensure binary
            // compatibility with code written for older versions of those interfaces.
        }

        static void someStaticMethod() {
            System.out.println("This is the static method");
        }
}
