/**
 * @author Thabang Mamoloko
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Class contains the main method
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub       
		try {
			File file = new File("images/image.png");
			BufferedImage image = ImageIO.read(file);
			
			int width = image.getWidth();
			int height = image.getHeight();
			AveragePixelColor color = new AveragePixelColor(image, 0, 0, height, width);
			System.out.println(color.getAverageColor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
