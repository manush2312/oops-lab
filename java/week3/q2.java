import java.util.Scanner;

class Time
{
    int hrs;
    int min;
    int sec;


    void assign(int hrs, int min, int sec)
    {
        this.hrs=hrs;
        this.min=min;
        this.sec=sec;
    }

    void display()
    {
        System.out.println(hrs+":"+min+":"+sec);
    }

    Time Add(Time t2)
    {
        Time ans = new Time();
        ans.hrs = hrs + t2.hrs;
        ans.min = min + t2.min;
        ans.sec = sec + t2.sec;
        if(ans.min > 60)
        {
            ans.hrs += 1;
            ans.min = ans.min-60;
        }
       
        if(ans.sec > 60)
        {
            ans.min += 1; 
            ans.sec = ans.sec-60;
        }
        return ans;
    }

    Time Subtract(Time t2)
    {
        
        Time jawab = new Time();
        if(sec<t2.sec)
        {
            sec = sec + 60;
            min = min -1;
            jawab.sec = sec-t2.sec;
        }
        else
        { 
            jawab.sec = sec-t2.sec;
        }
         if(min<t2.min)
        {
            min = min+60;
            hrs = hrs -1;
            jawab.min = min - t2.min;
        }
        else{
            jawab.min = min - t2.min;
        }

        jawab.hrs = hrs - t2.hrs;


        return jawab;
    
    
    }

    

    
    
}
















public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();
        Time t4 = new Time();

        System.out.println("Enter the hours, minutes and seconds for t1:");
        int hrs1 = sc.nextInt();
        int min1 = sc.nextInt();
        int sec1 = sc.nextInt();

        System.out.println("Enter the hours, minutes and seconds for t2:");
        int hrs2 = sc.nextInt();
        int min2 = sc.nextInt();
        int sec2 = sc.nextInt();

        t1.assign(hrs1,min1,sec1);
        t2.assign(hrs2,min2,sec2);

        t1.display();
        t2.display();

        t3 = t1.Add(t2);
        System.out.println("Time after addition is:");
        t3.display();

        
        if(t1.hrs>t2.hrs){
        t4 = t1.Subtract(t2);
        System.out.println("Time after subtraction is:");
        t4.display();
        }
        else 
        {
            System.out.println("...Subtraction is not Possible...");
        }

        

        
    }
    
}
