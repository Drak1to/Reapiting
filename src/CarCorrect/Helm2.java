package CarCorrect;

public class Helm2 {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Helm2(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Helm2{" +
                "radius=" + radius +
                '}';
    }
}
