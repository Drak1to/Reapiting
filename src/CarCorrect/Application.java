package CarCorrect;



import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write helm radius");
        Integer radius = scanner.nextInt();
        System.out.println("Write size of body");
        Integer size = scanner.nextInt();
        System.out.println("Write number of wheels");
        Integer number = scanner.nextInt();
       Car2 car2 = new Car2(new Helm2(radius), new Wheel2(number), new Body2(size));
        System.out.println(car2);

        System.out.println("Write 1 for helm changing");
        System.out.println("Write 2 for body changing");
        System.out.println("Write 3 for wheel changing");
        System.out.println("Write 4 for show details");
        System.out.println("Write 5 for exit");

        while (true) {
            String choose = scanner.next();
            scanner.nextLine();
            switch (choose) {

                case "1": {
                    car2.helmChanging();
                    break;
                }

                case "2": {
                    car2.bodyChanging();
                    break;
                }

                case "3":{
                    car2.wheelChanging();
                    break;
                }

                case "4": {
                    car2.showDetails();
                    break;
                }

                case "5": {
                    System.out.println("You finished your car");
                    System.exit(0);

                }

            }
        }
    }

    }

