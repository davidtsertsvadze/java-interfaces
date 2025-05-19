package transport.models;

import transport.interfaces.transport;

public class bus implements transport {
    @Override
    public void startJourney() {
        System.out.println("ავტობუსი მოძრაობს საავტომობილო გზაზე!");
    }
}
