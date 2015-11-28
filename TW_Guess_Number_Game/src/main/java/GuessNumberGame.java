import java.util.HashSet;
import java.util.Scanner;

public class GuessNumberGame {

    private NumberGenerator generator;
    private NumberComparator comparator;

    public GuessNumberGame(NumberGenerator generator, NumberComparator comparator) {
        this.generator = generator;
        this.comparator = comparator;
    }

    public void start()
    {
        System.out.println("Welcome!\n");
        String result = "";
        for (int limit = 6; limit > 0; limit--) {
            System.out.println("Please input your number("+limit+"):");

            String randomNumber = generator.generate();
            Scanner s = new Scanner(System.in);
            String guessNumber = s.next();

            if(isDuplicated(guessNumber))
            {
                System.out.println("Cannot input duplicate numbers!\n");
            } else {
                result = comparator.compare(generator.generate(), guessNumber);
                if (result.equals("4A0B"))
                {
                    System.out.println("Congratulations!");
                    break;
                } else
                {
                    System.out.println(result+"\n");
                }
            }
        }

        System.out.println("Game Over!");
    }

    public boolean isDuplicated(String s)
    {
        return (s.chars().distinct().count() != s.length()) ? true : false;

    }
}
