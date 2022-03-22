import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;

public class HouseButton extends GridPane{
    private Rectangle bg, door, house, lwin, rwin;
    private Polygon roof,roof2, chim;
	private Circle moon, cloud1, cloud2, cloud3, cres, awin, dknob;
	private Arc dwin;
    private Button btnsun, btnmoon, btncloud;
    private Pane drawing;
    private HBox hbxSky;
    private Color clrsun, clrmoon, clrcloud;
    
    
    public HouseButton(){
        super();
        clrsun = Color.LIGHTBLUE;
		clrmoon = Color.BLACK;
		clrcloud = Color.LIGHTBLUE;
		
		init();
		setColor(1);
		
		this.add(drawing, 0, 0);
		this.add(hbxSky, 0, 1);
	}
    
    private void init() {
        initDrawing();
        initColors();
		
    }
    
    private void initDrawing() {
        bg = new Rectangle();
	    bg.setX(0);
	    bg.setY(0);
	    bg.setWidth(300);
        bg.setHeight(300);
	    bg.setStroke(Color.GRAY);
	    bg.setStrokeWidth(0.5);
        
        moon = new Circle();
        moon.setCenterX(50);
        moon.setCenterY(30);
        moon.setRadius(0);
        moon.setStrokeWidth(0.5);
        
        cres = new Circle();
        cres.setCenterX(41);
        cres.setCenterY(25);
        cres.setRadius(0);
        cres.setStrokeWidth(0.5);

        cloud1 = new Circle();
        cloud1.setCenterX(60);
        cloud1.setCenterY(30);
        cloud1.setRadius(0);
        cloud1.setStrokeWidth(0.5);

        cloud2 = new Circle();
        cloud2.setCenterX(70);
        cloud2.setCenterY(30);
        cloud2.setRadius(0);
        cloud2.setStrokeWidth(0.5);

        cloud3 = new Circle();
        cloud3.setCenterX(80);
        cloud3.setCenterY(30);
        cloud3.setRadius(0);
        cloud3.setStrokeWidth(0.5);
        
        house = new Rectangle();
	    house.setX(75);
	    house.setY(75);
	    house.setWidth(150);
        house.setHeight(150);
	    house.setStroke(Color.GRAY);
	    house.setFill(Color.BLUE);
        house.setStrokeWidth(0.5);
        
        lwin = new Rectangle();
	    lwin.setX(95);
	    lwin.setY(100);
	    lwin.setWidth(25);
        lwin.setHeight(60);
	    lwin.setStroke(Color.BLACK);
	    lwin.setFill(Color.DARKGRAY);
        lwin.setStrokeWidth(0.5);
        
        rwin = new Rectangle();
	    rwin.setX(180);
	    rwin.setY(100);
	    rwin.setWidth(25);
        rwin.setHeight(60);
	    rwin.setStroke(Color.BLACK);
	    rwin.setFill(Color.DARKGRAY);
        rwin.setStrokeWidth(0.5);
        
        door = new Rectangle();
	    door.setX(130);
	    door.setY(125);
	    door.setWidth(40);
        door.setHeight(100);
	    door.setStroke(Color.GRAY);
	    door.setFill(Color.GRAY);
        door.setStrokeWidth(0.5);
        
        roof = new Polygon();
        roof.getPoints().addAll(new Double[]{
        65.0, 75.0,
        150.0, 25.0,
        235.0, 75.0 });
        roof.setStroke(Color.GRAY);
	    roof.setFill(Color.GRAY);
        roof.setStrokeWidth(0.5);
        
        roof2 = new Polygon();
        roof2.getPoints().addAll(new Double[]{
        75.0, 75.0,
        150.0, 35.0,
        225.0, 75.0 });
        roof2.setStroke(Color.BLUE);
	    roof2.setFill(Color.BLUE);
        roof2.setStrokeWidth(1);

        chim = new Polygon();
        chim.getPoints().addAll(new Double[]{
        115.0, 45.25,
        115.0, 20.0,
        135.0, 20.0,
        135.0, 34.0 });
        chim.setStroke(Color.DARKGRAY);
	    chim.setFill(Color.DARKGRAY);
        chim.setStrokeWidth(0.1);
        
        
	    awin = new Circle();
	    awin.setCenterX(150);
	    awin.setCenterY(55);
	    awin.setRadius(15);
	    awin.setStroke(Color.BLACK);
	    awin.setFill(Color.DARKGRAY);

	    dknob = new Circle();
	    dknob.setCenterX(164);
	    dknob.setCenterY(175);
	    dknob.setRadius(5);
	    dknob.setStroke(Color.GRAY);
	    dknob.setFill(Color.GOLD);

	    dwin = new Arc(150,145,15,15,0,180);
	    dwin.setType(ArcType.CHORD);
	    dwin.setFill(Color.DARKGRAY);
	    dwin.setStroke(Color.BLACK);
	    dwin.setStrokeWidth(.5);
	    dwin.setStrokeLineCap(StrokeLineCap.ROUND);


	    // Create a pane to hold the face
        
        drawing = new Pane();
	    drawing.setMinSize(300, 300);

	    drawing.getChildren().add(bg);
        drawing.getChildren().add(moon);
        drawing.getChildren().add(cres);
        drawing.getChildren().add(cloud1);
        drawing.getChildren().add(cloud2);
        drawing.getChildren().add(cloud3);
        drawing.getChildren().add(house);
        drawing.getChildren().add(lwin);
        drawing.getChildren().add(rwin);
        drawing.getChildren().add(door);
        drawing.getChildren().add(roof);
        drawing.getChildren().add(roof2);
        drawing.getChildren().add(chim);
        drawing.getChildren().add(awin);
	    drawing.getChildren().add(dknob);
	    drawing.getChildren().add(dwin);
    }
    
    private void initColors() {
		btnsun = new Button("Sunny");
		btnsun.setOnAction(e -> setColor(1));
		
		
		btnmoon = new Button("Night");
		btnmoon.setOnAction(e -> setColor(2));
		
		
		btncloud = new Button("Cloudy");
		btncloud.setOnAction(e -> setColor(3));
		
		
		
		hbxSky = new HBox(10); // the parameter to this constructor sets the space between children
		hbxSky.getChildren().addAll(btnsun,btnmoon,btncloud);
		
	}
    
    private void setColor(int c) {
		Color newColor = clrsun;
		switch(c) {
		case 1:
			newColor = clrsun;
            moon.setRadius(20);
            moon.setStroke(Color.GOLD);
            moon.setFill(Color.GOLD);
            
            cres.setRadius(0);
            cloud1.setRadius(0);
            cloud2.setRadius(0);
            cloud3.setRadius(0);
            break;
		case 2:
			newColor = clrmoon;
            moon.setRadius(20);
            moon.setStroke(Color.GRAY);
            moon.setFill(Color.WHITE);
            
            cres.setRadius(14);
            cloud1.setRadius(0);
            cloud2.setRadius(0);
            cloud3.setRadius(0);
            break;
		case 3:
			newColor = clrcloud;
            moon.setRadius(10);
            moon.setStroke(Color.WHITE);
            moon.setFill(Color.WHITE);
            
            cres.setRadius(0);
            
            cloud1.setRadius(10);
            cloud1.setStroke(Color.WHITE);
            cloud1.setFill(Color.WHITE);
            
            cloud2.setRadius(10);
            cloud2.setStroke(Color.WHITE);
            cloud2.setFill(Color.WHITE);
            
            cloud3.setRadius(10);
            cloud3.setStroke(Color.WHITE);
            cloud3.setFill(Color.WHITE);
            break;
		}
        
        bg.setFill(newColor);
	    	
	}

}
