package servletBeans;

import java.io.Serializable;

public class ColorBean implements Serializable {
	private String foregroundColor = "black";
	private String backgroundColor = "white";
	
	public String getForegroundColor() {
		return foregroundColor;
	}
	
	public void setForegroundColor(String foregroundColor) {
		this.foregroundColor = foregroundColor;
	}
	
	public String getBackgroundColor() {
		return backgroundColor;
	}
	
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
}
