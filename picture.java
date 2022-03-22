import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeLineCap;

public class picture extends Pane{
    private Rectangle scene, door, house, lwin, rwin;
    private Polygon roof,roof2, chim;
	private Circle moon, cres, awin, dknob;
	private Arc dwin;
	
	public picture() {
		super();
		
        scene = new Rectangle();
	    scene.setX(0);
	    scene.setY(0);
	    scene.setWidth(300);
        scene.setHeight(300);
	    scene.setStroke(Color.GRAY);
	    scene.setFill(Color.BLACK);
        scene.setStrokeWidth(0.5);
        
	   	moon = new Circle();
	    moon.setCenterX(50);
	    moon.setCenterY(30);
	    moon.setRadius(20);
	    moon.setStroke(Color.GRAY);
	    moon.setFill(Color.WHITE);
        moon.setStrokeWidth(0.5);

        cres = new Circle();
	    cres.setCenterX(41);
	    cres.setCenterY(25);
	    cres.setRadius(14);
	    cres.setStroke(Color.BLACK);
	    cres.setFill(Color.BLACK);
        cres.setStrokeWidth(0.5);
        
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

	    this.getChildren().add(scene);
        this.getChildren().add(moon);
	    this.getChildren().add(cres);
        this.getChildren().add(house);
        this.getChildren().add(lwin);
        this.getChildren().add(rwin);
        this.getChildren().add(door);
        this.getChildren().add(roof);
        this.getChildren().add(roof2);
        this.getChildren().add(chim);
        this.getChildren().add(awin);
	    this.getChildren().add(dknob);
	    this.getChildren().add(dwin);
	}

}
