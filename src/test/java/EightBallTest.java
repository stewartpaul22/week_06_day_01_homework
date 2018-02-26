import org.junit.Before;

import java.util.ArrayList;

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
}
