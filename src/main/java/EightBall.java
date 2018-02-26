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

    public int getAnswerCount() {
        return answers.size();
    }

    public String getRandomAnswer() {
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public void add(String answer) {
        answers.add(answer);
    }

    public void removeAnswer(String answer) {
        answers.remove(answer);
    }

}
