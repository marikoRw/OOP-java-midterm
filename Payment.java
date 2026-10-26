public class Payment {
    
    private String paymentId;
    private String declarationId;
    private double amountPaid;
    private String paymentMethod;

    public Payment(String paymentId, String declarationId, double amountPaid, String paymentMethod) {
        this.paymentId = paymentId;
        this.declarationId = declarationId;
        this.amountPaid = amountPaid;
        this.paymentMethod = paymentMethod;
    }
    
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getDeclarationId() {
        return declarationId;
    }

    public void setDeclarationId(String declarationId) {
        this.declarationId = declarationId;
    }
    
    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
