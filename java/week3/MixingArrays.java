import java.util.Scanner;

class Mixer
{
    Scanner sc = new Scanner(System.in);
    int arr[];

    void accept(){
        System.out.println("Enter strength of array: ");
        int n=sc.nextInt();
        arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    Mixer mix(Mixer A){
        int i=0,j=0,k=0;
        int size = arr.length + A.arr.length;
        Mixer merged = new Mixer();
        merged.arr = new int[size];

        while(i<arr.length && j<A.arr.length){
            if(this.arr[i]<A.arr[j]){
                merged.arr[k++]=this.arr[i++];
            }else{
                merged.arr[k++]=A.arr[j++];
            }
        }
        while(i<arr.length){
            merged.arr[k++]=this.arr[i++];
        }
        while(j<A.arr.length){
            merged.arr[k++]=A.arr[j++];
        }
        return merged;
    }
    void display(){
        System.out.println("The resultant array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");  //indirectly its C.arr[i]
        }
    }
}

class MixingArrays
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mixer A = new Mixer();
        Mixer B = new Mixer();
        Mixer C = new Mixer();

        A.accept();
        B.accept();

        C=B.mix(A);

        //diplaying the merged array
        C.display();
    }
}