

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
    public final double radius = 20;
    private double distance, px = 260, py = 310, x = radius, y = radius;
    private double dx = 1, dy = 1;
    private Circle circle = new Circle(x, y, radius), player = new Circle (px, py, 40);
    private Timeline animation, speedSetter;

    public BallPane() {
        circle.setFill(Color.GOLD); // Set ball color
        player.setFill(Color.BLUE);
        getChildren().add(player);
        getChildren().add(circle); // Place a ball into this pane


        // Create an animation for moving the ball
        animation = new Timeline(
            new KeyFrame(Duration.millis(50), e -> moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play(); // Start animation
        
        speedSetter = new Timeline(
            new KeyFrame(Duration.millis(2500), e -> increaseSpeed()));
        speedSetter.setCycleCount(Timeline.INDEFINITE);
        speedSetter.play();
        
    }

    public void pause() {
        if (animation.getCurrentRate() == 0.0){
            animation.play();
            speedSetter.play();
        }
        else {
            animation.pause();
            speedSetter.pause();
        }
    }

    public void increaseSpeed() {
        animation.setRate(animation.getRate() + 1.0);
    }

    public void moveplayerup() {
        if (py < 60){
            py = 40;
        }
        else{
            py = py - 20;
        }
        
        player.setCenterY(py);
    }

    public void moveplayerdown() {
        if (py > getHeight() - 60){
            py = getHeight() - 40;
        }
        else{
            py = py + 20;
        }
        player.setCenterY(py);
    }
    
    public void moveplayerleft() {
        if (px < 60){
            px = 40;
        }
        else{
            px = px - 20;
        }
        
        player.setCenterX(px);
    }
    
    public void moveplayerright() {
        if (px > getWidth() - 60){
            px = getWidth() - 40;
        }
        else{
            px = px + 20;
        }
        player.setCenterX(px);
    }
    
    protected void moveBall() {
      // Check boundaries
        distance = Math.sqrt(Math.pow((x - px),2) + Math.pow((y - py),2));
        if (x < radius || x > getWidth() - radius) {
            dx *= -1; // Change ball move direction
        }
        if (y < radius || y > getHeight() - radius) {
            dy *= -1; // Change ball move direction
        }
        if (distance <= 60){
            circle.setFill(Color.RED);
            animation.stop();
            speedSetter.stop();
        }

        // Adjust ball position
        x += dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    }
    
    public void reset() {
        if (distance <= 60){
            circle.setFill(Color.GOLD);
            x = radius;
            y = radius;
            px = 260;
            py = 310;

            player.setCenterX(px);
            player.setCenterY(py);
            animation.play();
            speedSetter.play();
        }
    }
    
  }