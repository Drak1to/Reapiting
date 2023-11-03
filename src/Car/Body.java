package Car;

public class Body {
    private int size;
    private Car car;

    public Body(int size, Car car) {
        this.size = size;
        this.car = car;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Body{" +
                "size=" + size +
                ", car=" + car +
                '}';
    }
}
