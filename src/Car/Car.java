package Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
    private int helm;
    private int wheel;
    private int body;

    public int getHelm() {
        return helm;
    }

    public void setHelm(int helm) {
        this.helm = helm;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public Car(int helm, int wheel, int body) {
        this.helm = helm;
        this.wheel = wheel;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "helm=" + helm +
                ", wheel=" + wheel +
                ", body=" + body +
                '}';
    }
    public void helmChanging(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want increase or reduce radius? I/R/N");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase("I")){
                System.out.println("Write number of increasing");
                int inc = scanner.nextInt();
                int sum = 0;
               sum = helm + inc;
                System.out.println("Helm radius " + sum);
            } else if(answer.equalsIgnoreCase("R")){
                System.out.println("Write number of reducing");
                int red = scanner.nextInt();
                int sum = helm;
                sum = helm - red;
                System.out.println("Helm radius " + sum );
            }else {
                answer.equalsIgnoreCase("N");
                System.out.println("Radius accepted" + helm);
            }
        System.out.println("Wheel " + wheel);
        System.out.println("Body " + body);

    }
    public void wheelChanging(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want increase or reduce number of wheel? I/R/N");
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("I")){
            System.out.println("Write number of increasing");
            int inc = scanner.nextInt();
            int sum = 0;
            sum = wheel + inc;
            System.out.println("Wheel number " + sum);
        } else if(answer.equalsIgnoreCase("R")){
            System.out.println("Write number of reducing");
            int red = scanner.nextInt();
            int sum = wheel;
            sum = wheel - red;
            System.out.println("Wheel numbers " + sum );
        }else {
            answer.equalsIgnoreCase("N");
            System.out.println("Wheels accepted" + wheel);
        }
        System.out.println("Helm " + helm);
        System.out.println("Body " + body);

    }
    public void bodyChanging(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want increase or reduce size of body? I/R/N");
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("I")){
            System.out.println("Write number of increasing");
            int inc = scanner.nextInt();
            int sum = 0;
            sum = body + inc;
            System.out.println("Size of body " + sum);
        } else if(answer.equalsIgnoreCase("R")){
            System.out.println("Write number of reducing");
            int red = scanner.nextInt();
            int sum = body;
            sum = body - red;
            System.out.println("Size of body " + sum );
        }else {
            answer.equalsIgnoreCase("N");
            System.out.println("Body accepted" + body);
        }
        System.out.println("Helm " + helm);
        System.out.println("Wheel " + wheel);

    }


}
