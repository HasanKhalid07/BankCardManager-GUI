
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067667 Khalid Hasan Ansari)
 * @version (1.0.0)
 */

//This class extends the BankCard class, and contains information of a debit card
public class DebitCard extends BankCard 
{
    private int pinNumber;  //variable for pinNumber
    private int withdrawalAmount;  //variable for withdrawalAmount
    private String dateOfWithdrawal; //variable for dateOfWithdrawal
    private boolean hasWithdrawn; //variable for hasWithdrawn

    //Constructor for DebitCard class
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) 
    {
        super(balanceAmount, cardId, bankAccount, issuerBank); // calls the constructor of the super class
        this.pinNumber = pinNumber; //initializes the pinNumber
        this.setClientName(clientName); //sets the clientName
        this.hasWithdrawn = false; //initializes the hasWithdrawn to false
    }
    
    //Setter method for withdrawalAmount
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount = withdrawalAmount;
    }
    
    //Getter method for pinNumber
    public int getPinNumber()
    {
        return this.pinNumber;
    }
    
    //Getter method for withdrawalAmount 
    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    
    //Getter method for dateOfWithdrawal
    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }
    
    //Getter method for hasWithdrawn
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    
    //Method to withdraw money from the card
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
    {
        if(pinNumber == this.pinNumber && this.getBalanceAmount() >= withdrawalAmount){
            this.withdrawalAmount = withdrawalAmount; //Sets the withdrawal Amounts
            this.dateOfWithdrawal = dateOfWithdrawal; //Sets the dateOfWithdrawal
            this.setBalanceAmount(this.getBalanceAmount() - withdrawalAmount); //Sets the balanceAmount
            this.hasWithdrawn = true; //Sets hasWithdrawn to true
        }
         else { 
        System.out.println("Insufficient funds or invalid pin number");  //prints the statement if pinNumber is correct or there are insufficient funds
        } 
    }
    
    //Method to display the details of the debit card
    public void display()
    {
        super.display();  //Calls the display() method of the super class
        System.out.println("Pin Number" + pinNumber); //Prints the pinNumber
        if (hasWithdrawn){  //Checks if the card has been used for withdrawal
            System.out.println("Withdrawal Amount: " + withdrawalAmount);  //Prints the withdrawalAmount
            System.out.println("Date of Withdrawal: " + dateOfWithdrawal);  //Prints the dateOfWithdrawal
        }
        else{
            System.out.println("Balance Amount: " + getBalanceAmount());  //prints the balanceAmount
        }
    }
}
        
           
