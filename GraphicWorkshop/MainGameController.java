package sample;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;
import sample.Models.Game;


public class MainGameController {
    public Pane board;
    public ImageView redPiece;
    public ImageView bluePiece;
    private Game game;

    public void initialize () {
        game = new Game();
//        ColumnConstraints columnConstraints = new ColumnConstraints(60);
//        RowConstraints rowConstraints = new RowConstraints(60);
//        for (int i = 0 ; i < 10 ; i++) {
//            board.getColumnConstraints().add(columnConstraints);
//            board.getRowConstraints().add(rowConstraints);
//        }
    }

    public void playRed(MouseEvent mouseEvent) {
        int[] coords = game.play();
        System.out.println("X: " + coords[0]);
        System.out.println("Y: " + coords[1]);
        animate(redPiece, coords[1], coords[0], coords[2], coords[3]);
    }

    public void playBlue(MouseEvent mouseEvent) {
        int[] coords = game.play();
        System.out.println("X: " + coords[0]);
        System.out.println("Y: " + coords[1]);
        animate(bluePiece, coords[1], coords[0], coords[2], coords[3]);
    }

    private void animate (Node node, int destY, int destX, int ladderX, int ladderY) {
        Path path = new Path();
        System.out.println();
        path.getElements().add(new MoveTo(node.getTranslateX() + 30,node.getTranslateY() + 30));
        path.getElements().add(new LineTo(destX*60 - node.getLayoutX() + 30, destY*60 - node.getLayoutY() + 30));
        if (ladderX != destX && ladderY != destY) {
            path.getElements().add(new LineTo(ladderX*60 - node.getLayoutX() + 30, ladderY*60 - node.getLayoutY() + 30));
        }
        PathTransition pathTransition = new PathTransition();
        int time = (int) Math.sqrt((Math.pow(destX*60 - node.getLayoutX() + 30, 2) + Math.pow(destY*60 - node.getLayoutY() + 30, 2)));
        pathTransition.setDuration(Duration.millis(time * 10));
        pathTransition.setPath(path);
        pathTransition.setNode(node);
        pathTransition.setCycleCount(1);
        pathTransition.setAutoReverse(false);
        pathTransition.play();
        pathTransition.setOnFinished(e->{
            node.setViewOrder(-1);
        });
    }
}
