package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
 import javafx.scene.shape.Rectangle;



public class PremiereFenetre extends Application  {
	
	@Override
	 public void start(Stage primaryStage) {
	 Group root = new Group();

	 Scene scene = new Scene(root, 300, 250, Color.WHITE);

	 primaryStage.setTitle("Ma première fenêtre");
	 //Line l=new Line(50,50,200,50);
	 //Rectangle r=new Rectangle(100,100,150,100);
	 root.getChildren().add(new Line(50,50,200,50));
	 root.getChildren().add(new Rectangle(100,100,150,100));
	 root.getChildren().add(new Circle(300,300,50));
	 primaryStage.setScene(scene);
	 primaryStage.show();
	 }
	 public static void main(String[] args) {
	 launch(args);
	 }
}
