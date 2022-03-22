

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class SmackinBalls extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        BallPane ballPane = new BallPane(); // Create a ball pane

        // Pause and resume animation
        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        // Increase and decrease animation   
        ballPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.LEFT) {
                ballPane.decreaseSpeed();
            } 
            else if (e.getCode() == KeyCode.RIGHT) {
                ballPane.increaseSpeed();
            }
            else if (e.getCode() == KeyCode.UP) {
                ballPane.movepaddleup();
            }
            else if (e.getCode() == KeyCode.DOWN) {
                ballPane.movepaddledown();
            }
            else if (e.getCode() == KeyCode.ENTER) {
                ballPane.reset();
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(ballPane, 250, 150);
        primaryStage.setTitle("BounceBallControl"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        // Must request focus after the primary stage is displayed
        ballPane.requestFocus();
    }

      /**
       * The main method is only needed for the IDE with limited
       * JavaFX support. Not needed for running from the command line.
       */
    public static void main(String[] args) {
        launch(args);
    }
}
