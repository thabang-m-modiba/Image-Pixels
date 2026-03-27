/**
 * @author Thabang Mamoloko
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/**
 * Class Contains the main method
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        try {
        	File imageFile = new File("image/image.png");
			BufferedImage image = ImageIO.read(imageFile);
			
			int imgWidth = image.getWidth();
			int imgHeight = image.getHeight();
			
			System.out.println("Image Size: " + imgWidth + " X " + imgHeight);
			
			// Looping through pixels
			for(int y = 0; y < imgHeight; y++) {
				for(int x = 0; x < imgWidth; x++) {
					// Get pixel value
					int pixel = image.getRGB(x, y);
					
					
					// Extracting the color components
					int alpha = (pixel >> 24) & 0xff; // Bitwise operators
					int red = (pixel >> 16) & 0xff;
					int green = (pixel >> 8) & 0xff;
					int blue = pixel & 0xff;
					
					// Output a specific pixel
					if(x == 0 && y == 0) {
						System.out.println("Pixel (" + x + ", " + y + ") -> A:" + alpha
								+ "\nRed: " + red
								+ "\nGreen: " + green
								+ "\nBlue" + blue
						);
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("An Error has occured\n" + e.getMessage());
		}

	}

}
