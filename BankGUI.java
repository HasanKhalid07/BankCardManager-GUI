/**
 * Write a description of class BankGUI here.
 *bankGUI.java is a Java Swing application that simulates a basic bank management system.
 *It allows users to create new debit and credit cards, deposit and withdraw money, 
 *view card details, and cancel credit cards.
 *The code is organized into separate classes for each type of bank card and follows object-oriented design principles.
 *The application also includes error handling to prevent invalid user inputs.
 * @author (22067667 Khalid Hasan Ansari)
 * @version (1.0.0)
 */
// Import necessary packages
import javax.swing.*; // for GUI components
import java.awt.event.*;  // for event listeners
import java.awt.*;  // for setting GUI layout and components
import java.util.ArrayList;  // for storing credit card objects in list



public class BankGUI implements ActionListener {
    // Declare instance variables for various frames
    private JFrame frame, debitFrame, addCreditFrame, withdrawFrame, creLimitFrame, cancelCreCardFrame;
    // Declare instance variables for various buttons
    private JButton addDebitCardBtn, addCreditCardBtn, withdrawBtn, setCreditLimitBtn, cancelCreditCardBtn, displayDebitCardBtn, displayCreditCardBtn, addDebCardBtn, debClearBtn, addCreCardBtn, CreClearBtn, addWithdrawBtn, withClearBtn, setCreLimitBtn, SetLimClearBtn, cancelCreCardBtn, CancelCreClearBtn, DebGoBackBtn, CreGoBackBtn, withdrawGoBackBtn, creLimitBackBtn, CancelGoBackBtn;
    // Declare instance variables for various labels
    private JLabel title, addBalanceAmount, addDebCardId, addBankAccount, addIssuerBank, addDebClientName, addPinNumber, addCreditCardId, addCreClientName, addCreditIssuerBank, addCreditBankAccount, addCreditBalanceAmount, addCreditCvcNumber, addCreditInterestRate, addCreditExpirationDate, withCardId, withWithdrawnAmt, withPinNumber, withDateWithdrawn, creLimitCardId, creLimit, gracePeriod, cancelCreCardId;
    // Declare instance variables for various text fields
    private JTextField addBalanceAmountText, addDebCardIdText, addBankAccountText, addIssuerBankText, addDebClientNameText, addPinNumberText, addCreCardIdText, addCreClientNameText, addCreditIssuerBankText, addCreditBankAccountText, addCreditBalanceAmountText, addCreditCvcNumberText, addCreditInterestRateText, withCardIdText, withwithdrawnAmtText, withPinNumberText,  creLimitText, setCreLimitText, gracePeriodText, cancelCreCardIdText;
    // Declare instance variables for various combo boxes
    private JComboBox CreYearCombo, CreMonthCombo, CreDayCombo, withDayCombo, withMonthCombo, withYearCombo;
    // Create an ArrayList to hold BankCard objects
    ArrayList<BankCard> cardList = new  ArrayList<BankCard>();
    
    //create an another instance methods Vehicle where access modifire is public and return type is void
    public BankGUI() {
        // Define the main frame    
        frame = new JFrame("Bank Application");
        // Add a title to the GUI
        JLabel title = new JLabel("Hello Admin, what would you like to do?");
        title.setBounds(60, 20, 400, 40);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(new Color(33, 150, 243));
      
        // Create buttons for different functions
        addDebitCardBtn = new JButton("Add Debit Card");
        addDebitCardBtn.setBounds(60, 100, 180, 40);
        addDebitCardBtn.setBackground(new Color(33, 150, 243));
        addDebitCardBtn.setForeground(Color.WHITE);
        addDebitCardBtn.addActionListener(this);
        
        addCreditCardBtn = new JButton("Add Credit Card");
        addCreditCardBtn.setBounds(260, 100, 180, 40);
        addCreditCardBtn.setBackground(new Color(33, 150, 243));
        addCreditCardBtn.setForeground(Color.WHITE);
        addCreditCardBtn.addActionListener(this);
        
        withdrawBtn = new JButton("Withdraw from Debit Card");
        withdrawBtn.setBounds(60, 160, 180, 40);
        withdrawBtn.setBackground(new Color(33, 150, 243));
        withdrawBtn.setForeground(Color.WHITE);
        withdrawBtn.addActionListener(this);
        
        setCreditLimitBtn = new JButton("Set Credit Limit");
        setCreditLimitBtn.setBounds(260, 160, 180, 40);
        setCreditLimitBtn.setBackground(new Color(33, 150, 243));
        setCreditLimitBtn.setForeground(Color.WHITE);
        setCreditLimitBtn.addActionListener(this);
        
        cancelCreditCardBtn = new JButton("Cancel Credit Card");
        cancelCreditCardBtn.setBounds(60, 220, 180, 40);
        cancelCreditCardBtn.setBackground(new Color(33, 150, 243));
        cancelCreditCardBtn.setForeground(Color.WHITE);
        cancelCreditCardBtn.addActionListener(this);
        
        displayDebitCardBtn = new JButton("Display Debit Card Details");
        displayDebitCardBtn.setBounds(260, 220, 180, 40);
        displayDebitCardBtn.setBackground(new Color(33, 150, 243));
        displayDebitCardBtn.setForeground(Color.WHITE);
        displayDebitCardBtn.addActionListener(this);
        
        displayCreditCardBtn = new JButton("Display Credit Card Details");
        displayCreditCardBtn.setBounds(160, 280, 180, 40);
        displayCreditCardBtn.setBackground(new Color(33, 150, 243));
        displayCreditCardBtn.setForeground(Color.WHITE);
        displayCreditCardBtn.addActionListener(this);
        
        // Add components to the frame
        frame.add(title);
        frame.add(addDebitCardBtn);
        frame.add(addCreditCardBtn);
        frame.add(withdrawBtn);
        frame.add(setCreditLimitBtn);
        frame.add(cancelCreditCardBtn);
        frame.add(displayDebitCardBtn);
        frame.add(displayCreditCardBtn);
        
        // Set the size of the frame
        frame.setSize(500, 500);
        // Set the background color of the frame
        frame.getContentPane().setBackground(new Color(240, 240, 240));
        // Set the layout of the frame
        frame.setLayout(null);
        // Set the default close operation of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the frame tp visible
        frame.setVisible(true);

    }
    
    /** 
        Create an instance methods which is addDebitCard or access modifire is public and return type is void 
        than that is access the instance variable
        */  
    public void addDebitCard(){
        JFrame debitFrame = new JFrame("Add Debit card");
    
        JLabel addBalanceAmount = new JLabel("Balance Amount:");
        JTextField addBalanceAmountText = new JTextField();
        addBalanceAmountText.setBounds(187, 71, 235, 22);
        addBalanceAmount.setBounds(30, 71, 110, 22);
        debitFrame.add(addBalanceAmountText);
        debitFrame.add(addBalanceAmount);
    
        JLabel addDebCardId = new JLabel("Card ID:");
        JTextField addDebCardIdText = new JTextField();
        addDebCardIdText.setBounds(187, 122, 235, 22);
        addDebCardId.setBounds(30, 122, 110, 22);
        debitFrame.add(addDebCardIdText);
        debitFrame.add(addDebCardId);
    
        JLabel addBankAccount = new JLabel("Bank Account:");
        JTextField addBankAccountText = new JTextField();
        addBankAccountText.setBounds(187, 173, 235, 22);
        addBankAccount.setBounds(30, 173, 110, 22);
        debitFrame.add(addBankAccountText);
        debitFrame.add(addBankAccount);
    
        JLabel addIssuerBank = new JLabel("Issuer Bank:");
        JTextField addIssuerBankText = new JTextField();
        addIssuerBankText.setBounds(187, 224, 235, 22);
        addIssuerBank.setBounds(30, 224, 110, 22);
        debitFrame.add(addIssuerBankText);
        debitFrame.add(addIssuerBank);
    
        JLabel addDebClientName = new JLabel("Client Name:");
        JTextField addDebClientNameText = new JTextField();
        addDebClientNameText.setBounds(187, 275, 235, 22);
        addDebClientName.setBounds(30, 275, 110, 22);
        debitFrame.add(addDebClientNameText);
        debitFrame.add(addDebClientName);
    
        JLabel addPinNumber = new JLabel("PIN Number:");
        JTextField addPinNumberText = new JTextField();
        addPinNumberText.setBounds(187, 326, 235, 22);
        addPinNumber.setBounds(30, 326, 110, 22);
        debitFrame.add(addPinNumberText);
        debitFrame.add(addPinNumber);
        
        JButton addDebCardBtn = new JButton("Add Debit Card");
        addDebCardBtn.setBounds(53, 390, 120, 32);
        addDebCardBtn.addActionListener(this);
        debitFrame.add(addDebCardBtn);
        
        JButton debClearBtn = new JButton("Clear");
        debClearBtn.setBounds(302, 390, 120, 32);
        debClearBtn.addActionListener(this);
        debitFrame.add(debClearBtn);
    
        debitFrame.setSize(487, 472);
        //METHOD-1 : Using Color Fields
        debitFrame.getContentPane().setBackground(Color.CYAN);
    
        //METHOD-2 : Using Color Constructors
        Color color=new Color(3, 117, 145);
        debitFrame.getContentPane().setBackground(color);
    
        // Center window
        frame.setVisible(false);
        debitFrame.setLayout(null);
        debitFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        debitFrame.setVisible(true);
        
        JButton DebGoBackBtn = new JButton("Go Back");
        DebGoBackBtn.setBounds(177, 390, 120, 32);
        DebGoBackBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                debitFrame.dispose();
                frame.setVisible(true);
            }
        });
        debitFrame.add(DebGoBackBtn);
    
            
        // Create a new ActionListener for the "Clear" button in the "Add Debit Card" frame
        debClearBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                // Clear the text fields for the debit card details
                addBalanceAmountText.setText("");
                addDebCardIdText.setText("");
                addBankAccountText.setText("");
                addIssuerBankText.setText("");
                addDebClientNameText.setText("");
                addPinNumberText.setText("");
            }
        });
        // ActionListener for the "Add Debit Card" button
        addDebCardBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                // Get values entered by user
                double balanceAmount = 0;
                int cardId = 0;
                String bankAccount = addBankAccountText.getText();
                String issuerBank = addIssuerBankText.getText();
                String clientName = addDebClientNameText.getText();
                int pinNumber = 0;
                
                
                // Validate input for bankAccount, issuerBank, and clientName
                if (clientName.isEmpty() || issuerBank.isEmpty() || bankAccount.isEmpty()) {
                    JOptionPane.showMessageDialog(debitFrame, "All fields are required");
                    return;
                }
    
                // Validate and parse input for balanceAmount
                try {
                    balanceAmount = Double.parseDouble(addBalanceAmountText.getText());
                    if (balanceAmount <= 0) {
                         // Show an error message if balanceAmount is not a positive number
                        JOptionPane.showMessageDialog(debitFrame, "Balance amount must be a positive number");
                        return;
                    }
                } 
                catch (NumberFormatException ex) {
                    // Show an error message if balanceAmount is not a number
                    JOptionPane.showMessageDialog(debitFrame, "Balance amount must be a number");
                    return;
                }
                
                // Validate and parse input for cardId
                try {
                    cardId = Integer.parseInt(addDebCardIdText.getText());
                    if (cardId <= 0) {
                        // Show an error message if cardId is not a positive number
                        JOptionPane.showMessageDialog(debitFrame, "Card ID must be a positive number");
                        return;
                    }
                } 
                catch (NumberFormatException ex) {
                    // Show an error message if cardId is not a number
                    JOptionPane.showMessageDialog(debitFrame, "Card ID must be a number");
                    return;
                }
                
                // Validate bank account contains only letters and numbers
                if (!bankAccount.matches("^[a-zA-Z0-9]+$")) {
                    JOptionPane.showMessageDialog(debitFrame, "Bank account should only contain letters and numbers");
                   
                    return;
                }
                
                
                // Validate issuer bank contains only letters
                if (!issuerBank.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(debitFrame, "Issuer bank should only contain letters");
                    return;
                }
                
                
                // Validate client name contains only letters
                if (!clientName.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(debitFrame, "Client name should only contain letters");
                    return;
                }
              
                 
                 // Validate and parse input for pinNumber
                try {
                    pinNumber = Integer.parseInt(addPinNumberText.getText());
                    if (pinNumber <= 0) {
                        // Show an error message if pinNumber is not a positive number
                        JOptionPane.showMessageDialog(debitFrame, "PIN number must be a positive number");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    // Show an error message if pinNumber is not a number
                    JOptionPane.showMessageDialog(debitFrame, "PIN number must be a number");
                    return;
                }
                // Check if the card ID already exists
                for (BankCard card : cardList) {
                    if (card instanceof DebitCard) {
                        DebitCard debitCard = (DebitCard) card;
                        if (debitCard.getCardId() == cardId) {
                            // Show an error message if the card ID already exists
                            JOptionPane.showMessageDialog(debitFrame, "Card ID already exists");
                            return;
                        }
                    }
                }            
               
                // Save to database or perform other action
                DebitCard newCard = new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);
                cardList.add(newCard);
                // Close the "Add Debit Card" window and return to the main window
                JOptionPane.showMessageDialog(debitFrame, "Debit card details added successfully");
                // Clear the text fields for the debit card details
                addBalanceAmountText.setText("");
                addDebCardIdText.setText("");
                addBankAccountText.setText("");
                addIssuerBankText.setText("");
                addDebClientNameText.setText("");
                addPinNumberText.setText("");
            }
        });
    }
 
    //create an another instance methods addCreditCard where access modifire is public and return type is void   
    public void addCreditCard(){
        JFrame addCreditFrame = new JFrame("Add Credit Card ");

        JLabel addCreditCardId = new JLabel("Card ID:");
        JTextField addCreCardIdText = new JTextField();
        addCreCardIdText.setBounds(188, 45, 235, 22);
        addCreditCardId.setBounds(48, 42, 110, 22);
        addCreditFrame.add(addCreCardIdText);
        addCreditFrame.add(addCreditCardId);

        JLabel addCreClientName = new JLabel("Client Name:");
        JTextField addCreClientNameText = new JTextField();
        addCreClientNameText.setBounds(188, 91, 235, 22);
        addCreClientName.setBounds(48, 89, 110, 22);
        addCreditFrame.add(addCreClientNameText);
        addCreditFrame.add(addCreClientName);

        JLabel addCreditIssuerBank = new JLabel("Issuer Bank:");
        JTextField addCreditIssuerBankText = new JTextField();
        addCreditIssuerBankText.setBounds(188, 137, 235, 22);
        addCreditIssuerBank.setBounds(48, 136, 110, 22);
        addCreditFrame.add(addCreditIssuerBankText);
        addCreditFrame.add(addCreditIssuerBank);

        JLabel addCreditBankAccount = new JLabel("Bank Account:");
        JTextField addCreditBankAccountText = new JTextField();
        addCreditBankAccountText.setBounds(188, 183, 235, 22);
        addCreditBankAccount.setBounds(48, 183, 110, 22);
        addCreditFrame.add(addCreditBankAccountText);
        addCreditFrame.add(addCreditBankAccount);

        JLabel addCreditBalanceAmount = new JLabel("Balance Amount:");
        JTextField addCreditBalanceAmountText = new JTextField();
        addCreditBalanceAmountText.setBounds(188, 229, 235, 22);
        addCreditBalanceAmount.setBounds(48, 230, 110, 22);
        addCreditFrame.add(addCreditBalanceAmountText);
        addCreditFrame.add(addCreditBalanceAmount);

        JLabel addCreditCvcNumber = new JLabel("CVC Number:");
        JTextField addCreditCvcNumberText = new JTextField();
        addCreditCvcNumberText.setBounds(188, 275, 235, 22);
        addCreditCvcNumber.setBounds(48, 277, 110, 22);
        addCreditFrame.add(addCreditCvcNumberText);
        addCreditFrame.add(addCreditCvcNumber);
        
        JLabel addCreditInterestRate = new JLabel("Interest Rate:");
        JTextField addCreditInterestRateText = new JTextField();
        addCreditInterestRateText.setBounds(188, 321, 235, 22);
        addCreditInterestRate.setBounds(48, 324, 110, 22);
        addCreditFrame.add(addCreditInterestRateText);
        addCreditFrame.add(addCreditInterestRate);
        
        JLabel addCreditExpirationDate = new JLabel("Expiration Date:");
        addCreditExpirationDate.setBounds(48, 371, 110, 22);
        addCreditFrame.add(addCreditExpirationDate);
 
        String[] day = new String[32];
        day[0] = "Day";
        for (int i = 1; i <= 31; i++) {
            day[i] = Integer.toString(i);
        }

        String[] year = new String[22];
        year[0] = "Year";
        int currentYear = 2010;
        for (int i = 1; i <= 21; i++) {
            year[i] = Integer.toString(currentYear++);
        }
        String[] month = {"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        JComboBox CreDayCombo = new JComboBox(day);
        CreDayCombo.setBounds(388, 367, 75, 26);
        JComboBox CreMonthCombo = new JComboBox(month);
        CreMonthCombo.setBounds(288, 367, 75, 26);
        JComboBox CreYearCombo = new JComboBox(year);
        CreYearCombo.setBounds(188, 367, 75, 26);
        
        addCreditFrame.add(CreDayCombo);
        addCreditFrame.add(CreMonthCombo);
        addCreditFrame.add(CreYearCombo);
        
        JButton addCreCardBtn = new JButton("Add Credit Card");
        addCreCardBtn.setBounds(69, 436, 132, 32);
        addCreditFrame.add(addCreCardBtn);
        addCreCardBtn.addActionListener(this);  
        
        JButton CreClearBtn = new JButton("Clear");
        CreClearBtn.setBounds(219, 436, 75, 32);
        addCreditFrame.add(CreClearBtn);

        addCreditFrame.setSize(520, 527);
        //METHOD-1 : Using Color Fields
        addCreditFrame.getContentPane().setBackground(Color.CYAN);
    
        //METHOD-2 : Using Color Constructors
        Color color=new Color(3, 117, 145);
        addCreditFrame.getContentPane().setBackground(color);

        // Center window
        frame.setVisible(false);
        addCreditFrame.setLayout(null);
        addCreditFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addCreditFrame.setVisible(true);
        
        JButton CreGoBackBtn = new JButton("Go Back");
        CreGoBackBtn.setBounds(319, 436, 75, 32);
        addCreditFrame.add(CreGoBackBtn);
        
        CreGoBackBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                addCreditFrame.dispose();
                frame.setVisible(true);
            }
        });

            
        // Add an ActionListener to the clear button
        CreClearBtn.addActionListener(new ActionListener()
        {
            // Define the actionPerformed method that gets called when the clear button is clicked
            public void actionPerformed(ActionEvent e) {
                // Set all the text fields to empty strings
                addCreCardIdText.setText("");
                addCreClientNameText.setText("");
                addCreditBankAccountText.setText("");
                addCreditBalanceAmountText.setText("");
                addCreditIssuerBankText.setText("");
                addCreditCvcNumberText.setText("");
                addCreditInterestRateText.setText("");
                // Set the combo boxes to their default values
                CreDayCombo.setSelectedIndex(0);
                CreMonthCombo.setSelectedIndex(0);
                CreYearCombo.setSelectedIndex(0);
            }
        });

        // Add ActionListener to addCreCardBtn JButton    
        addCreCardBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                // Get credit card details from text fields and combo boxes
                // Retrieve values from text fields and combo boxes
                String cardIdStr = addCreCardIdText.getText();
                String clientName = addCreClientNameText.getText();
                String bankAccount = addCreditBankAccountText.getText();
                String balanceAmountStr = addCreditBalanceAmountText.getText();
                String issuerBank = addCreditIssuerBankText.getText();
                String cvcNumberStr = addCreditCvcNumberText.getText();
                String interestRateStr = addCreditInterestRateText.getText();
                // Construct expiration date string from selected date in combo boxes
                String expirationDate = CreYearCombo.getSelectedItem().toString() + "-" + (CreMonthCombo.getSelectedIndex() + 1) + "-" + CreDayCombo.getSelectedItem().toString();
                // Validate input
                // Check if card ID is empty
                if (cardIdStr.isEmpty()) {
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter a credit card ID.");
                    return;
                }
                int cardId = 0;
                try {
                    // Parse card ID as an integer
                    cardId = Integer.parseInt(cardIdStr);
                }
                catch (NumberFormatException ex) {
                    // Display error message if card ID cannot be parsed as an integer
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter a valid credit card ID.");
                    return;
                }
                // Check if client name is empty
                if (clientName.isEmpty()) {
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter a client name.");
                    return;
                }
                // Check if bank account is empty
                if (bankAccount.isEmpty()) {
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter a bank account.");
                    return;
                }
                // Check if balance amount is empty
                if (balanceAmountStr.isEmpty()) {
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter a balance amount.");
                    return;
                }
                double balanceAmount = 0.0;
                try {
                    // Parse balance amount as a double
                    balanceAmount = Double.parseDouble(balanceAmountStr);
                } 
                catch (NumberFormatException ex) {
                    // Display error message if balance amount cannot be parsed as a double
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter a valid balance amount.");
                    return;
                }
                // Check if issuer bank is empty
                if (issuerBank.isEmpty()) {
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter an issuer bank.");
                    return;
                }
                // Check if CVC number is empty
                if (cvcNumberStr.isEmpty()) {
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter a CVC number.");
                    return;
                }
                int cvcNumber = 0;
                try {
                    // Parse CVC number as an integer
                    cvcNumber = Integer.parseInt(cvcNumberStr);
                }
                catch (NumberFormatException ex) {
                    // Display error message if CVC number cannot be parsed as an integer
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter a valid CVC number.");
                    return;
                }
                // Check if interest rate is empty
                if (interestRateStr.isEmpty()) {
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter an interest rate.");
                    return;
                }
                double interestRate = 0.0;
                try {
                    // Parse interest rate as a double
                    interestRate = Double.parseDouble(interestRateStr);
                }
                catch (NumberFormatException ex) {
                    // Display error message if interest rate cannot be parsed as a double
                    JOptionPane.showMessageDialog(addCreditFrame, "Please enter a valid interest rate.");
                    return;
                }
                // Create new CreditCard object and add to cardList ArrayList
                CreditCard newCard = new CreditCard(cardId, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                cardList.add(newCard);
                // Display success message and close window
                JOptionPane.showMessageDialog(addCreditFrame, "Credit card added successfully!");
                // Set all the text fields to empty strings
                addCreCardIdText.setText("");
                addCreClientNameText.setText("");
                addCreditBankAccountText.setText("");
                addCreditBalanceAmountText.setText("");
                addCreditIssuerBankText.setText("");
                addCreditCvcNumberText.setText("");
                addCreditInterestRateText.setText("");
                // Set the combo boxes to their default values
                CreDayCombo.setSelectedIndex(0);
                CreMonthCombo.setSelectedIndex(0);
                CreYearCombo.setSelectedIndex(0);
            }
        });
    }

    //create an another instance methods withdrawFrame where access modifire is public and return type is void
    public void withdrawFrame(){
        JFrame withdrawFrame = new JFrame("Withdrawn money from Debit card");
            
        JLabel withCardId = new JLabel("Card ID:");
        JTextField withCardIdText = new JTextField();
        withCardIdText.setBounds(170, 48, 244, 22);
        withCardId.setBounds(30, 48, 135, 22);
        withdrawFrame.add(withCardIdText);
        withdrawFrame.add(withCardId);

        JLabel withWithdrawnAmt = new JLabel("Withdrawn Amount:");
        JTextField withWithdrawnAmtText = new JTextField();
        withWithdrawnAmtText.setBounds(170, 89, 244, 22);
        withWithdrawnAmt.setBounds(30, 89, 135, 22);
        withdrawFrame.add(withWithdrawnAmtText);
        withdrawFrame.add(withWithdrawnAmt);

        JLabel withPinNumber = new JLabel("PIN Number:");
        JTextField withPinNumberText = new JTextField();
        withPinNumberText.setBounds(170, 130, 244, 22);
        withPinNumber.setBounds(30, 130, 135, 22);
        withdrawFrame.add(withPinNumberText);
        withdrawFrame.add(withPinNumber);
        
        JLabel withDateWithdrawn = new JLabel("Date of Withdrawal:");
        withDateWithdrawn.setBounds(30, 171, 135, 22);
        withdrawFrame.add(withDateWithdrawn);
        
        String[] day = new String[32];
        day[0] = "Day";
        for (int i = 1; i <= 31; i++) {
            day[i] = Integer.toString(i);
        }

        String[] year = new String[22];
        year[0] = "Year";
        int currentYear = 2010;
        for (int i = 1; i <= 21; i++) {
            year[i] = Integer.toString(currentYear++);
        }
        String[] month = {"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        
        JComboBox withDayCombo = new JComboBox(day);
        withDayCombo.setBounds(346,171, 78, 26);
        JComboBox withMonthCombo = new JComboBox(month);
        withMonthCombo.setBounds(258,171, 78, 26);
        JComboBox withYearCombo = new JComboBox(year);
        withYearCombo.setBounds(170, 171, 78, 26);
        
        withdrawFrame.add(withDayCombo);
        withdrawFrame.add(withMonthCombo);
        withdrawFrame.add(withYearCombo);
        
        JButton addWithdrawBtn = new JButton("Withdraw");
        addWithdrawBtn.setBounds(40, 233, 105, 32);
        withdrawFrame.add(addWithdrawBtn);
        
        JButton withClearBtn = new JButton("Clear");
        withClearBtn.setBounds(282, 233, 105, 32);
        withdrawFrame.add(withClearBtn);
        
        withdrawFrame.setSize(452, 307);
        //METHOD-1 : Using Color Fields
        withdrawFrame.getContentPane().setBackground(Color.CYAN);
    
        //METHOD-2 : Using Color Constructors
        Color color=new Color(3, 117, 145);
        withdrawFrame.getContentPane().setBackground(color);
    
        frame.setVisible(false);
        withdrawFrame.setLayout(null); // Center window
        withdrawFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        withdrawFrame.setVisible(true);
        
        JButton withdrawGoBackBtn = new JButton("Go Back");
        withdrawGoBackBtn.setBounds(161, 233, 105, 32);
        withdrawFrame.add(withdrawGoBackBtn);
        
        withdrawGoBackBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                withdrawFrame.dispose();
                frame.setVisible(true);
            }
        });

        // Add an ActionListener to the clear button to clear all the input fields when the button is clicked    
        withClearBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                // Clear text fields and combo boxes
                withCardIdText.setText("");
                withWithdrawnAmtText.setText("");
                withPinNumberText.setText("");
                withDayCombo.setSelectedIndex(0);
                withMonthCombo.setSelectedIndex(0);
                withYearCombo.setSelectedIndex(0);
            }
        });
        // Create an ActionListener to handle the action of withdrawing amount from a Debit Card.    
        addWithdrawBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                // Get input values from text fields and combo boxes
                String cardIdText = withCardIdText.getText().trim();
                String withdrawnAmtText = withWithdrawnAmtText.getText().trim();
                String pinNumberText = withPinNumberText.getText().trim();
                String dateWithdrawn = withYearCombo.getSelectedItem().toString() + "-" +
                                       (withMonthCombo.getSelectedIndex() + 1) + "-" +
                                       withDayCombo.getSelectedItem().toString();
        
                // Check if all input fields are filled in
                if (cardIdText.isEmpty() || withdrawnAmtText.isEmpty() || pinNumberText.isEmpty()) {
                    JOptionPane.showMessageDialog(withdrawFrame, "Please fill in all required fields.");
                    return;
                }
                // Convert the input strings to integers
                int cardId = Integer.parseInt(cardIdText);
                int withdrawnAmount = Integer.parseInt(withdrawnAmtText);
                int pinNumber = Integer.parseInt(pinNumberText);
        
                // Check if card ID is in cardList
                boolean cardIdFound = false;
                for (int i = 0; i < cardList.size(); i++) {
                    if (cardList.get(i).getCardId() == cardId) {
                        cardIdFound = true;
                        // Check if pin number matches
                        if (((DebitCard) cardList.get(i)).getPinNumber() != pinNumber) {
                            JOptionPane.showMessageDialog(withdrawFrame, "Incorrect PIN number.");
                            return;
                        }
                        // Check if balance is sufficient for withdrawal
                        if (cardList.get(i).getBalanceAmount() < withdrawnAmount) {
                            JOptionPane.showMessageDialog(withdrawFrame, "Insufficient balance for withdrawal.");
                            return;
                        }
                        // Withdraw amount from balance and update cardList
                        ((DebitCard) cardList.get(i)).withdraw(withdrawnAmount, dateWithdrawn, pinNumber);
                        JOptionPane.showMessageDialog(withdrawFrame, "Amount withdrawn successfully.");
                        // Clear text fields and combo boxes
                        withCardIdText.setText("");
                        withWithdrawnAmtText.setText("");
                        withPinNumberText.setText("");
                        withDayCombo.setSelectedIndex(0);
                        withMonthCombo.setSelectedIndex(0);
                        withYearCombo.setSelectedIndex(0);
                        break;
                    }
                }
                // If card ID not found, display an error message
                if (!cardIdFound) {
                    JOptionPane.showMessageDialog(withdrawFrame, "Card ID not found.");
                }
                
            }
        });    
    }
    
    //create an another instance methods setCreditFrame where access modifire is public and return type is void   
    public void setCreditFrame() {
        JFrame creLimitFrame = new JFrame("Set Credit Limit");
    
        JLabel creLimitCardId = new JLabel("Card ID:");
        JTextField creLimitText = new JTextField();
        creLimitText.setBounds(167, 33, 235, 22);
        creLimitCardId.setBounds(27, 33, 135, 22);
        creLimitFrame.add(creLimitText);
        creLimitFrame.add(creLimitCardId);
    
        JLabel creLimit = new JLabel("Credit Limit:");
        JTextField setCreLimitText = new JTextField();
        setCreLimitText.setBounds(167, 73, 235, 22);
        creLimit.setBounds(27, 73, 130, 22);
        creLimitFrame.add(setCreLimitText);
        creLimitFrame.add(creLimit);
    
        JLabel gracePeriod = new JLabel("Grace Period:");
        JTextField gracePeriodText = new JTextField();
        gracePeriodText.setBounds(167, 113, 235, 22);
        gracePeriod.setBounds(27, 113, 130, 22);
        creLimitFrame.add(gracePeriodText);
        creLimitFrame.add(gracePeriod);
    
        JButton setCreLimitBtn = new JButton("Set Credit Limit");
        setCreLimitBtn.setBounds(60, 162, 126, 32);
        creLimitFrame.add(setCreLimitBtn);
    
        JButton SetLimClearBtn = new JButton("Clear");
        SetLimClearBtn.setBounds(217, 162, 80, 32);
        creLimitFrame.add(SetLimClearBtn);
        
        creLimitFrame.setSize(500, 250);
        //METHOD-1 : Using Color Fields
        creLimitFrame.getContentPane().setBackground(Color.CYAN);
    
        //METHOD-2 : Using Color Constructors
        Color color=new Color(3, 117, 145);
        creLimitFrame.getContentPane().setBackground(color);
        
        frame.setVisible(false);
        creLimitFrame.setLayout(null); // Center window
        creLimitFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        creLimitFrame.setVisible(true);
        
        JButton creLimitBackBtn = new JButton("Go Back");
        creLimitBackBtn.setBounds(374, 162, 80, 32);
        creLimitFrame.add(creLimitBackBtn);
        
        creLimitBackBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                creLimitFrame.dispose();
                frame.setVisible(true);
            }
        });


        // Add ActionListener to set credit limit button
        setCreLimitBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                // Check if all required information is provided by the user
                if(creLimitText.getText().isEmpty() || setCreLimitText.getText().isEmpty() || gracePeriodText.getText().isEmpty()){
                    JOptionPane.showMessageDialog(creLimitFrame, "Please provide all information to Set the Credit Limit", "Input Error", JOptionPane.ERROR_MESSAGE);
                } 
                else {
                    try{
                        // Parse the information provided by the user
                        int cardID_C = Integer.parseInt(creLimitText.getText());
                        int gracePeriod = Integer.parseInt(gracePeriodText.getText());
                        int creditLimit = Integer.parseInt(setCreLimitText.getText());
            
                        boolean cardFound = false;
                        // Iterate through the cardList to find the matching CreditCard object
                        for(BankCard cCards : cardList){
                            if(cCards instanceof CreditCard) {
                                CreditCard cre_obj = (CreditCard) cCards;
                                if(cre_obj.getCardId() == cardID_C){
                                    // Check if the credit limit is valid
                                    if(creditLimit <= (cre_obj.getBalanceAmount()*2.5)){
                                        // Set the credit limit and grace period of the CreditCard object
                                        cre_obj.setCreditLimit(creditLimit, gracePeriod);
                                        JOptionPane.showMessageDialog(creLimitFrame, "Credit Limit has been set Successfully.");
                                        creLimitText.setText(""); 
                                        setCreLimitText.setText(""); 
                                        gracePeriodText.setText(""); 
            
                                    } else {
                                        JOptionPane.showMessageDialog(creLimitFrame, "Credit Limit cannot be set as it exceeds 2.5 times of current balance amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                    cardFound = true;
                                    break;
                                }
                            }
                        }
            
                        if (!cardFound) {
                            JOptionPane.showMessageDialog(creLimitFrame, "Card ID does not exist.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
            
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(creLimitFrame, "Please provide only integers in Card Id, Balance Amount, Cvc Number, Interest Rate", "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

       // Add an ActionListener to the clear button, to clear the text fields when it's clicked
        SetLimClearBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                creLimitText.setText(""); // Clear the credit limit text field
                setCreLimitText.setText(""); // Clear the set credit limit text field
                gracePeriodText.setText(""); // Clear the grace period text field
            }
        });
    }

   //create an another instance methods cancelCreditFrame where access modifire is public and return type is void
    public void cancelCreditFrame(){
        JFrame cancelCreCardFrame = new JFrame("Cancel Credit Card");

        JLabel cancelCreCardId = new JLabel("Card ID:");
        JTextField cancelCreCardIdText = new JTextField();
        cancelCreCardIdText.setBounds(115, 77, 152, 22);
        cancelCreCardId.setBounds(27, 80, 91, 22);
        cancelCreCardFrame.add(cancelCreCardIdText);
        cancelCreCardFrame.add(cancelCreCardId);
        
        JButton cancelCreCardBtn = new JButton("Cancel Credit Card");
        cancelCreCardBtn.setBounds(40, 134, 145, 32);
        cancelCreCardFrame.add(cancelCreCardBtn);
        
        JButton CancelCreClearBtn = new JButton("Clear");
        CancelCreClearBtn.setBounds(195, 134, 80, 32);
        cancelCreCardFrame.add(CancelCreClearBtn);
        
        JButton CancelGoBackBtn = new JButton("Go Back");
        CancelGoBackBtn.setBounds(115, 200, 80, 32);
        cancelCreCardFrame.add(CancelGoBackBtn);

        
        cancelCreCardFrame.setSize(307, 300);
        
        // Set background color of the frame
        cancelCreCardFrame.getContentPane().setBackground(Color.CYAN);
        
        // Hide the parent frame
        frame.setVisible(false);
        
        // Set layout and close operation of the cancel credit card frame
        cancelCreCardFrame.setLayout(null);
        cancelCreCardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //METHOD-2 : Using Color Constructors
        Color color = new Color(3, 117, 145);
        cancelCreCardFrame.getContentPane().setBackground(color);
        
        // Display the cancel credit card frame
        cancelCreCardFrame.setVisible(true);
        // Add ActionListener to cancel credit card button
        cancelCreCardBtn.addActionListener(new ActionListener() 
        {
        @Override
            public void actionPerformed(ActionEvent e) {
                // Get the credit card ID entered by the user
                String cardIdStr = cancelCreCardIdText.getText();
                if (cardIdStr.isEmpty()) {
                    // Display error message if card ID is not entered
                    JOptionPane.showMessageDialog(cancelCreCardFrame, "Please enter card ID.");
                    return;
                }
                // Convert the card ID string to integer
                int cardId;
                try {
                    cardId = Integer.parseInt(cardIdStr);
                }
                catch (NumberFormatException ex) {
                    // Display error message if card ID is not a valid integer
                    JOptionPane.showMessageDialog(cancelCreCardFrame, "Please enter a valid card ID.");
                    return;
                }
                // Check if the card ID is present in the cardList
                boolean cardFound = false;
                boolean creditCardFound = false; // Added variable to check if there are any credit cards present
                for (int i = 0; i < cardList.size(); i++) {
                    BankCard bankCard = cardList.get(i);
                    if (bankCard instanceof CreditCard && bankCard.getCardId() == cardId) {
                        cardFound = true;
                        creditCardFound = true; // Set to true if a credit card is found
                        // Remove the card from the cardList
                        cardList.remove(i);
                        break;
                    }
                } 
                
                if (!cardFound) {
                    // Display error message if card ID is not present in the cardList
                    JOptionPane.showMessageDialog(cancelCreCardFrame, "Card ID not found.");
                } 
                else {
                    // Display success message if card is cancelled
                    JOptionPane.showMessageDialog(cancelCreCardFrame, "Credit card cancelled successfully.");
                    // Dispose the cancel credit card frame
                    cancelCreCardFrame.dispose();
                    frame.setVisible(true);
                }
                // If cardList is empty, display message only if no credit cards are present
                if (cardList.isEmpty() && !creditCardFound) {
                    JOptionPane.showMessageDialog(cancelCreCardFrame, "There are no credit cards.");
                    // Dispose the cancel credit card frame
                    cancelCreCardFrame.dispose();
                    frame.setVisible(true);
                }
            }       
        });

        
        CancelCreClearBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                // Clear the text field
                cancelCreCardIdText.setText("");
            }
        });
        
        CancelGoBackBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                cancelCreCardFrame.dispose();
                frame.setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addDebitCardBtn) { // Check if the "add debit card" button was clicked
        frame.dispose(); // Close the current window
        this.addDebitCard(); // Open the "add debit card" window
        }
        else if (e.getSource() == addCreditCardBtn) { // Check if the "add credit card" button was clicked
            frame.dispose(); // Close the current window
            this.addCreditCard(); // Open the "add credit card" window
        }
        else if (e.getSource() == withdrawBtn) { // Check if the "withdraw" button was clicked
            this.withdrawFrame(); // Open the "withdraw" window
            frame.dispose(); // Close the current window
        }
        else if (e.getSource() == setCreditLimitBtn) { // Check if the "set credit limit" button was clicked
            frame.dispose(); // Close the current window
            this.setCreditFrame(); // Open the "set credit limit" window
        }

        else if (e.getSource() == cancelCreditCardBtn) { // Check if the "cancel credit card" button was clicked
            frame.dispose(); // Close the current frame
            this.cancelCreditFrame(); // Call the cancelCreditFrame() method to open the cancel credit card frame
        }

        else if (e.getSource() == displayDebitCardBtn) { // Check if the "display debit card" button was clicked  
            StringBuilder sb = new StringBuilder(); // Create a new StringBuilder object to store the debit card details
            // Loop through the cardList to find DebitCard objects and append their details to the StringBuilder
            for (BankCard card : cardList) {
                if (card instanceof DebitCard) { // Check if the current card is a DebitCard object
                    DebitCard dCard = (DebitCard) card; // Cast the current card to a DebitCard object
                    sb.append("Card ID: ").append(dCard.getCardId()).append("\n"); // Append the card's details to the StringBuilder
                    sb.append("Client Name: ").append(dCard.getClientName()).append("\n"); //Append the client's name to the StringBuilder
                    sb.append("Issuer Bank: ").append(dCard.getIssuerBank()).append("\n"); //Append the issuer's bank to the StringBuilder
                    sb.append("Bank Account: ").append(dCard.getBankAccount()).append("\n"); //Append the bank Account to the StringBuilder
                    sb.append("Balance Amount: ").append(dCard.getBalanceAmount()).append("\n"); //Append the balance Amount to the StringBuilder
                    sb.append("PIN Number: ").append(dCard.getPinNumber()).append("\n\n"); //Append the pin number to the StringBuilder
                }
            }
            
            // Check if any DebitCard objects were found
            if (sb.length() > 0) { // If the StringBuilder contains any text
                // Display the debit card details in a message dialog with the title "Debit Card Details"
                JOptionPane.showMessageDialog(frame, sb.toString(), "Debit Card Details", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Display an error message in a message dialog with the title "Error"
                JOptionPane.showMessageDialog(frame, "No debit cards found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 


        else if (e.getSource() == displayCreditCardBtn){ // Check if the "display credit card" button was clicked
            StringBuilder sb = new StringBuilder(); // Create a new StringBuilder object to store the credit card details
            // Loop through the cardList to find CreditCard objects and append their details to the StringBuilder
            for (BankCard card : cardList) {
                if (card instanceof CreditCard) { // Check if the current card is a CreditCard object
                    CreditCard cCard = (CreditCard) card; // Cast the current card to a CreditCard object
                    sb.append("Card Id: ").append(cCard.getCardId()).append("\n"); // Append the card's details to the StringBuilder
                    sb.append("Client Name: ").append(cCard.getClientName()).append("\n");
                    sb.append("Issuer Bank: ").append(cCard.getIssuerBank()).append("\n");
                    sb.append("Bank Account: ").append(cCard.getBankAccount()).append("\n");
                    sb.append("Balance Amount: ").append(cCard.getBalanceAmount()).append("\n");
                    sb.append("CVC Number: ").append(cCard.getCvcNumber()).append("\n");
                    sb.append("Interest Rate: ").append(cCard.getInterestRate()).append("\n");
                    sb.append("Expiration Date: ").append(cCard.getExpirationDate()).append("\n\n");
                }
            }
            
            // Check if any CreditCard objects were found
            if (sb.length() > 0) { // If the StringBuilder contains any text
                // Display the credit card details in a message dialog with the title "Credit Card Details"
                JOptionPane.showMessageDialog(frame, sb.toString(), "Credit Card Details", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Display an error message in a message dialog with the title "Error"
                JOptionPane.showMessageDialog(frame, "No credit cards found.", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }

    
    }
    
    public static void main(String[] args) {
            
        // Create a new instance of the BankGUI class and assign it to the variable "bankGui"
        BankGUI bankGui = new BankGUI();
            
        // Call the BankGUI constructor to initialize the new object
        // NOTE: The following line is incorrect and will result in a compiler error
        //bankGui.BankGUI();
        // To call the constructor, use the "new" keyword followed by the class name and any arguments for the constructor
        // For example, to create a new BankGUI object with no arguments, use:
        // BankGUI bankGui = new BankGUI();
    }
}




