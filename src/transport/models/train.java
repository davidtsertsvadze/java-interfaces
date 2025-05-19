package transport.models;

import transport.interfaces.transport;

public class train implements transport {
    @Override
    public void startJourney() {
        System.out.println("მატარებელი მოძრაობს სარკინიგზო რელსებზე!");
    }
}
