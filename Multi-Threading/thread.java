class Mythread extends Thread{
    Mythread(String name){
        super(name);
        start();
    }

    //new thread starts independent of main thread..
    // both the threads will do their work.. i.e. independent of each other..
    public void run(){
        System.out.println(getName() + "starting.");
        try {
            for(int i=0; i<10; i++){
                Thread.sleep(400);
                System.out.println("In " +getName()+" count" +i);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName()+" interrupted");
        }
        System.out.println(getName() +" terminating");
    }
}



public class thread {
    public static void main(String[] args) {
        System.out.println("Main thread starting..");

        Mythread mt = new Mythread("CHILD##");

        for(int i=0; i<50; i++){
            System.out.print("*");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException exc){
                System.out.println("Main thread Interrupted");
            }
        }

        System.out.println("Main thread terminated..");
    }
}
// creating multiple threads
