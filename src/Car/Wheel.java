package Car;

public class Wheel {
    private int number;
    private Car car;

    public Wheel(int number, Car car) {
        this.number = number;
        this.car = car;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "number=" + number +
                ", car=" + car +
                '}';
    }
}
