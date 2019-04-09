package javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class former extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.WHITE);
		primaryStage.setScene(scene);
		primaryStage.show();

		// ----- CIRKEL
		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setTranslateX(250);
		circle.setTranslateY(250);
		circle.setFill(Color.RED);
		root.getChildren().add(circle);

		// ------ RECTANGLE
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(100);
		rectangle.setHeight(50);
		rectangle.setFill(Color.HOTPINK);
		root.getChildren().add(rectangle);

		// ----- POLYGON
		Polygon polygon = new Polygon(
				0, 0, 		// x1, y1
				0, 100, 	// x2 , y2
				100, 100); 	// x3 , y3
		root.getChildren().add(polygon);

		// ----- STAR
		Star star = new Star(50);
		star.setTranslateX(250);
		star.setTranslateY(250);
		root.getChildren().add(star);

	}

}
