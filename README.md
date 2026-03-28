# Learning How To Read Image Pixels with Java
* In Java:
  * An image is loaded into a <code>BufferedImage</code>
  * Each pixel is stored as a simple integer, mapped by a "point", as in $(x, y)$ where $x$ represents the width and $y$ represents the height.
  * That integer encodes ARGB values where:
    - A ➡️ Alpha or transparency
    - R ➡️ Red
    - G ➡️ Green
    - B ➡️ Blue
* You can access a pixel using <code>getRGB(x, y)</code>
* Extract color channels using bitwise operations
  - Example:
    - <code>int red = (pixel >> 16) & 0xff;</code>
* Each pixel is stores as 32 bits:
  <code>AAAAAAAARRRRRRRRGGGGGGGGBBBBBBBB</code>
* The bit shifting does this:
  * <code> >> 24 -> Alpha</code>
  * <code> >> 16 -> Red</code>
  * <code> >> 8 -> Green</code>
  * <code>0xff -> Keepd only 8 bits</code>
* 📁 Source code folder: [BasicImagePixels](https://github.com/thabang-m-modiba/Image-Pixels/tree/b8bae70a1e052b0f9038cbac1fe557dd20f9f6b3/BasicImagePixels)

## Grouping Pixels
* Working with groups of pixels lets us do blurring, downscaling, noise reduction and region analysis.
* Average Color of group of pixels:
  * Given a group of pixels, the average color is:
    - Average of all red, green and blue values.
  * This gives us one color that represents the entire group.
* Think of it as section an image into rectangles and represent each rectangle with one color.
* 📁 Source code folder: 
