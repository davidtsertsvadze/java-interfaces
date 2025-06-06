package Transport2;
import Transport2.abstracts.Transport;
import Transport2.models.Airplane;
import Transport2.models.Car;
import Transport2.models.Train;

public class Main {

    public static void main(String[] args) {
        Transport[] transports = {
                new Car("Toyota"),
                new Airplane("Boing 747"),
                new Train("Tbilisi express")
        };

        for (Transport t : transports) {
            t.move();
        }
    }

}
