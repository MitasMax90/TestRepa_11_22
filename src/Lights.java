public class Lights {
    public static void main(String[] args) {
        String trafficSignal = "Yellow";

        if (trafficSignal == "Red") {
            System.out.println("Stop");
        } else if (trafficSignal == "Green") {
            System.out.println("Go");
        } else {
            System.out.println("Wait");
        }
    }
}
