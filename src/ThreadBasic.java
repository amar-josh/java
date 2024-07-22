public class ThreadBasic extends Thread{
        public void run(){
            System.out.println("Running the thread");
        }

        public static void main(String[] args){
            ThreadBasic T1 = new ThreadBasic();
            T1.start();
        }
}
