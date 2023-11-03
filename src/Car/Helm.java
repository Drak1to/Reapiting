package Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helm {
    private int radius;
    private Car car;


    public Helm(int radius, Car car) {
        this.radius = radius;
        this.car = car;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "radius=" + radius +
                ", car=" + car +
                '}';
    }
}
