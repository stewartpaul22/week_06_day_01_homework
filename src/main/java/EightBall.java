import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers) {
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<>(answers);
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public int getAnswerCount() {
        return answers.size();
    }

    public String getRandomAnswer() {
        Collections.shuffle(answers);
        return answers.get(0);
    }


    // add an answer to ArrayList

    // remove a specified answer from ArrayList

}
