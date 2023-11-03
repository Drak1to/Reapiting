package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write age of animal");
//        int age = scanner.nextInt();
//        System.out.println("Write speed of animal");
//        int speed = scanner.nextInt();
//        System.out.println("Write name of animal");
//        String name = scanner.next();
        Animal animal = new Animal(2,36,"Leopard");
        Animal animal1 = new Animal(50, 2,"Turtle");
        Animal animal2 = new Animal(6, 15, "Gorilla");
        System.out.println(("Name- " + animal.getName())+ "   "  + animal.getAge() + " years     " + animal.getSpeed() + " km/hour" );
        System.out.println("////////////////////////////////////");
        System.out.println(("Name- " + animal1.getName())+ "   "  + animal1.getAge() + " years     " + animal1.getSpeed() + " km/hour" );
        System.out.println("////////////////////////////////////");
        System.out.println(("Name- " + animal2.getName())+ "   "  + animal2.getAge() + " years     " + animal2.getSpeed() + " km/hour" );
        System.out.println("////////////////////////////////////");
        System.out.println("Changing animal");
        System.out.println("..........................................................");
        animal.setName("Board");
        animal.setAge(3);
        animal.setSpeed(15);
        System.out.println(("Name- " + animal.getName())+ "   "  + animal.getAge() + " years     " + animal.getSpeed() + " km/hour" );
        System.out.println("..........................................................");
        animal1.setName("Eagle");
        animal1.setAge(4);
        animal1.setSpeed(25);
        System.out.println(("Name- " + animal1.getName())+ "   "  + animal1.getAge() + " years     " + animal1.getSpeed() + " km/hour" );
        System.out.println("..........................................................");
        animal2.setName("Puma");
        animal2.setAge(3);
        animal2.setSpeed(25);
        System.out.println(("Name- " + animal2.getName())+ "   "  + animal2.getAge() + " years     " + animal2.getSpeed() + " km/hour" );
        System.out.println("..........................................................");




    }
}
