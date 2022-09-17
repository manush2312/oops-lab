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
        this.accno=temp++;
        this.type=type;
        this.bal=bal;
    }

    void displpay()
    {
        System.out.println("Name of the account holder:"+name+"\n Account Number:"+accno+"\n Account Type:"+type+"\n Rate of Interest:"+roi+"\n Balance:"+bal);
    }
}





public class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("....Welcome to the Bank....");

        System.out.println("Enter the number of Accounts to be Created.");
        int n = sc.nextInt();

        Bank_acc c[] = new Bank_acc[n];
        //Bank_acc c1 = new Bank_acc(); // calling default constructor..
        // c[0].displpay();

        for(int i=0; i<n; i++)
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

    for(int i=0; i<n; i++)
    {
        c[i].displpay();
    }
    
        
        

        
    }
}