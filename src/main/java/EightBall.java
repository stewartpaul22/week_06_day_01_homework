import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers) {
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<>(this.answers);
    }

    public int getAnswerCount() {
        return this.answers.size();
    }

    public String getRandomAnswer() {
        Collections.shuffle(this.answers);
        return this.answers.get(0);
    }

    public void add(String answer) {
        this.answers.add(answer);
    }

    public void removeAnswer(String answer) {
        this.answers.remove(answer);
    }

}
