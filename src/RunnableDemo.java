public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;



    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating.... " + threadName);
    }

    @Override
    public void run() {
      System.out.println(" Running..." + threadName);

      try {
        for (int i=0; i<5;i++){
            System.out.println("Thread " + threadName+ "\t" + i);
          }
          Thread.sleep(1000);
        
      } catch (InterruptedException e) {
        
        System.out.println("System is InterruptedException");
      }
      System.out.println("Thread: " + threadName + " is existing");
    }
    public void start() {
        System.out.println(" Starting " + threadName);
        if (t==null) {
            t= new Thread(this,threadName);
            t.start();
        } 
    }
    

    
}
