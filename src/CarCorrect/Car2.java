package CarCorrect;



import java.util.Scanner;

public class Car2 {
    private Helm2 helm;
    private Wheel2 wheel;
    private Body2 body;

    public Car2(Helm2 helm, Wheel2 wheel, Body2 body) {
        this.helm = helm;
        this.wheel = wheel;
        this.body = body;
    }

    public Helm2 getHelm() {
        return helm;
    }

    public void setHelm(Helm2 helm) {
        this.helm = helm;
    }

    public Wheel2 getWheel() {
        return wheel;
    }

    public void setWheel(Wheel2 wheel) {
        this.wheel = wheel;
    }

    public Body2 getBody() {
        return body;
    }

    public void setBody(Body2 body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "helm=" + helm +
                ", wheel=" + wheel +
                ", body=" + body +
                '}';
    }
    public void wheelChanging(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want increase or reduce number of wheel? I/R/N");
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("I")){
            System.out.println("Write number of increasing");

            int inc = scanner.nextInt();
            int w = getWheel().getNumber();
            int sum = w + inc;
            wheel.setNumber(w + inc);

//
//            int sum = 0;
//           sum = wheel + inc;
            System.out.println(w + " + " + inc + " = " + sum );
            System.out.println("Wheel number " + sum);
//
        } else if(answer.equalsIgnoreCase("R")){
            System.out.println("Write number of reducing");
//
            int red = scanner.nextInt();
            int w = wheel.getNumber();
            int sum = w - red;
            wheel.setNumber(w - red);
//            int sum = wheel;
//            sum = wheel - red;
//
            System.out.println(w + " - " + red + " = " + sum );
            System.out.println("Wheel number " + sum);
//
        }else {
            answer.equalsIgnoreCase("N");
            System.out.println("Wheels accepted" + wheel);

        }
        System.out.println("Helm radius " + helm);
        System.out.println("Body size " + body);

    }
    public void bodyChanging(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want increase or reduce size of body? I/R/N");
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("I")){
            System.out.println("Write number of increasing");

            int inc = scanner.nextInt();
            int w = getBody().getSize();
            int sum = w + inc;
           body.setSize(w + inc);
//
//            int sum = 0;
//           sum = wheel + inc;
            System.out.println(w + " + " + inc + " = " + sum );
            System.out.println("Size of body " + sum);
//
        } else if(answer.equalsIgnoreCase("R")){
            System.out.println("Write number of reducing");
//
            int red = scanner.nextInt();
            int w = body.getSize();
            int sum = w - red;
            body.setSize(w - red);
//            int sum = wheel;
//            sum = wheel - red;
System.out.println(w + " - " + red + " = " + sum );
            System.out.println("Body size  " + body );
//
        }else {
            answer.equalsIgnoreCase("N");
            System.out.println("Size accepted" + wheel);

        }
        System.out.println("Helm radius " + helm);
        System.out.println("Wheel number " + wheel);

    }

    public void helmChanging(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want increase or reduce radius of helm? I/R/N");
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("I")){
            System.out.println("Write number of increasing");

            int inc = scanner.nextInt();
            int w = helm.getRadius();
            int sum = w + inc;
            helm.setRadius(w + inc);
//
//            int sum = 0;
//           sum = wheel + inc;
            System.out.println(w + " + " + inc + " = " + sum );
            System.out.println("Radius of helm  " + sum);
//
        } else if(answer.equalsIgnoreCase("R")){
            System.out.println("Write number of reducing");
//
            int red = scanner.nextInt();
            int w = helm.getRadius();
            int sum = w - red;
           helm.setRadius(w - red);
//            int sum = wheel;
//            sum = wheel - red;
System.out.println(w + " - " + red + " = " + sum );
            System.out.println("Radius of helm  " + sum);
//
        }else {
            answer.equalsIgnoreCase("N");
            System.out.println("Radius accepted" + helm);

        }
        System.out.println("Body size " + body);
        System.out.println("Wheel number " + wheel);

    }
    public void showDetails(){
        System.out.println("Number of wheels " + wheel);
        System.out.println("Size of body " + body);
        System.out.println("Radius of helm " + helm);


    }
}
