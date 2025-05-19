package transport;

import transport.models.bus;
import transport.models.train;

public class Main {
    public static void main(String[] args) {
        bus bus = new bus();
        bus.startJourney();

        train train = new train();
        train.startJourney();
    }
}