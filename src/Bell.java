public class Bell {
    boolean ding = true;

    void sound() {
        if (ding) {
            System.out.print("ding ");
        } else {
            System.out.print("dong ");
        }
        ding = !ding;
    }

    public static void main(String[] args) {
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();

        double x = (double) ((-1)*4)/(2*4);
        System.out.println(x);
    }
}
