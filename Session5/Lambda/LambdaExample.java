package Lambda;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LambdaExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button();
        button.setText("Click Me");
        button.setOnAction(new MyAction());
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
class MyAction implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent event) {
        System.out.println("i am a button");
        //...
    }
}
