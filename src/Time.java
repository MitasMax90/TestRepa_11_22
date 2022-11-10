public class Time {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        try {
            while (true) {
                thread.wait(1000);
                System.out.println(thread);
            }
        } catch (InterruptedException e) {
            System.out.println("Be Eb Be");
        }
    }
}
