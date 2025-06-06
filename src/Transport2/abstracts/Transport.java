package Transport2.abstracts;

public abstract class Transport {
    String name;

    public Transport(String name) {
        this.name = name;
    }

    public abstract void move();
}
