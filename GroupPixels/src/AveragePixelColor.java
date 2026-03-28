/**
 * @author Thabang Mamoloko
 */

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * Class contains a method that calculates the average color of group of pixels
 */
public class AveragePixelColor {
	private BufferedImage image;
	private int startX;
	private int startY;
	private int blockWidth;
	private int blockHeight;
	/**
	 * @param image
	 * @param startX
	 * @param startY
	 * @param blockWidth
	 * @param blockHeight
	 */
	public AveragePixelColor(BufferedImage image, int startY, int startX, int blockHeight, int blockWidth) {
		this.image = image;
		this.startX = startX;
		this.startY = startY;
		this.blockWidth = blockWidth;
		this.blockHeight = blockHeight;
	}
	
	/**
	 * Method calculates the average color of group of pixels
	 * @return the average Color
	 */
	public Color getAverageColor() {
		long sumRed = 0;
		long sumGreen = 0;
		long sumBlue = 0;
		
		int pixelCount = 0;
		
		for(int y = startY; y < startY + blockHeight; y++) {
			for(int x = startX; x < startX + blockWidth; x++) {
				int pixel = image.getRGB(x, y);
				
				int red = (pixel >> 16) & 0xff;
				int green = (pixel >> 8) & 0xff;
				int blue = pixel & 0xff;
				
				sumRed += red;
				sumGreen += green;
				sumBlue += blue;
				
				pixelCount++;
			}
		}
		

		int avgRed = (int)(sumRed/pixelCount);
		int avgGreen = (int)(sumGreen/pixelCount);
		int avgBlue = (int)(sumBlue/pixelCount);
		
		return new Color(avgRed, avgGreen, avgBlue);
	}

}
