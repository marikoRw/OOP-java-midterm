import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        TaxPayer[] taxPayers = new TaxPayer[5];
        int taxpayerCount = 0;

        TaxAccount[] taxAccounts = new TaxAccount[5];
        int taxAccountCount = 0;

        Declaration[] declarations = new Declaration[5];
        int declarationCount = 0;

        Payment[] payments = new Payment[5];
        int paymentCount = 0;

        int choice = -1;

        do {
            System.out.println("================ Welcome to RRA Tax Management System =================");
            System.out.println(" Please select an option: ");
            System.out.println("1: Register taxpayer");
            System.out.println("2: Register tax account");
            System.out.println("3: Submit declaration and calculate tax");
            System.out.println("4: Make Payment");
            System.out.println("5: View taxpayer tax summary");
            System.out.println("0: Exit");
            choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {

                case 0:
                    System.out.println("Thank you for using the system!");
                    break;

                case 1:
                    System.out.println("Registering a taxpayer");

                    // tin
                    String taxpayerTin = "";
                    while (taxpayerTin.isEmpty()) {
                        System.out.println("Enter a taypayer Tin");
                        taxpayerTin = scanner.nextLine().trim();
                    }
                    boolean duplicateTin = false;
                    for (int i = 0; i < taxpayerCount; i++) {
                        if (taxPayers[i].getTaxpayerTin() == taxpayerTin) {
                            duplicateTin = true;
                            break;
                        }
                    }
                    if(duplicateTin) {
                        System.out.println("Rejection: Duplicate Taxpayer Tin.");
                        break;
                    }

                    // name
                    String taxpayerName = "";
                    while (taxpayerName.isEmpty()) {
                        System.out.println("Enter a taypayer Name");
                        taxpayerName = scanner.nextLine().trim();
                    }
                    boolean duplicateName = false;
                    for (int i = 0; i < taxpayerCount; i++) {
                        if (taxPayers[i].getTaxpayerName() == taxpayerName) {
                            duplicateTin = true;
                            break;
                        }
                    }
                    if(duplicateName) {
                        System.out.println("Rejection: Duplicate Taxpayer Name.");
                        break;
                    }

                    // age
                    int taxPayerAge = 0;
                    while (taxPayerAge < 18) {
                        try {
                            System.out.print("Enter Taxpayer Age (18): ");
                            taxPayerAge = Integer.parseInt(scanner.nextLine().trim());
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number.");
                        }
                    }

                    // phone
                    String taxpayerPhone = "";
                    while (taxpayerPhone.isEmpty() || taxpayerPhone.length() != 10) {
                        try {
                            System.out.print("Enter Customer phone number (18-100): ");
                            taxpayerPhone = scanner.nextLine().trim();
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number with 10 digits.");
                        }
                    }
                    
                    // email
                    String taxpayerEmail = "";
                        while (!taxpayerEmail.contains("@") || !taxpayerEmail.contains(".")) {
                            System.out.print("Enter Customer TaxpataxpayerEmail: ");
                            taxpayerEmail = scanner.nextLine().trim();
                        }

                    taxPayers[taxpayerCount++] = new TaxPayer(taxpayerTin, taxpayerName, taxPayerAge, taxpayerPhone, taxpayerEmail);
                    System.out.println("Success: Taxpayer registered."); 
                    break;

                case 2:
                    System.out.println("Registering a tax account");

                    // number
                    String taxAccountNumber = "";
                    while (taxAccountNumber.isEmpty()) {
                        System.out.println("Enter a taxAccount Number");
                        taxAccountNumber = scanner.nextLine().trim();
                    }
                    boolean duplicateNumber = false;
                    for (int i = 0; i < taxAccountCount; i++) {
                        if (taxAccounts[i].getTaxpayerTin() == taxAccountNumber) {
                            duplicateNumber = true;
                            break;
                        }
                    }
                    if(duplicateNumber) {
                        System.out.println("Rejection: Duplicate TaxAccount number.");
                        break;
                    }

                    // reftin
                    String taxAccountRefTin = "";
                    while (taxAccountRefTin.isEmpty()) {
                        System.out.println("Enter a tayAccount Tin for linking");
                        taxAccountRefTin = scanner.nextLine().trim();
                    }

                    // type
                    String taxAccountType = "";
                    while (taxAccountType.isEmpty()) {
                        System.out.println("Enter a tayAccount Account Type");
                        taxAccountType = scanner.nextLine().trim();
                    }

                    // status
                    String taxAccountStatus = "";
                    while (taxAccountStatus.isEmpty()) {
                        System.out.println("Enter a tayAccount Account Status");
                        taxAccountStatus = scanner.nextLine().trim();
                    }
                    
                    taxAccounts[taxAccountCount++] = new TaxAccount(taxAccountNumber, taxAccountRefTin, taxAccountType, taxAccountStatus);
                    System.out.println("Success: Taxpayer registered.");
                    break;

                case 3:
                    System.out.println("Registering a declaration");

                    // id
                    String declarationId = "";
                    while (declarationId.isEmpty()) {
                        System.out.println("Enter a declaration id: ");
                        declarationId = scanner.nextLine().trim();
                    }
                    boolean duplicateDeclarationId = false;
                    for (int i = 0; i < declarationCount; i++) {
                        if (declarations[i].getDeclarationId() == declarationId) {
                            duplicateDeclarationId = true;
                            break;
                        }
                    }
                    if(duplicateDeclarationId) {
                        System.out.println("Rejection: Duplicate declaration Id.");
                        break;
                    }

                    // account number
                    String declarationAccountNumber = "";
                    while (declarationAccountNumber.isEmpty()) {
                        System.out.println("Enter a taypayer Tin for linking");
                        declarationAccountNumber = scanner.nextLine().trim();
                    }

                    // amount
                    double declarationAmount = 0.0;
                    while (declarationAmount == 0) {
                        System.out.println("Enter a declaration amount");
                        declarationAmount = Double.parseDouble(scanner.nextLine().trim());
                    }

                    // tax
                    double declaredTax = 0.0;
                    while (declaredTax == 0) {
                        System.out.println("Enter a tay declaration amount");
                        declaredTax = Double.parseDouble(scanner.nextLine().trim());
                    }
                    
                    declarations[declarationCount++] = new Declaration(declarationId, declarationAccountNumber, declarationAmount, declaredTax);
                    System.out.println("Success: Taxpayer registered.");
                    break;
                
                case 4:
                    System.out.println("Registering a payment");

                    // id
                    String paymentId = "";
                    while (paymentId.isEmpty()) {
                        System.out.println("Enter a payment id: ");
                        paymentId = scanner.nextLine().trim();
                    }
                    boolean duplicatePaymentId = false;
                    for (int i = 0; i < paymentCount; i++) {
                        if (payments[i].getPaymentId() == paymentId) {
                            duplicatePaymentId = true;
                            break;
                        }
                    }
                    if(duplicatePaymentId) {
                        System.out.println("Rejection: Duplicate payment Id.");
                        break;
                    }

                    // declaration id
                    String declarationRefId = "";
                    while (declarationRefId.isEmpty()) {
                        System.out.println("Enter a declaration reference id: ");
                        declarationRefId = scanner.nextLine().trim();
                    }

                    // amount
                    double paymentAmount = 0.0;
                    while (paymentAmount == 0) {
                        System.out.println("Enter a Payment amount");
                        declarationAmount = Double.parseDouble(scanner.nextLine().trim());
                    }

                    // method
                    String paymentMethod = "";
                    while (paymentMethod.isEmpty()) {
                        System.out.println("Enter a declaration reference id: ");
                        paymentMethod = scanner.nextLine().trim();
                    }
                    
                    payments[paymentCount++] = new Payment(paymentId, declarationRefId, paymentAmount, paymentMethod);
                    System.out.println("Success: Taxpayer registered.");
                    break;
                
                case 5:
                    System.out.println("\n========== TAX SUMMARY ==========");

                    System.out.println("\n--- TAXPAYERS ---");
                    for (int i = 0; i < taxpayerCount; i++) {
                        System.out.println("TIN: " + taxPayers[i].getTaxpayerTin());
                        System.out.println("Name: " + taxPayers[i].getTaxpayerName());
                        System.out.println("--------------------------------");
                    }

                    System.out.println("\n--- TAX ACCOUNTS ---");
                    for (int i = 0; i < taxAccountCount; i++) {
                        System.out.println("Account Number: " + taxAccounts[i].getAccountNumber());
                        System.out.println("TIN: " + taxAccounts[i].getTaxpayerTin());
                        System.out.println("Type: " + taxAccounts[i].getTaxType());
                        System.out.println("Status: " + taxAccounts[i].getAccountStatus());
                        System.out.println("--------------------------------");
                    }

                    System.out.println("\n--- DECLARATIONS ---");
                    for (int i = 0; i < declarationCount; i++) {
                        System.out.println("Declaration ID: " + declarations[i].getDeclarationId());
                        System.out.println("Account Number: " + declarations[i].getAccountNumber());
                        System.out.println("Amount: " + declarations[i].getTaxableAmount());
                        System.out.println("Tax: " + declarations[i].getDeclaredTax());
                        System.out.println("--------------------------------");
                    }

                    System.out.println("\n--- PAYMENTS ---");
                    for (int i = 0; i < paymentCount; i++) {
                        System.out.println("Payment ID: " + payments[i].getPaymentId());
                        System.out.println("Declaration ID: " + payments[i].getDeclarationId());
                        System.out.println("Amount: " + payments[i].getAmountPaid());
                        System.out.println("Method: " + payments[i].getPaymentMethod());
                        System.out.println("--------------------------------");
                    }

                    break;
                
                default:
                    System.out.println("Invalid choice choose a number from 0-5!");
                    break;

            }

        }

        while (choice != 0);

        scanner.close();

    }
}
