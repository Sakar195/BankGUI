/**
 * super class bankcard , has five attributes,
 * there are 8 methods
 * @author (Sakar Paudel)
 * @version (1-15-2023)
 */


//super class bankcard 
public class BankCard
{
    //declaring variables/attribute 
    private String clientName;
    private String issuerBank , bankAccount;
    private int cardId , balanceAmount;
    /* constructor method for BankCard
    to assign values to attributes */

    
    public BankCard(int balanceAmount , int cardId , String bankAccount ,String issuerBank)
    {
        clientName = "";
        //assigning instance variables with parameter value
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }

    //getter/accessor method for attribute clientName
    public String getclientName()
    {
        return this.clientName;
    }
    //getter/accessor method for attribute balanceAmount
    public int getbalanceAmount()
    {
        return this.balanceAmount;
    }

    //getter/accessor method for attribute cardId
    public int getcardId()
    {
        return this.cardId;
    }

    //getter/accessor method for attribute bankAccount
    public String getbankAccount()
    {
        return this.bankAccount;
    }

    //getter/accessor method for attribute issuerBank
    public String getissuerBank()
    {
        return this.issuerBank;
    }

    //setter/mutator method for clientName
    public void setclientName(String clientName)
    {
        //assigning parameter value to instance variable
        this.clientName = clientName;
    }

    //setter/mutator method for balanceAmount
    public void setbalanceAmount(int balanceAmount)
    {
        //assigning parameter value to instance variable
        this.balanceAmount = balanceAmount;
    } 
    // display method for prinitng values of class BankCard
    public void display()
    { 
        //checking condition and printing values accordingly
        System.out.println("CardID = "+this.cardId);
        if(clientName==""){
            System.out.println("The clientname has not been assigned");
        }
        else{
            System.out.println("The Clientname is = "+clientName);
        }
        System.out.println("Bank Name = "+issuerBank);
        System.out.println("Account = "+bankAccount);
        System.out.println("Balance Amount = "+balanceAmount);
    }

}
