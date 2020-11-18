package Lambda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PureLambdaExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button();
        button.setText("Click Me");
        button.setOnAction(event -> {
            System.out.println("this is a lambda expression");
        });

        initPane(primaryStage, button);
    }

    private void initPane(Stage primaryStage, Button button) {
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}