/**
 * there are 4 methods
 * @author (Sakar Paudel)
 * @version (5-09-2023)
 */
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener {

    // Declaring GUI components

    private JFrame frame;

    private JPanel head, debit, credit;

    private JLabel unibank, creditcard, debitcard, issuerbank, clientname, cardid1,
    cardid2, bankaccount, balanceamount, cvc, interest, creditlimit, expdate,
    graceperiod, pin, dateofwithdrawl, withdrawlamt;

    private JTextField issuerbank_, clientname_, cardid1_, bankaccount_, cardid2_,
    balanceamount_, cvc_, interest_, creditlimit_,
    graceperiod_, pin_, withdrawlamt_;

    private JComboBox<String> expdate_Day, expdate_Month, expdate_Year, dateofwithdrawl_Day,
    dateofwithdrawl_Month, dateofwithdrawl_Year;

    private JButton addcreditcard, cancelcreditcard, setcreditlimit, display1, clear1,
    adddebitcard, withdraw, display2, clear2;

    private ArrayList<BankCard> list = new ArrayList<BankCard>();

    //declaring objects
    DebitCard objdebit;
    CreditCard objcredit;

    // constructor
    public BankGUI() {
        String day[] = { "1", "2", "4", "7", "9", "10" };
        String month[] = { "Jan", "Feb", "Mar" };
        String year[] = { "2021", "2022", "2023" };
        //Color color = new Color(199, 200, 212);// creating colors
        Color topiccolor = new Color(0, 200, 248);
        Color buttoncolor = new Color(51, 153, 255);

        // frame and panel
        frame = new JFrame("BankGUI");
        head = new JPanel();
        debit = new JPanel();
        credit = new JPanel();

        // All labels
        unibank = new JLabel("Universal Bank(Pvt) Ltd.");
        creditcard = new JLabel("Credit Card");
        debitcard = new JLabel("Debit Card");

        issuerbank = new JLabel("Issuer Bank");
        clientname = new JLabel("Client Name");
        cardid1 = new JLabel("Card ID");
        cardid2 = new JLabel("Card ID");
        bankaccount = new JLabel("Bank Account");
        balanceamount = new JLabel("Balance Amount");

        cvc = new JLabel("CVC Number");
        interest = new JLabel("Interest Rate");
        creditlimit = new JLabel("Credit Limit");
        expdate = new JLabel("Expiration Date");
        graceperiod = new JLabel("Grace Period");

        pin = new JLabel("PIN Number");
        dateofwithdrawl = new JLabel("Date Of Withdrawl");
        withdrawlamt = new JLabel("Withdrawl Amount");

        // All textfields
        issuerbank_ = new JTextField();
        clientname_ = new JTextField();
        cardid1_ = new JTextField();
        cardid2_ = new JTextField();
        bankaccount_ = new JTextField();
        balanceamount_ = new JTextField();

        cvc_ = new JTextField();
        interest_ = new JTextField();
        creditlimit_ = new JTextField();
        graceperiod_ = new JTextField();

        pin_ = new JTextField();
        withdrawlamt_ = new JTextField();

        // All Buttons
        addcreditcard = new JButton("Add Credit Card");
        cancelcreditcard = new JButton("Cancel Credit Card");
        setcreditlimit = new JButton("Set Credit Limit");
        display1 = new JButton("DISPLAY");
        clear1 = new JButton("CLEAR");

        adddebitcard = new JButton("Add Debit Card");
        withdraw = new JButton("Withdraw");
        display2 = new JButton("DISPLAY");
        clear2 = new JButton("CLEAR");

        // All combobox
        expdate_Day = new JComboBox<String>(day);
        expdate_Month = new JComboBox<String>(month);
        expdate_Year = new JComboBox<String>(year);

        dateofwithdrawl_Day = new JComboBox<String>(day);
        dateofwithdrawl_Month = new JComboBox<String>(month);
        dateofwithdrawl_Year = new JComboBox<String>(year);

        // expdate_Day.setRenderer(new PromptComboBoxRenderer("DAY"));
        // .setRenderer(new PromptComboBoxRenderer("MONTH"));
        // .setRenderer(new PromptComboBoxRenderer("YEAR"));
        // .setRenderer(new PromptComboBoxRenderer("DAY"));
        // .setRenderer(new PromptComboBoxRenderer("MONTH"));
        // .setRenderer(new PromptComboBoxRenderer("YEAR"));

        expdate_Day.setEditable(true);
        expdate_Month.setEditable(true);
        expdate_Year.setEditable(true);
        dateofwithdrawl_Day.setEditable(true);
        dateofwithdrawl_Month.setEditable(true);
        dateofwithdrawl_Year.setEditable(true);

        // ----------------------------------------------------------------------

        // HEAD componenets

        // Title
        head.add(unibank);

        // labels
        head.add(issuerbank);
        head.add(clientname);
        head.add(bankaccount);
        head.add(balanceamount);

        // textfields
        head.add(issuerbank_);
        head.add(clientname_);
        head.add(bankaccount_);
        head.add(balanceamount_);

        // ----------------------------------------------------------------
        // CREDIT components

        // title of credit panel
        credit.add(creditcard);

        // labels of credit
        credit.add(cardid1);
        credit.add(cvc);
        credit.add(interest);
        credit.add(expdate);
        credit.add(creditlimit);
        credit.add(graceperiod);

        // text fields
        credit.add(cardid1_);
        credit.add(cvc_);
        credit.add(interest_);
        credit.add(creditlimit_);
        credit.add(graceperiod_);

        // buttons of credit
        credit.add(addcreditcard);
        credit.add(cancelcreditcard);
        credit.add(setcreditlimit);
        credit.add(display1);
        credit.add(clear1);

        // combobox of credit
        credit.add(expdate_Day);
        credit.add(expdate_Month);
        credit.add(expdate_Year);

        // -----------------------------------------------------------
        // DEBIT components

        // title of debit
        debit.add(debitcard);
        debit.add(cardid2);

        // labels
        debit.add(pin);
        debit.add(dateofwithdrawl);
        debit.add(withdrawlamt);

        // textfield
        debit.add(cardid2_);
        debit.add(pin_);
        debit.add(withdrawlamt_);

        // buttons
        debit.add(adddebitcard);
        debit.add(withdraw);
        debit.add(display2);
        debit.add(clear2);

        // combobox
        debit.add(dateofwithdrawl_Day);
        debit.add(dateofwithdrawl_Month);
        debit.add(dateofwithdrawl_Year);

        // --------------------------------------------------------------
        // HEAD set bounds

        // title of head panel
        unibank.setBounds(250, 30, 520, 55);
        unibank.setFont(new Font("Arial", Font.ITALIC, 44));
        unibank.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        unibank.setHorizontalAlignment(SwingConstants.CENTER);
        unibank.setForeground(topiccolor);

        // labels of head
        issuerbank.setBounds(95, 120, 80, 30);
        clientname.setBounds(95, 190, 80, 30);
        bankaccount.setBounds(641, 120, 90, 30);
        balanceamount.setBounds(630, 190, 122, 30);

        // textfields of head
        issuerbank_.setBounds(215, 120, 180, 30);
        clientname_.setBounds(215, 190, 180, 30);
        bankaccount_.setBounds(764, 120, 180, 30);
        balanceamount_.setBounds(764, 190, 180, 30);

        // -------------------------------------------------------------------------
        // CREDIT set bounds

        // title
        creditcard.setBounds(50, 20, 210, 40);
        creditcard.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        creditcard.setHorizontalAlignment(SwingConstants.CENTER);
        creditcard.setFont(new Font("Arial", Font.BOLD, 34));
        creditcard.setForeground(Color.red);

        // labels
        cardid1.setBounds(55, 80, 60, 30);
        cvc.setBounds(470, 80, 93, 30);
        interest.setBounds(55, 140, 93, 30);
        expdate.setBounds(45, 210, 100, 30);
        creditlimit.setBounds(470, 140, 80, 30);
        graceperiod.setBounds(470, 190, 93, 30);

        // textfields
        cardid1_.setBounds(161, 80, 180, 30);
        cvc_.setBounds(585, 80, 175, 30);
        interest_.setBounds(161, 140, 175, 30);
        creditlimit_.setBounds(585, 140, 175, 30);
        graceperiod_.setBounds(585, 190, 175, 30);

        // buttons
        addcreditcard.setBounds(791, 80, 165, 30);
        addcreditcard.setForeground(buttoncolor);

        cancelcreditcard.setBounds(711, 20, 160, 30);
        cancelcreditcard.setForeground(Color.red);

        setcreditlimit.setBounds(795, 150, 165, 30);
        setcreditlimit.setForeground(Color.red);

        display1.setBounds(524, 250, 163, 30);
        display1.setForeground(buttoncolor);

        clear1.setBounds(751, 250, 163, 30);
        clear1.setForeground(buttoncolor);

        // combobox
        expdate_Day.setBounds(166, 210, 70, 32);
        expdate_Month.setBounds(248, 210, 88, 32);
        expdate_Year.setBounds(345, 210, 75, 32);

        // ------------------------------------------------------------------
        // DEBIT set bounds

        // title
        debitcard.setBounds(40, 15, 200, 40);
        debitcard.setBorder(BorderFactory.createLineBorder(Color.green, 2));
        debitcard.setHorizontalAlignment(SwingConstants.CENTER);
        debitcard.setFont(new Font("Arial", Font.BOLD, 34));
        debitcard.setForeground(Color.GREEN);

        // labels
        cardid2.setBounds(70, 80, 60, 30);
        pin.setBounds(390, 80, 93, 30);
        dateofwithdrawl.setBounds(40, 180, 125, 30);
        withdrawlamt.setBounds(40, 130, 115, 30);

        // textfields
        cardid2_.setBounds(175, 80, 180, 30);
        pin_.setBounds(495, 80, 175, 30);
        withdrawlamt_.setBounds(175, 130, 175, 30);

        // buttons
        adddebitcard.setBounds(770, 80, 160, 30);
        adddebitcard.setForeground(buttoncolor);

        withdraw.setBounds(700, 130, 175, 30);
        withdraw.setForeground(Color.red);

        display2.setBounds(616, 200, 163, 30);
        display2.setForeground(buttoncolor);

        clear2.setBounds(821, 200, 163, 30);
        clear2.setForeground(buttoncolor);

        // combobox
        dateofwithdrawl_Day.setBounds(175, 180, 70, 32);
        dateofwithdrawl_Month.setBounds(255, 180, 88, 32);
        dateofwithdrawl_Year.setBounds(355, 180, 75, 32);

        // ------------------------------------------------------------------
        //adding action listener
        clear1.addActionListener(this);
        display1.addActionListener(this);
        addcreditcard.addActionListener(this);
        setcreditlimit.addActionListener(this);
        cancelcreditcard.addActionListener(this);

        clear2.addActionListener(this);
        display2.addActionListener(this);
        adddebitcard.addActionListener(this);
        withdraw.addActionListener(this);

        // ------------------------------------------------------------------

        //seetbounds of panel and frame
        head.setBounds(10, 10, 1015, 250);
        head.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        credit.setBounds(10, 250, 1015, 300);
        credit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        debit.setBounds(10, 540, 1015, 270);
        debit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        head.setLayout(null);
        debit.setLayout(null);
        credit.setLayout(null);

        frame.add(head);
        frame.add(debit);
        frame.add(credit);

        frame.setLayout(null);
        frame.setSize(1050, 860);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //clears txtfields of creditcard section
    public void clear1()
    {
        issuerbank_.setText("");
        clientname_.setText("");
        cardid1_.setText("");
        bankaccount_.setText("");
        balanceamount_.setText("");
        cvc_.setText("");
        interest_.setText("");
        creditlimit_.setText("");
        graceperiod_.setText("");
        expdate_Day.setSelectedIndex(0);
        expdate_Month.setSelectedIndex(0);
        expdate_Year.setSelectedIndex(0);

    }
    //clears txtfields of debitcard section
    public void clear2()
    {
        issuerbank_.setText("");
        clientname_.setText("");
        cardid2_.setText("");
        bankaccount_.setText("");
        balanceamount_.setText("");
        pin_.setText("");
        withdrawlamt_.setText("");
        dateofwithdrawl_Day.setSelectedIndex(0);
        dateofwithdrawl_Month.setSelectedIndex(0);
        dateofwithdrawl_Year.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent a) 
    {

        //clears the text fields
        if (a.getSource() == clear1) 
        {
            clear1();
            JOptionPane.showMessageDialog(frame, "CREDIT Fields are cleared", "Cleared", JOptionPane.INFORMATION_MESSAGE);
        }

        //clears the textfields
        else if (a.getSource() == clear2) 
        {
            clear2();
            JOptionPane.showMessageDialog(frame, " DEBIT Fields are cleared", "Cleared", JOptionPane.INFORMATION_MESSAGE);
        }

        // calls the display method of creditcard class
        else if (a.getSource() == display1) 
        {
            if (list.isEmpty() == true)
            {
                JOptionPane.showMessageDialog(frame, "Add A Card First", "Empty List", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                boolean creditCardDisplayed = false;
                for(BankCard credobj_each : list)
                {

                    if (credobj_each  instanceof CreditCard)
                    {
                        objcredit = (CreditCard) credobj_each;
                        System.out.println("\nThe Details of  Credit Card are:\n");
                        objcredit.display();
                        creditCardDisplayed = true;
                    }
                }
                if (creditCardDisplayed){
                    JOptionPane.showMessageDialog(frame, "Credit Details Displayed Successfully!", "Details", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "No Details of Credit Card In List !", "Details", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //calls the display method of debitcardclass
        else if (a.getSource() == display2) 
        {

            if (list.isEmpty() == true)
            {
                JOptionPane.showMessageDialog(frame, "Add A Card First", "Empty List", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                boolean debitCardDisplay = false;
                for(BankCard debobj_each : list)
                {

                    if (debobj_each  instanceof DebitCard)
                    {
                        objdebit = (DebitCard) debobj_each;//downcasting
                        System.out.println("\nThe Details of  Debit Card are:\n");
                        objdebit.display();
                        debitCardDisplay = true;                                                
                    }  
                }
                if (debitCardDisplay){
                    JOptionPane.showMessageDialog(frame, "Debit Details Displayed Successfully!", "Details", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "No Details of Debit Card In List !", "Details", JOptionPane.ERROR_MESSAGE);
                }

            }
        }

        //takes input from textfield and stores it in object of creditcard class which is stored in arraylist
        else if (a.getSource() == addcreditcard) 
        {

            if(cardid1_.getText().isEmpty() || clientname_.getText().isEmpty() || issuerbank_.getText().isEmpty() ||  bankaccount_.getText().isEmpty() || balanceamount_.getText()
            .isEmpty() || cvc_.getText().isEmpty() || interest_.getText().isEmpty() )
            {
                JOptionPane.showMessageDialog(frame, "Empty fields!! Enter: cardID, \nclientname, issuerbak, bankaccount, \nbalanceAMount, cvc, interest", "Error", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                //storing text entered in textfields 
                try{
                    int cardid = Integer.parseInt(cardid1_.getText());
                    String clientname = clientname_.getText();
                    String issuerbank = issuerbank_.getText();
                    String bankaccount = bankaccount_.getText();
                    int balanceamount = Integer.parseInt(balanceamount_.getText());
                    int cvc = Integer.parseInt(cvc_.getText());
                    double interest = Double.parseDouble(interest_.getText());
                    boolean exist = false;

                    String Day = expdate_Day.getSelectedItem().toString();
                    String Month = expdate_Month.getSelectedItem().toString();
                    String Year = expdate_Year.getSelectedItem().toString();
                    String expDate = Day + "/" + Month + "/" + Year;

                    for(BankCard credobj_each : list)
                    {
                        if (credobj_each  instanceof CreditCard)
                        {
                            objcredit = (CreditCard) credobj_each;//downcasting
                            if(objcredit.getcardId() == cardid)
                            {
                                exist = true;
                                JOptionPane.showMessageDialog(frame, "Card Already Exists!!!!!!", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                    }
                    if (exist == false)
                    {
                        objcredit = new CreditCard(cardid, clientname, issuerbank, bankaccount, balanceamount, cvc, interest,expDate);//creating object
                        list.add(objcredit);//adding object

                        JOptionPane.showMessageDialog(frame, "Credit Card Successfully Added!!\nCard ID = "+cardid+"\nClient Name = "+clientname+
                            "\nBank Name = "+issuerbank+"\nAccount = "+bankaccount+"\nBalance Amount = "+balanceamount+"\nCVC Number = "+cvc
                            +"\nInterest = "+interest+"\nCard Expiry Date: "+expDate,"Card Added", JOptionPane.INFORMATION_MESSAGE);
                        clear1();
                    }
                }catch(NumberFormatException abc){
                    JOptionPane.showMessageDialog(frame, "ILLEGAL INPUT\n Do not Enter string in Integer", "String in Integer", JOptionPane.ERROR_MESSAGE);
                }

            }
        } 

        
        // calls the cancelcreditcard of creditcard method
        else if (a.getSource() == cancelcreditcard) 
        {  
            if (list.isEmpty() == true)
            {
                JOptionPane.showMessageDialog(frame, "Add A Card First", "Empty List", JOptionPane.ERROR_MESSAGE);
            }

            else if(cardid1_.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Enter the card Id!!!!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                try{
                    int cardid = Integer.parseInt(cardid1_.getText());
                    for(BankCard credobj_each : list)
                    {
                        if (credobj_each  instanceof CreditCard)//checking for instance
                        {
                            objcredit = (CreditCard) credobj_each;//downcasting
                            if(objcredit.getcardId() == cardid)
                            {
                                // using warning msg and storing value in choice
                                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel this card?", "Cancel Card", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

                                //checking if the option chosen is yes
                                if (choice == JOptionPane.YES_OPTION) {
                                    objcredit.cancelcreditcard();//calling cancelcreditcard method of creditcard class using downcasted object
                                    JOptionPane.showMessageDialog(frame,"Card Cancelled!!!\nCard ID = "+objcredit.getcardId(),"Cancelled",JOptionPane.INFORMATION_MESSAGE);
                                    clear1();
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Credit Card Resumed", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                                }

                            }
                            else{
                                JOptionPane.showMessageDialog(frame, "Card Doesn't Exist !!", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                    //exception handling
                }catch(NumberFormatException abc){
                    JOptionPane.showMessageDialog(frame, "ILLEGAL INPUT\n Donot Enter string in Integer", "Value Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }

        
        //calls the setcreditlimit of creditcard
        else if (a.getSource() == setcreditlimit) 
        {
            if (list.isEmpty() == true)
            {
                JOptionPane.showMessageDialog(frame, "Add A Card First", "Empty List", JOptionPane.ERROR_MESSAGE);
            }

            else if(cardid1_.getText().isEmpty() || creditlimit_.getText().isEmpty() || graceperiod_.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Empty fields!! Enter: cardID, \nCreditLimit, GracePeriod ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    //storing text entered in textfields 
                    int cardId = Integer.parseInt(cardid1_.getText());
                    double creditLimit = Double.parseDouble(creditlimit_.getText());
                    int gracePeriod = Integer.parseInt(graceperiod_.getText());
                    boolean creditCardFound = false;
                    for(BankCard credobj_each : list)
                    {
                        if (credobj_each  instanceof CreditCard)//checking for instance
                        {
                            creditCardFound = true;
                            objcredit = (CreditCard) credobj_each;//downcasting
                            if(objcredit.getcardId() == cardId)
                            {
                                if(creditLimit <= 2.5*objcredit.getbalanceAmount())
                                {
                                    JOptionPane.showMessageDialog(null,"Credit Granted Successfully!!"+ "\nCardID = "+objcredit.getcardId()+"\nCredit Limit = "+creditLimit+"\nGrace Period = "+gracePeriod , "Credit Limit", JOptionPane.INFORMATION_MESSAGE);
                                    objcredit.setcreditlimit(creditLimit,gracePeriod);
                                    clear1();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Credit Limit Is High \n Try entering a Smaller Amount ","Credit Not granted",JOptionPane.ERROR_MESSAGE);
                                }   
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(frame," Credit Card Not Found","error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                    if (!creditCardFound) {
                        JOptionPane.showMessageDialog(null, "Credit Card objects not found in the list.", "No Credit Card Found", JOptionPane.ERROR_MESSAGE);
                    }
                    //exception handling
                }catch(NumberFormatException abc){
                    JOptionPane.showMessageDialog(frame, "ILLEGAL INPUT\n Donot Enter string in Integer", "String In Integer", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        
        else if (a.getSource() == adddebitcard) 
        {

            if(balanceamount_.getText().isEmpty() || cardid2_.getText().isEmpty() || bankaccount_.getText().isEmpty() ||  issuerbank_.getText().isEmpty() || clientname_.getText()
            .isEmpty() || pin_.getText().isEmpty()  )
            {
                JOptionPane.showMessageDialog(frame, "Empty fields!! Enter: cardID, \nclientname, bankaccount, pin,\nbalance, issuerbank", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try{
                    //storing text entered in textfields 
                    int balanceamount = Integer.parseInt(balanceamount_.getText());
                    int cardid = Integer.parseInt(cardid2_.getText());
                    String bankaccount = bankaccount_.getText();
                    String issuerbank = issuerbank_.getText();
                    String clientname = clientname_.getText();
                    int pin = Integer.parseInt(pin_.getText());
                    boolean exist = false;

                    //iterates through the list
                    for(BankCard debobj_each : list)
                    {
                        if (debobj_each  instanceof DebitCard)
                        {
                            objdebit = (DebitCard) debobj_each;//downcasting
                            if(objdebit.getcardId() == cardid)
                            {
                                exist = true;
                                JOptionPane.showMessageDialog(frame, "Card Already Exists!!!!!!", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                    }
                    if (exist == false)
                    {
                        objdebit = new DebitCard(balanceamount, cardid, bankaccount, issuerbank, clientname, pin);//creates object
                        list.add(objdebit);//adds to the list
                        JOptionPane.showMessageDialog(frame, "Debit Card Successfully Added!!\nCard ID = "+cardid+"\nClient Name = "+clientname+
                            "\nBank Name = "+issuerbank+"\nAccount = "+bankaccount+"\nBalance Amount = "+balanceamount+"\nPIN Number = "+pin,
                            "Card Added", JOptionPane.INFORMATION_MESSAGE);
                        clear2();
                    }
                    //exception handling
                }catch(NumberFormatException ab){
                    JOptionPane.showMessageDialog(frame, "ILLEGAL INPUT\n Cannot Take String In INTEGER Input", "String In Integer", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //calls the withdraw mehtod of debitcard class
        else if (a.getSource() == withdraw) 
        {

            if (list.isEmpty() == true)
            {
                JOptionPane.showMessageDialog(frame, "Add A Card First", "Empty List", JOptionPane.ERROR_MESSAGE);
            }

            else if(cardid2_.getText().isEmpty() || withdrawlamt_.getText().isEmpty() || pin_.getText().isEmpty() || dateofwithdrawl_Year.getSelectedItem().toString().isEmpty() 
            || dateofwithdrawl_Month.getSelectedItem().toString().isEmpty() || dateofwithdrawl_Year.getSelectedItem().toString().isEmpty() )
            {
                JOptionPane.showMessageDialog(frame, "Empty fields!! Enter: cardID, pin,\n withdrawl amt, date", "Error", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                try{
                    //storing text entered in textfields
                    int cardid = Integer.parseInt(cardid2_.getText());
                    int withdrawlamt = Integer.parseInt(withdrawlamt_.getText());
                    int pin = Integer.parseInt(pin_.getText());

                    String Day = dateofwithdrawl_Day.getSelectedItem().toString();
                    String Month = dateofwithdrawl_Month.getSelectedItem().toString();
                    String Year = dateofwithdrawl_Year.getSelectedItem().toString();
                    String dateofWithdrawl = Day + "/" + Month + "/" + Year;
                    boolean withdrawn = false;
                    boolean debitCardFound = false;

                    for(BankCard debobj_each : list)
                    {

                        if (debobj_each  instanceof DebitCard)
                        {
                            objdebit = (DebitCard) debobj_each;
                            debitCardFound = true;

                            if(objdebit.getcardId() == cardid)
                            {

                                if(objdebit.getPINnumber() == pin)
                                {

                                    if(withdrawlamt <= objdebit.getbalanceAmount())
                                    {
                                        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to withdraw?\n Amount: "+withdrawlamt+" From,\n Card: "+cardid, "Withdraw Money", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

                                        if (choice == JOptionPane.YES_OPTION) {
                                            JOptionPane.showMessageDialog(frame,"Transaction Successful \nCard ID = "+objdebit.getcardId()+"\nAmount: "+withdrawlamt+"\nDate: "+dateofWithdrawl,"Withdraw",JOptionPane.INFORMATION_MESSAGE);
                                            objdebit.Withdraw(withdrawlamt,dateofWithdrawl,pin);
                                            clear2();
                                        } else {
                                            JOptionPane.showMessageDialog(frame, "Transaction Cancelled", "Error", JOptionPane.INFORMATION_MESSAGE);
                                        }    
                                    }

                                    else{
                                        JOptionPane.showMessageDialog(frame," Insufficient Balance!","Error",JOptionPane.ERROR_MESSAGE);
                                    }

                                }
                                else{
                                    JOptionPane.showMessageDialog(frame,"Incorrect pin number!\nTry Again.","Pin",JOptionPane.ERROR_MESSAGE);
                                }
                            }

                            else{
                                JOptionPane.showMessageDialog(frame," Debit Card Not Found","error",JOptionPane.ERROR_MESSAGE);
                            }
                        }  
                    }

                    if (!debitCardFound) {
                        JOptionPane.showMessageDialog(null, "Debit Card objects not found in the list.", "No Debit Card Found", JOptionPane.ERROR_MESSAGE);
                    }
                    // exception handling
                }catch(NumberFormatException num){
                    JOptionPane.showMessageDialog(frame,"Illegal Input\nDonot Enter string in Integer","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            } 
        }  
    }
    // main method
    public static void main(String[] args) {
        new BankGUI();// Calling Constructor of Class
    }
}