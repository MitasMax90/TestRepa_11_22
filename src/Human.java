public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 55;

    }

    public Human(String name, String address) {
        this.name = name;
        this.age = 31;
        this.weight = 63;
        this.address = address;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.weight = 41;
        this.work = work;
    }

    public Human(int age, int weight, String address, String work) {
        this.name = "Steve";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}
