package javafx;

import javafx.scene.shape.Polygon;

public class Star extends Polygon {

	public Star(double radius) {

		double v = 360 / 5;
		for (int i = 0; i < 5; i++) {
			double x = Math.sin(Math.toRadians(108 + v * 2 * i)) * radius;
			double y = Math.cos(Math.toRadians(108 + v * 2 * i)) * radius;
			getPoints().add(x);
			getPoints().add(y);
		}

	}

}
