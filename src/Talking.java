public class Talking {
    private String name;
    public Talking(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void talk(){
        System.out.println("Hello");
    }

    public void talk(String name){
        System.out.println("Hello" + " " + name);
    }

    public static void main(String[] args){
        Talking chat = new Talking("Amar");

       chat.talk();
       chat.talk(chat.getName());
    }
}


