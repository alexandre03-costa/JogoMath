import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class gameController {

    @FXML
    private TextField answer;

    @FXML
    private TextField level;

    @FXML
    private TextField marks;

    @FXML
    private TextField question;

    @FXML
    private Button resul;

    @FXML
    private Button btnlimpar;

    private int correctAnswer;
    private int score = 0;

    @FXML
    public void initialize() {
          Operation();
        marks.setText(String.valueOf(score));
    }
   
    @FXML
    void checkAnsewr(ActionEvent event) {
        try {
            int userAnswer = Integer.parseInt(answer.getText());
            if (userAnswer == correctAnswer) {
                score++;
                marks.setText(String.valueOf(score));
                Operation();
                answer.clear();
            } else {
                answer.setText("Resposta errada!");
            }
        } catch (NumberFormatException e) {
            answer.setText("Inválido!");
        }
    }
    @FXML
    void limpar(ActionEvent event) {
          marks.clear();
          score=0;
    }
    private void Operation() {
        int op =  (int) (Math.random() * 3 + 1);
        int nivel = Integer.parseInt(level.getText());
        if (nivel == 1) {
            int num1 = (int) (Math.random() * 50 + 1);
            int num2 = (int) (Math.random() * 10 + 1);

            if (op == 1) {
                correctAnswer = num1 * num2;
                question.setText(num1 + " * " + num2 + " ?");
            } else if (op == 2) {
                correctAnswer = num1 + num2;
                question.setText(num1 + " + " + num2 + " ?");
            } else {

                correctAnswer = num1 - num2;
                question.setText(num1 + " - " + num2 + " ?");
            }

        } else if (nivel == 2) {

            int num1 = (int) (Math.random() * 500 + 1);
            int num2 = (int) (Math.random() * 100 + 1);

            if (op == 1) {
                correctAnswer = num1 * num2;
                question.setText(num1 + " * " + num2 + " ?");
            } else if (op == 2) {
                correctAnswer = num1 + num2;
                question.setText(num1 + " + " + num2 + " ?");
            } else {

                correctAnswer = num1 - num2;
                question.setText(num1 + " - " + num2 + " ?");
            }

        } else {
            int num1 = (int) (Math.random() * 1000 + 1);
            int num2 = (int) (Math.random() * 100 + 1);

            if (op == 1) {
                correctAnswer = num1 * num2;
                question.setText(num1 + " * " + num2 + " ?");
            } else if (op == 2) {
                correctAnswer = num1 + num2;
                question.setText(num1 + " + " + num2 + " ?");
            } else {

                correctAnswer = num1 - num2;
                question.setText(num1 + " - " + num2 + " ?");
            }
        }
    }
}
