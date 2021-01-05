package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public TextField username;
    public PasswordField password;

    private boolean checkPassword (String username, String password) {
        return username.equals("Taha") && password.equals("1234");
    }

    public void startGame(ActionEvent actionEvent) throws IOException {
        if (checkPassword(username.getText(), password.getText())) {
            Parent root = FXMLLoader.load(getClass().getResource("MainGame.fxml"));

            Stage gameStage = new Stage();
            gameStage.setTitle("Snakes and Ladders");
            gameStage.setScene(new Scene(root, 600, 600));
//            root.setStyle("-fx-background-image: url('Resources/board.jpg')");
            gameStage.show();
        }else{
            System.out.println("Invalid credentials");
        }
    }
}
