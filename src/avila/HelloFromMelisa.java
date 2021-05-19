package avila;

public class HelloFromMelisa {
    private String hello;

    public HelloFromMelisa(String hello){
        this.hello = hello;
    }
    public void display() {
        System.out.format("%s",hello);
    }
}


