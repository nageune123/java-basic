class Person {

    private String name;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

}

public class Main {

    public static void main(String[] args) {

        Person p = new Person();

        p.setName("준");

        System.out.println(p.getName());

    }

}