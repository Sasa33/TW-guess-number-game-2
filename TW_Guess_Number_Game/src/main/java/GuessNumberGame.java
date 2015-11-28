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
        String randomNumber = generator.generate();
        System.out.println("Welcome!");
        System.out.println("");

        String result;
        for (int limit = 6; limit > 0; limit--) {
            System.out.println("Please input your number("+limit+"):");

            Scanner s = new Scanner(System.in);
            String guessNumber = s.next();

            if(isDuplicated(guessNumber))
            {
                System.out.println("Cannot input duplicate numbers!");
                System.out.println("");

            } else {
                result = comparator.compare(randomNumber, guessNumber);
                if (result.equals("4A0B"))
                {
                    System.out.println("Congratulations!");
                    break;
                } else
                {
                    System.out.println(result);
                    System.out.println("");
                }
            }
        }

        System.out.println("Game Over!");
    }

    public boolean isDuplicated(String s)
    {
        return (s.chars().distinct().count() != s.length());

    }
}
