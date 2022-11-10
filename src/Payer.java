public class Payer {
    String surname;
    String name;
    String adress;
    String cardNumber;

    public Payer(String surname, String name, String adress, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.adress = adress;
        this.cardNumber = cardNumber;
    }

    public String toString() {
        return "Payer: " + surname + " " + name + ", address: " + adress + ", card: " + cardNumber;
    }

    public static void main(String[] args) {
        Payer p1 = new Payer("Ivanov", "Ivan", "Mendeleeva 3", "44");
        Payer p2 = new Payer("Petrov", "Petr", "Mendeleeva 5", "31");
        Payer p3 = new Payer("Stepanov", "Stepan", "Mendeleeva 4", "28");
        Payer p4 = new Payer("Shelestov", "Sergey", "Mendeleeva 2", "47");

        System.out.println(p2);
    }
}

