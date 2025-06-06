package Transport2.models;
import Transport2.abstracts.Transport;

public class Car extends Transport {
    public Car(String name) {
        super(name);
    }
    @Override
    public void move(){
        System.out.println("Car is driving on the road");
    }
}
