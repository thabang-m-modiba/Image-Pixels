/**
 * @author Thabang Mamoloko
 */

import java.awt.Color;

/**
 * Blueprint for all pixels of the image.
 * Each pixel contains:
 *     Color
 *     x-value which represents the horizontal position of the pixel on the pixel grid
 *     y-value which represents the vertical position of the pixel on the pixel grid
 */
public class Pixel {
	private Color color;
	private int xvalue;
	private int yvalue;
	/**
	 * @param color
	 * @param xvalue
	 * @param yvalue
	 */
	public Pixel(Color color, int xvalue, int yvalue) {
		this.color = color;
		this.xvalue = xvalue;
		this.yvalue = yvalue;
	}
	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * @return the xvalue
	 */
	public int getXvalue() {
		return xvalue;
	}
	/**
	 * @param xvalue the xvalue to set
	 */
	public void setXvalue(int xvalue) {
		this.xvalue = xvalue;
	}
	/**
	 * @return the yvalue
	 */
	public int getYvalue() {
		return yvalue;
	}
	/**
	 * @param yvalue the yvalue to set
	 */
	public void setYvalue(int yvalue) {
		this.yvalue = yvalue;
	}
}
