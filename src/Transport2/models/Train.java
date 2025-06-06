package Transport2.models;
import Transport2.abstracts.Transport;

public class Train extends Transport {
    public Train(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Train is running on rails");
    }
}
