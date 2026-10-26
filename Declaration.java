public class Declaration {
    
    private String declarationId;
    private String accountNumber;
    private double taxableAmount;
    private double declaredTax;

    public Declaration(String declarationId, String accountNumber, double taxableAmount, double declaredTax) {
        this.declarationId = declarationId;
        this.accountNumber = accountNumber;
        this.taxableAmount = taxableAmount;
        this.declaredTax = declaredTax;
    }

    public double calculateTax(double amount) {
        return amount * 0.18;
    }

    public double calculateTax(double amount, double rate) {
        return amount * rate;
    }
    
    public String getDeclarationId() {
        return declarationId;
    }
    public void setDeclarationId(String declarationId) {
        this.declarationId = declarationId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(double taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public double getDeclaredTax() {
        return declaredTax;
    }

    public void setDeclaredTax(double declaredTax) {
        this.declaredTax = declaredTax;
    }

}
