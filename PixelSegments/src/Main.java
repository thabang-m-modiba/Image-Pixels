/**
 * @author Thabang Mamoloko
 */

import java.util.List;

/**
 * Class contains the main method
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageReader imgPx = new ImageReader("images/image.png");
		List<Pixel> pixels = imgPx.getPixels();
		for(int i = 0; i < pixels.size(); i++) {
			System.out.println(pixels.get(i).getXvalue());
		}

	}

}
