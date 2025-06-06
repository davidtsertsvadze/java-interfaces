package Transport2.models;
import Transport2.abstracts.Transport;

public class Airplane extends Transport {
    public Airplane(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Airplane is flying in the sky");
    }
}
