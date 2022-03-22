

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class BallPane extends Pane {
    public final double radius = 20;
    private int end, counter;
    private double x = radius, y = radius;
    private double dx = 1, dy = 1;
    private double rpy;
    private Circle circle = new Circle(x, y, radius);
    private Rectangle rpaddle = new Rectangle(0, rpy, 10, 75);
    private Timeline animation;

    public BallPane() {
        circle.setFill(Color.GOLD); // Set ball color
        rpaddle.setFill(Color.BLACK);
        rpaddle.xProperty().bind(this.widthProperty().subtract(30));
        getChildren().add(rpaddle);
        getChildren().add(circle); // Place a ball into this pane


        // Create an animation for moving the ball
        animation = new Timeline(
            new KeyFrame(Duration.millis(50), e -> moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play(); // Start animation
        
    }

    public void play() {
        animation.play();
    }

    public void pause() {
        animation.pause();
    }

    public void increaseSpeed() {
        animation.setRate(animation.getRate() + 0.1);
    }

    public void decreaseSpeed() {
        animation.setRate(
            animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
    }

    public void movepaddleup() {
        if (rpy < 20){
            rpy = 0;
        }
        else{
            rpy = rpy - 20;
        }
        
        rpaddle.setY(rpy);
    }

    public void movepaddledown() {
        if (rpy + 75 > getHeight()-20){
            rpy = getHeight() - 75;
        }
        else{
            rpy = rpy + 20;
        }
        rpaddle.setY(rpy);
    }
    
    protected void moveBall() {
      // Check boundaries
        if (x < radius || x > getWidth() - radius) {
            dx *= -1; // Change ball move direction
        }
        if (y < radius || y > getHeight() - radius) {
            dy *= -1; // Change ball move direction
        }
        if (x == getWidth() - radius - 30){
            if (rpy <= y && y <= rpy + 75){
                circle.setFill(Color.GREEN);
                dx *= -1;
                counter = 100;
            }
            else{
                circle.setFill(Color.RED);
                animation.stop();
                end = 1;
            }
        }
        if (counter == 0) {
            circle.setFill(Color.GOLD);
        }

        // Adjust ball position
        x += dx;
        y += dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
        counter --;
    }
    
    public void reset() {
        if (end == 1) {
            circle.setFill(Color.GOLD);
            x = radius;
            y = radius;

            animation.setRate(1);
            animation.play();
            end = 0;
        }
        
    }
    
  }