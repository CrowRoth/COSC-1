import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShowHouseButton extends Application{
    @Override
    public void start(Stage primaryStage) {
        HouseButton root = new HouseButton();
        Scene scene = new Scene(root, 300, 350);
        primaryStage.setTitle("Show Happy Face"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    public static void main(String[] args) {
	    launch(args);
    }

}
