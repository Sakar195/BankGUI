/**
 * A subclass of BankCard which is CreditCard
 * There are 9 methods and 6 instance variables
 * 
 * @author (Sakar Paudel)
 * @version (1-15-2023)
 */
public class CreditCard extends BankCard {
    // declaring instance variables/attribute
    private int CVCnumber, GracePeriod;
    private double CreditLimit, InterestRate;
    private String ExpirationDate;
    private boolean isGranted;

    /*
     * constructor method for CreditCard
     * to assign values to attributes
     */
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount,
            int CVCnumber, double InterestRate, String ExpirationDate) {
        super(balanceAmount, cardId, bankAccount, issuerBank); // calling the constructor of superclass
        super.setclientName(clientName);
        // assigning attribute with parameter value
        this.CVCnumber = CVCnumber;
        this.InterestRate = InterestRate;
        this.ExpirationDate = ExpirationDate;
        isGranted = false;// setting boolean value to false
    }

    // getter/accessor method for attribute CVCnumber
    public int getCVCnumber() {
        return this.CVCnumber;
    }

    // getter/accessor method for attribute GracePeriod
    public int getGracePeriod() {
        return this.GracePeriod;
    }

    // getter/accessor method for attribute CreditLimit
    public double getCreditLimit() {
        return this.CreditLimit;
    }

    // getter/accessor method for attribute InterestRate
    public double getInterestRate() {
        return this.InterestRate;
    }

    // getter/accessor method for attribute ExpirationDate
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    // getter/accessor method for attribute isGranted
    public boolean isisGranted() {
        return this.isGranted;
    }

    // method for setting credit limit
    public void setcreditlimit(double CreditLimit, int GracePeriod) {
        if (CreditLimit <= 2.5 * super.getbalanceAmount()) {
            isGranted = true;
            this.CreditLimit = CreditLimit;
            this.GracePeriod = GracePeriod;
        } else {
            System.out.print("\nCredit cannot be issued\n");
        }
    }

    // method to cancel credit card
    public void cancelcreditcard() {
        // resetting values of attributes
        this.CVCnumber = 0;
        this.CreditLimit = 0;
        this.GracePeriod = 0;
        this.isGranted = false;
    }

    /*
     * display method for prinitng values of
     * attributes of class CreditCard
     */

    public void display() {
        super.display();
        if (isGranted == true) {
            System.out.println("Credit Limit = " + CreditLimit);
            System.out.println("Grace Period = " + GracePeriod + " days");
        }
        System.out.println("CVC Number = " + CVCnumber);
        System.out.println("Interest Rate = " + InterestRate + "%");
        System.out.println("Card Expiry Date = " + ExpirationDate);
    }

}
