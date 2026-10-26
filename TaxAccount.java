public class TaxAccount {
    
    private String accountNumber;
    private String taxpayerTin;
    private String taxType;
    private String accountStatus;

    public TaxAccount(String accountNumber, String taxpayerTin, String taxType, String accountStatus) {
        this.accountNumber = accountNumber;
        this.taxpayerTin = taxpayerTin;
        this.taxType = taxType;
        this.accountStatus = accountStatus;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTaxpayerTin() {
        return taxpayerTin;
    }

    public void setTaxpayerTin(String taxpayerTin) {
        this.taxpayerTin = taxpayerTin;
    }
    
    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

}
