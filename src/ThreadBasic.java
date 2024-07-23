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
    SequencePrint sequence;
     Thread1(SequencePrint sequence){
        this.sequence = sequence;
    }
    @Override
    public void run(){
        sequence.print(1);
    }
}


class Thread2 extends Thread {
    SequencePrint sequence;
    public Thread2(SequencePrint sequence){
        this.sequence = sequence;
    }

    @Override
    public void run() {
        sequence.print(6);
    }
}



public class ThreadBasic {

 public static  void main(String[] args){
     SequencePrint s1 = new SequencePrint();
     Thread1 sequence1 = new Thread1(s1);
     Thread2 sequence2 = new Thread2(s1);
     sequence1.setName("Thread1:");
     sequence2.setName("Thread2:");
     sequence1.start();
     sequence2.start();
 }

}



