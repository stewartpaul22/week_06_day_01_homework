import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class EightBallTest {

    private EightBall eightBall;

    @Before
    public void before() {
        ArrayList<String> answers = new ArrayList<>();
        answers.add("It's too early to tell.");
        answers.add("It's difficult to predict.");
        answers.add("Ask again later.");
        eightBall = new EightBall(answers);
    }

    @Test
    public void hasAnswers() {
    assertEquals(3, eightBall.getAnswerCount());
    }

    @Test
    public void canGetRandom_answer() {
        // create a copy of the answers
        ArrayList results = eightBall.getAnswers();
        // get a random answer
        String randomAnswer = eightBall.getRandomAnswer();
        assertTrue(results.contains(randomAnswer));
        //System.out.println(randomAnswer);
    }

    @Test
    public void canAddAnswer() {
        eightBall.add("Yes");
        assertEquals(4, eightBall.getAnswerCount());
    }

    @Test
    public void canRemoveAnswer() {
        eightBall.removeAnswer("Ask again later.");
        assertEquals(2, eightBall.getAnswerCount());
    }

}
