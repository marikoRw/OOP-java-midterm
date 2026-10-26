public class TaxPayer {
    
    private String taxpayerTin;
    private String taxpayerName;
    private int taxpayerAge;
    private String taxpayerPhone;
    private String taxpayerEmail;

    public TaxPayer(String taxpayerTin, String taxpayerName, int taxpayerAge, String taxpayerPhone, String taxpayerEmail) {
        this.taxpayerTin = taxpayerTin;
        this.taxpayerName = taxpayerName;
        this.taxpayerAge = taxpayerAge;
        this.taxpayerPhone = taxpayerPhone;
        this.taxpayerEmail = taxpayerEmail;
    }

    public TaxPayer(String taxpayerTin, String taxpayerName, int taxpayerAge) {
        this(taxpayerTin, taxpayerName, taxpayerAge, "Not provided", "Not provided");
    }

    public String getTaxpayerTin() {
        return taxpayerTin;
    }

    public void setTaxpayerTin(String taxpayerTin) {
        this.taxpayerTin = taxpayerTin;
    }

    public String getTaxpayerName() {
        return taxpayerName;
    }

    public void setTaxpayerName(String taxpayerName) {
        this.taxpayerName = taxpayerName;
    }

    public int getTaxpayerAge() {
        return taxpayerAge;
    }

    public void setTaxpayerAge(int taxpayerAge) {
        this.taxpayerAge = taxpayerAge;
    }

    public String getTaxpayerPhone() {
        return taxpayerPhone;
    }

    public void setTaxpayerPhone(String taxpayerPhone) {
        this.taxpayerPhone = taxpayerPhone;
    }

    public String getTaxpayerEmail() {
        return taxpayerEmail;
    }

    public void setTaxpayerEmail(String taxpayerEmail) {
        this.taxpayerEmail = taxpayerEmail;
    }

}
