package Animal;

import java.util.Scanner;

public class Animal {
    private int age;
    private int speed;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(int age, int speed, String name) {
        this.age = age;
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }
    public void changeName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write new name");
        String name = scanner.next();
        System.out.println(name);
    }
}
