public class FirstTask {
    int r = 0, l = 0;

    public void addRight(int n) {
        r += n;
    }

    public void addLeft(int n) {
        l += n;
    }

    public String getSituation() {
        if (r == l) return "=";
        else if (r > l) return "r";
        else return "l";
    }

    public static void main(String[] args) {
        FirstTask pop = new FirstTask();
        pop.addLeft(5);
        pop.addRight(6);
        System.out.println(pop.getSituation());
    }
}
