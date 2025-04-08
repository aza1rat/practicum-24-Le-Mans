public class Automobile {
    public final String name;
    private final int speed;
    public final int distance;

    public Automobile(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.distance = speed * Race.DURATION;
    }
}
