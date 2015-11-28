public class Main {

    public static void main(String[] args) {

        GuessNumberGame game = new GuessNumberGame(new NumberGenerator(), new NumberComparator());
        game.start();
    }
}
