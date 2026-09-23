public class Main {
    public static void main() {
        Adventure adventure = new Adventure();
        ConsoleUI ui = new ConsoleUI(adventure);
        ui.start();
    }
}