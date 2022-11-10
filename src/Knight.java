public class Knight {
    private String name = "Sir Lancelot";
    private String weapon = "Long Sword";
    private boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.goAndSaveThePrincess();
        knight.sharpenBlade();
        knight.getFood();
        knight.assembleTeam();
        knight.ssadleAHorse();

    }

    private void sharpenBlade() {
        System.out.println("Точим мечь");
    }

    private void getFood() {
        System.out.println("Собираем консервы");
    }

    private void assembleTeam() {
        System.out.println("Будим оруженосца");
    }

    private void ssadleAHorse() {
        System.out.println("Седлаем коня");
    }

    public void goAndSaveThePrincess() {
        System.out.println("Да иду уже я, идууууу..");
    }
}
