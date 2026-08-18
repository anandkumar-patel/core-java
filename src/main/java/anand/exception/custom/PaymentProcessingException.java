package anand.exception.custom;

public class PaymentProcessingException extends Exception {

    private static final long serialVersionUID = 1L;

    // Additional fields specific to PaymentProcessingException
    private int errorCode;

    // Constructors
    public PaymentProcessingException(String message) {
        super(message);
    }

    public PaymentProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentProcessingException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public PaymentProcessingException(int errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    // Getter for errorCode
    public int getErrorCode() {
        return errorCode;
    }
}
