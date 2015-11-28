import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessNumberGameTest {

    private NumberGenerator generator;
    private NumberComparator comparator;

    
    @Test
    public void should_get_4A0B_when_guessNumber_is_the_same_as_generateNumber ()
    {
        //given
        generator = mock(NumberGenerator.class);
        comparator = new NumberComparator();
        GuessNumberGame game = new GuessNumberGame(generator, comparator);

//        String randomNumber = generator.generate();
        when(generator.generate()).thenReturn("1234");
        String guessNumber = "1234";

        //when
        String result = comparator.compare(generator.generate(), guessNumber);

        //then
        assertEquals("4A0B", result);

    }
    
//    @Test
//    public void should_ ()
//    {
//        //given
//
//
//        //when
//
//
//        //then
//
//
//    }
}
