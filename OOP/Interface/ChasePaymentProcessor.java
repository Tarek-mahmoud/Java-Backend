
public class ChasePaymentProcessor implements PaymentProcessor, PaymentValidator {

    @Override
    public void processPayment(PaymentData payment) {
        /*
            String secureToken = ChaseApi.requestSecureTokenForApp();
            initPaymentPage(secureToken, payment.getPaymentAmount);
         */
    }

    @Override
    public boolean validatePayment(PaymentData payment) {
        // code to validate payment
        return false;
    }
}
