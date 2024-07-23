class SequencePrint{
    void print(int n){
        synchronized (this){
            for(int i = 0 ; i < 5; i++){
                System.out.printf("Thread: %s Sequence: %d%n",Thread.currentThread().getName(),  n + i);
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }

    }
}

 class Thread1 extends Thread {
    SequencePrint s;
     Thread1(SequencePrint s){
        this.s = s;
    }
    @Override
    public void run(){
         s.print(1);
    }
}


class Thread2 extends Thread {
    SequencePrint s;
    public Thread2(SequencePrint s){
        this.s = s;
    }

    @Override
    public void run() {
        s.print(6);
    }
}



public class ThreadBasic {

 public static  void main(String[] args){
     SequencePrint s1 = new SequencePrint();
     Thread1 t1 = new Thread1(s1);
     Thread2 t2 = new Thread2(s1);
     t1.setName("Thread1:");
     t2.setName("Thread2:");
     t1.start();
     t2.start();
 }

}



