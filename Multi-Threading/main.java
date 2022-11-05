class myThread implements Runnable{
    String threadname;

    myThread(String name){
        this.threadname = name;
    }

    @Override
    public void run() {   // this is entry point of thread..
        System.out.println(threadname + " STARTING");
        try{
            for(int i=0; i<10; i++){
                Thread.sleep(400);
                System.out.println("In " + threadname + "count is"+ i);
            }
        }

        catch(InterruptedException exc){
            System.out.println(threadname +" Interrupted");
        }
        System.out.println(threadname + " terminating");

       
        
    }
    
}


class main{
    public static void main(String[] args) {
        System.out.println("Main thread starting...");

        myThread mt = new myThread("child #1");  // creating myThread object...

        Thread newthrd = new Thread(mt);  // constructing a thread on the object mt...

        newthrd.start();   // starting execution of the thread.. 
        // newthrd.start(), will call void run() function...

        for(int i=0 ; i<50; i++){
            System.out.println("*");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main Thread interrupted..");
                exc.printStackTrace();
            }
        }
        
        System.out.println("Main thread ending..");
    }
}