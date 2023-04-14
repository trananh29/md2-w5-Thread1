public class Main {

   public static void main(String[] args) {
    System.out.println(" Main thread is running.............");
    RunnableDemo demo1 = new RunnableDemo("hello")  ;
    RunnableDemo demo2= new RunnableDemo("Goodbye");
    demo1.start();
    demo2.start();
    System.out.println(" Main thread is Stopped............");
 } 
}
