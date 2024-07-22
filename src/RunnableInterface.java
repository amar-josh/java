public class RunnableInterface implements Runnable {
    public void run(){
        System.out.println("Running the runable interface");
    }
    public static void main(String[] args){
        RunnableInterface r1 = new RunnableInterface();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
