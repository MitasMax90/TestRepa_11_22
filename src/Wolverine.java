import java.util.Random;

public class Wolverine {

    private static final int EYES_COUNT = 2;
    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;

    private static int catCount;

    private final double originWeight;
    private double weight;
    private Color color;

    public enum Color {
        RED,
        BLACK,
        WHITE,
        STRIPED;

        private static final Random RANDOM = new Random();

        public static Color randomColor() {
            return values()[RANDOM.nextInt(values().length)];
        }
    }

    public enum Status {
        FAT_AND_SAD,
        SAD,
        PLAYING,
        SLEEPING;
    }

    public Wolverine() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Wolverine(double weight) {
        this.weight = weight;
        this.originWeight = weight;
        this.color = Color.randomColor();
        catCount++;
    }

    public Wolverine(Wolverine originWolverine) {
        this.weight = originWolverine.getWeight();
        this.originWeight = originWolverine.originWeight;
    }

    public void woof() {
        weight = weight - 1;
        System.out.println("Rrrrroarr");
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void pee() {
        weight = weight - 10;
        System.out.println("Clean it, man!");
    }

    public double getWeight() {
        return weight;
    }

    public Status getStatus() {
        if (weight < MIN_WEIGHT) {
            return Status.SAD;
        } else if (weight > MAX_WEIGHT) {
            return Status.FAT_AND_SAD;
        } else if (weight > originWeight) {
            return Status.SLEEPING;
        } else {
            return Status.PLAYING;
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}
