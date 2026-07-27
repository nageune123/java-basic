class Car {

    String color;
    int speed;

}

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.color = "파랑";
        car.speed = 100;

        System.out.println(car.color);
        System.out.println(car.speed);

    }

}