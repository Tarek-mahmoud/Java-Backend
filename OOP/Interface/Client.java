
public class Client {

    private PaymentProcessor paymentProcessor;

    {
        paymentProcessor = new PayPalPaymentProcessor();
        // I can initialize variable of interface type with a reference to an object of any other class which implements this interface
    }

    public void checkout(PaymentData payment) {
        // some methods calls goes here
        paymentProcessor.processPayment(payment);
        PaymentProcessor.someStaticMethod();    // demo of static methods invocation
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
}
