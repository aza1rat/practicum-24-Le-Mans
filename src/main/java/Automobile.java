public class Automobile {
    private final String name;
    private final int speed;
    private final int distance;

    public Automobile(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.distance = speed * Race.Duration;
    }

    public String getName() {
        return name;
    }

    public int getDistance()
    {
        return distance;
    }
}
