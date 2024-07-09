/**
 * A subclass of bankcard which is debitcard
 * There are 7 methods and 4 instance variables
 * @author (Sakar Paudel)
 * @version (1-15-2023)
 */
public class DebitCard extends BankCard
{
    //declaring instance variables/attribute
    private int PINnumber , withdrawlAmount;
    private String dateofWithdrawl;
    private boolean hasWithdrawn;
    /* constructor method for DebitCard
    to assign values to attributes */
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank,String clientName,int PINnumber)
    {
        super(balanceAmount , cardId , bankAccount , issuerBank); //calling the constructor of superclass
        super.setclientName(clientName);//calling a setter method of superclass
        this.PINnumber = PINnumber;//assigning attribute with parameter value
        hasWithdrawn = false;
    }

    //getter/accessor method for attribute PINnumber 
    public int getPINnumber()
    {
        return this.PINnumber;
    }

    //getter/accessor method for attribute withdrawlAmount 
    public int getwithdrawlAmount()
    {
        return this.withdrawlAmount;
    }

    //getter/accessor method for attribute dateofWithdrawl 
    public String getdateofWithdrawl()
    {
        return this.dateofWithdrawl;
    }

    //getter/accessor method for attribute hasWithdrawn
    public boolean ishasWithdrawn()
    {
        return this.hasWithdrawn;
    }

    //setter/mutator method for withdrawlAmount
    public void setwithdrawlAmount(int withdrawlAmount)
    {
        this.withdrawlAmount = withdrawlAmount;
    }
    //withdraw method to withdraw balance from debit card
    public void Withdraw(int withdrawlAmount,String dateofWithdrawl,int PINnumber)
    {
        //checking pinnumber of card
        if(PINnumber==this.PINnumber){
            //checking for sufficient balance 
            if(super.getbalanceAmount()>=withdrawlAmount){
                this.hasWithdrawn = true;
                this.withdrawlAmount = withdrawlAmount;
                this.dateofWithdrawl = dateofWithdrawl;
                super.setbalanceAmount(super.getbalanceAmount()- withdrawlAmount);//deducting balanceamount after withdrawing
            }
            else{
                System.out.println("INSUFFICIENT BALANCE");
            }
        }
        else{
            System.out.println("INCORRECT PIN");
        }
    }
    // display method for prinitng values of class DebitCard
    public void display()
    {
        //checking condition and printing values accordingly
        super.display();
        if(hasWithdrawn==true){
            System.out.println("Pin = "+PINnumber);
            System.out.println("Withdrawl Amount = " + withdrawlAmount);
            System.out.println("Date of withdrawl = " + dateofWithdrawl);
        }
        else{
            System.out.println("Balance Amount = " + super.getbalanceAmount());
        }
    }

}