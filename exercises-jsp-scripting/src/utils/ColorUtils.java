package utils;

public class ColorUtils {
	public static String randomColor() {
		String color;
		double randNum = Math.random();
		if(randNum < .25) {
			color = "#FFFF00";
		} else if(randNum < .5) {
			color = "#FF0000";
		} else if(randNum < .75) {
			color = "#00FF00";
		} else {
			color = "#0000FF";
		}
		return color;
	}
}
