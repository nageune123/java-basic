class Animal {

    void sound() {
        System.out.println("동물");
    }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("멍멍");
    }

    void bark() {
        System.out.println("왈왈");
    }

}

public class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();

    }
}