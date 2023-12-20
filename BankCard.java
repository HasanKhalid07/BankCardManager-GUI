
/**
 * Write a description of class BankCard here.
 *
 * @author (22067667 Khalid Hasan Ansari)
 * @version (1.0.0)
 */
public class BankCard 
{
    
    // This class BankCard stores the details of the BankCard such as cardId, clientName, issuerBank, bankAccount, balanceAmount.
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    
    // Constructor to initialize the BankCard with the given details.
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank) 
    {
        this.cardId = cardId;
        this.clientName = "";
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
    }
    
    // Method to set the client name
    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
    
    // Method to set the balance amount
    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    
    // Method to get the cardId
    public int getCardId()
    {
        return this.cardId;
    }
    
    // Method to get the client name
    public String getClientName()
    {
        return this.clientName;
    }
    
    // Method to get the issuer bank
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    
    // Method to get the bank account
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    
    // Method to get the balance amount
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    // Method to display the BankCard details
    public void display()
    {
        
        if(this.clientName.equals("")){
            System.out.println("Client name not assigned");
        }
        
        else{
            System.out.println("Card ID:" + this.cardId);
            System.out.println("Client name: " + this.clientName);
            System.out.println("Issuer bank:" + this.issuerBank);
            System.out.println("Bank account:" + this.bankAccount);
            System.out.println("Balance amount: " + this.balanceAmount);
        }
    }
}
    

    
    
    
    
    

