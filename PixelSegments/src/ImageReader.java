/**
 * @author Thabang Mamoloko
 */

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

/**
 * Class to read an image
 */
public class ImageReader {
	private File file;
	private BufferedImage image;
	/**
	 * @param file
	 * @param image
	 */
	public ImageReader(String path) {
		this.file = new File(path);
		try {
			this.image = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("An error has occured!\n" + e.getMessage());
		}
	}
	
	public List<Pixel> getPixels(){
		List<Pixel> pixelGrid = new ArrayList<>();
		Pixel pixel;
		
		int width = image.getWidth();
		int height = image.getHeight();
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				// Get pixel value
				int px = image.getRGB(x, y);
				// Extract the colors
				int R = (px >> 16) & 0xff;
				int G = (px >> 8) & 0xff;
				int B = px & 0xff;
				
				// Create pixel
				pixel = new Pixel(new Color(R, G, B), x, y);
				// Add pixel to grid
				pixelGrid.add(pixel);
			}
		}
		return pixelGrid;
	}
	
}
