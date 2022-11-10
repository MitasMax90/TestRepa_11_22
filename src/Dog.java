public class Dog {

    private String name;
    private int age = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String bark() {
        return "woof";
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Breed", 4);
        Dog dog2 = new Dog("Feel", 5);
        Dog dog3 = new Dog("Shon", 3);

        System.out.println(dog1.bark());
    }
}
