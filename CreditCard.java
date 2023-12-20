
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067667 Khalid Hasan Ansari) 
 * @version (1.0.0)
 */

//This class extends the BankCard class, and contains information of a credit card
public class CreditCard extends BankCard 
{
    private int cvcNumber; 
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    //Constructor
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
        this.setClientName(clientName);
    }
    
    //Accessor methods
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    
    public double getInterestRate()
    {
        return this.interestRate;
    }
    
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    
    //Setter method
    //Method which sets the credit limit and grace period, if the input credit limit is less than 2.5 times the balance amount
    public void setCreditLimit(int creditLimit, int gracePeriod)
    {
        if (creditLimit <= 2.5 * getBalanceAmount()){
        this.creditLimit = creditLimit;
        this.gracePeriod = gracePeriod;
        this.isGranted = true;
        System.out.println("Credit Card granted");
    }
        else{
            System.out.println("Credit Card cannot be issued");
        }
        return;
    }
    
    //Method to cancel credit card
    public void cancelCreditCard() 
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
        System.out.println("Credit Card cancelled");
    }

    //Method to display the credit card details
    public void display()
    {
      super.display();
      System.out.println("CVC number: " + this.cvcNumber);
      System.out.println("Interest rate: " + this.interestRate);
      System.out.println("Expiration date: " + this.expirationDate);
      
      if(this.isGranted){
          System.out.println("Credit limit: " + this.creditLimit);
          System.out.println("Grace period: " + this.gracePeriod);
      }
      else{
          System.out.println("Balance Amount: " + getBalanceAmount());
      }
    }
}
    

