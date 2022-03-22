/*
 * File Name: Triangle.java
 * 
 * Name: Dustin Riley
 * 
 *  
 * UML: Triangle
 * - double a
 * 
 * - double b
 * 
 * - double c
 * 
 * + Triangle()
 * 
 * + Triangle(double s1, double s2, double s3)
 * 
 * + double getA()
 * 
 * + double getB()
 * 
 * + double getC()
 * 
 * + setSides(double s1, double s2, double s3)
 * 
 * + double getPerimeter()
 * 
 * + double getArea()
 * 
 * + String toString()
 * 
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Triangle extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    private TextField aInput, bInput,cInput;
    
    private Label answer;
    
    public void start(Stage stage) {
        
        aInput = new TextField("1");
        bInput = new TextField("1");
        cInput = new TextField("1");
        
        HBox aPane = new HBox( new Label("length of side a ="), aInput );
        HBox bPane = new HBox( new Label("length of side b ="), bInput );
        HBox cPane = new HBox( new Label("length of side c ="), cInput );
        
        Button area = new Button("Area");
        area.setOnAction( e -> doOperation('*') );

        Button perimeter = new Button("Perimeter");
        perimeter.setOnAction( e -> doOperation('+') );
        
        HBox buttonPane = new HBox( area, perimeter );
        
        HBox.setHgrow(area, Priority.ALWAYS);
        area.setMaxWidth(Double.POSITIVE_INFINITY);
        HBox.setHgrow(perimeter, Priority.ALWAYS);
        perimeter.setMaxWidth(Double.POSITIVE_INFINITY);
        
        answer = new Label(" ");
        answer.setTextFill(Color.BLUE);
        answer.setStyle("-fx-font-weight:bold");
        answer.setAlignment(Pos.CENTER);
        answer.setMaxWidth(Double.POSITIVE_INFINITY);
        
        VBox root = new VBox( 10, aPane, bPane, cPane, buttonPane, answer );
        root.setPadding( new Insets( 8,3,8,3 ) );
        root.setStyle("-fx-border-color:black; -fx-border-width:2px");
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Triangle");
        stage.setResizable(false);
        stage.show();
        
    }
    
    private void doOperation( char op ) {

        double a, b, c;  
        
        try {
            String aStr = aInput.getText();
            a = Double.parseDouble(aStr);
        }
        catch (NumberFormatException e) {
            answer.setText("Illegal data for a.");
            aInput.requestFocus();
            aInput.selectAll();
            return;
        }

        try {
            String bStr = bInput.getText();
            b = Double.parseDouble(bStr);
        }
        catch (NumberFormatException e) {
            answer.setText("Illegal data for b.");
            bInput.requestFocus();
            bInput.selectAll();
            return;
        }
        
        try {
            String cStr = cInput.getText();
            c = Double.parseDouble(cStr);
        }
        catch (NumberFormatException e) {
            answer.setText("Illegal data for c.");
            cInput.requestFocus();
            cInput.selectAll();
            return;
        }
         double area=0;
        if (op == '*'){
            area = (Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c)));
            answer.setText( "Area = " + area);
        }
        else if (op == '+')
            answer.setText( "Perimeter = " + (a+b+c) );
    }
}
