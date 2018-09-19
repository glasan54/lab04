//Pakapol Sanarge 5810405223

package lab04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{

        @Override
        public void start(Stage primaryStage) throws Exception{
            FXMLLoader loader = new FXMLLoader();
            Parent root = loader.load(getClass().getClassLoader().getResourceAsStream("UserInerface.fxml"));
            primaryStage.setTitle("Income and Expense");
            primaryStage.setScene(new Scene(root, 536, 350));
            primaryStage.setResizable(false);
            primaryStage.show();
    }


        public static void main(String[] args) {
        launch(args);
    }
}
