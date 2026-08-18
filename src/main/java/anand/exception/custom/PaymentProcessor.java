package anand.exception.custom;

public class PaymentProcessor {

    public void processPayment(String paymentDetails) throws PaymentProcessingException {
        try {
            // Processing logic here
        	
        	/* if Some condition indicating an error */
            if (true) {
                throw new PaymentProcessingException(500, "Internal Server Error: Unable to process payment");
            }
        } catch (Exception e) {
            throw new PaymentProcessingException("Error processing payment", e);
        }
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        try {
            processor.processPayment("paymentDetails");
        } catch (PaymentProcessingException e) {
            // Handle the exception
            System.out.println("Error Code: " + e.getErrorCode());
            e.printStackTrace();
        }
    }
}
