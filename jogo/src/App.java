import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class App extends Application{
    public static void main(String[] args) throws Exception{
        launch(args);
    }
   @Override
    public void start(javafx.stage.Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("jogoDesing.fxml"));
            Scene tela = new Scene(root);
            primaryStage.setTitle("MathGame");
            primaryStage.setScene(tela);
            primaryStage.show();

        }catch (Exception e){
            System.out.println("Erro ao carregar o ficheiro"+e.getMessage());
            e.printStackTrace();
        }
    }
}