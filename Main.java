class Dog {

    String name;

    Dog(String n) {
        name = n;
    }

    void bark() {
        System.out.println(name + " : 멍멍!");
    }

}

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("바둑이");

        dog.bark();

    }

}