package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color purple = new Color(135, 57, 150);
		StdDraw.setPenColor(purple);
		StdDraw.filledRectangle(.5, .5, .2, .4);
		
		double[] x = new double[] {.3, .5, .7};
		double[] y = new double[] {.9, .7, .9};
		
		Color pink = new Color(255, 0, 153);
		StdDraw.setPenColor(pink);
		StdDraw.filledPolygon(x, y);
		
		double[] x1 = new double[] {.3, .5, .7};
		double[] y1 = new double[] {.1, .3, .1};
		
		StdDraw.filledPolygon(x1, y1);
		
		Color pastelPink = new Color(255, 193, 230);
		StdDraw.setPenColor(pastelPink);
		StdDraw.arc(.3, .5, .1, -90, 90);
		StdDraw.arc(.7, .5, .1, 90, 270);
		
		StdDraw.circle(.5, .5, .1);
		
	}
}