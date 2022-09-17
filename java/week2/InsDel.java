import java.util.Scanner;


public class InsDel{

    public static void Insert(int arr[], int n, int pos, int ele)
    {
       int i;
       int newarr[] = new int[n+1];
       // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for(i=0;i<n+1;i++)
        {
            if(i<pos-1)// position se pehle wale elemnts
                newarr[i]=arr[i]; 
            else if (i==pos-1)//element to be inserted
                newarr[i]=ele;
            else
                newarr[i]=arr[i-1];//position se aage wale elements of new array
        }
        for(i=0;i<n+1;i++)
        {
            System.out.print(newarr[i]+" ");
        }
        

    }
   
    public static void Delete(int arr[], int n, int pos, int ele)
    {
        int i;
        for (i=0;i<n-pos-1;i++)
        {
            arr[pos+i]=arr[pos+i+1];
        }
        System.out.println("New array is:");
        for(i=0;i<n-1;i++)
        {
            System.out.print(arr[i]);
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,pos,ele ;
        System.out.println("Enter the size of the array:");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements are:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the position and element to be added:");
        pos=sc.nextInt();
        ele=sc.nextInt();

        Insert(arr,n,pos,ele);
        Delete(arr,n,pos,ele);
    }
}