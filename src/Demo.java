
class Sender{
    public void send(String message){
        System.out.println(message);
        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

class ThreadedSend extends Thread{
    private Sender sender;
    private String message;
    ThreadedSend(Sender sender, String message){
        this.sender = sender;
        this.message = message;
    }
    public void run(){
        synchronized (sender){
            sender.send(message);
        }
    }
}

public class Demo{
    public static void main(String[] args) {
        Sender sender = new Sender();
        ThreadedSend hiMessage = new ThreadedSend(sender, "Hi");
        ThreadedSend byeMessage = new ThreadedSend(sender, "Bye");
        hiMessage.start();
        byeMessage.start();
    }
}



