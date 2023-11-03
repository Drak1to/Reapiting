package Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write helm radius");
        int radius = scanner.nextInt();
        System.out.println("Write size of body");
        int size = scanner.nextInt();
        System.out.println("Write number of wheels");
        int number = scanner.nextInt();
        Car car = new Car(radius,size,number);
        System.out.println(car);
        System.out.println("Write 1 for helm changing");
        System.out.println("Write 2 for body changing");
        System.out.println("Write 3 for wheel changing");
        System.out.println("Write 4 for exit");
        while (true) {
            String choose = scanner.next();
            scanner.nextLine();
            switch (choose) {
                case "1": {
                    car.helmChanging();
                    break;
                }
                case "2": {
                    car.bodyChanging();
                    break;
                }
                case "3":{
                    car.wheelChanging();
                    break;
                }
                case "4": {
                    System.exit(0);
                }

            }
        }
    }



}