import java.util.Scanner;

 class Bank_acc{
    String name;
    int accno;
    String type;
    int bal;
    static float roi=6.2f;
    static int temp = 2109;

    Bank_acc() // default constructor..
    {
        System.out.println("Here the default constructor has been called");
    }

    Bank_acc(String name,  String type, int bal)
    {
        this.name=name;
        this.accno=temp++;  // no need to pass acoount number from user system is creating by itself..
        this.type=type;
        this.bal=bal;
    }

    void displpay()
    {
        System.out.println("Name of the account holder:"+name+"\n Account Number:"+accno+"\n Account Type:"+type+"\n Rate of Interest:"+roi+"\n Balance:"+bal);
    }

    void deposit(int rup)
    {
        System.out.println("The new Amount is:");
        bal = bal+rup;
        System.out.println(bal);
    }

    void withdraw(int rup)
    {
        System.out.println("The new AMount is:");
        bal = bal - rup;
        System.out.println(bal);
    }
}





public class Bank{
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("....Welcome to the Bank....");

        System.out.println("Enter the number of Accounts to be Created.");
        int n = sc.nextInt();

        Bank_acc c[] = new Bank_acc[n];  //array of refernce is created.. 
        //Bank_acc c1 = new Bank_acc(); // calling default constructor..
        // c[0].displpay();

        for( i=0; i<n; i++)
        {
        System.out.println("Enter the name of the account holder:");
        String name = sc.next();
       // System.out.println("Your Account NUmber is "+accno);
        System.out.println("Please enter the type of Account(Savings/Salary):");
        String type = sc.next();
        System.out.println("Please enter the balance of your account(minimum bal=1000/-):");
        int bal = sc.nextInt();
        //int no = Bank_acc.accno;
        while(bal<1000)
        {
            System.out.println("Please Enter minimum balance..");
            bal = sc.nextInt();
            
        }

        c[i] = new Bank_acc(name,type,bal);
    }

    for( i=0; i<n; i++)
    {
        c[i].displpay();
    }


    //deposit and withdraw method
    int val=0;
    int rup=0;
    
    do{
        System.out.println("Enter your account number:");
        i = sc.nextInt();
        System.out.println("Welcome to account "+i);
        System.out.println("Enter the values corresponding to your wish:\n 1.Deposit\n 2.Withdraw\n 3.Display Details\n 4.Exit");
        val = sc.nextInt();
        if(val==1)
        {
            System.out.println("Enter the amount to be deposited");
            rup=sc.nextInt();
            c[i].deposit(rup);
        }

        else if(val==2)
        {
            System.out.println("Enter the amount to be withdrawn:");
            rup=sc.nextInt();
            if(c[i].bal<rup)
            {
                System.out.println("...Please enter a valid number...");
            }else{
            c[i].withdraw(rup);}
        }

        else if(val==3)
        {
            c[i].displpay();
        }



    }while(val != 4);
    
        
        

        
    }
}