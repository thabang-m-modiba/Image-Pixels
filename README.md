# Learning How To Read Image Pixels with Java
* In Java:
  * An image is loaded into a <code>BufferedImage</code>
  * Each pixel is stored as a simple "point", as in $(x, y)$ where $x$ represents the width and $y$ represents the height.
  * That integer encodes ARGB values where:
    - A ➡️ Alpha or transparency
    - R ➡️ Red
    - G ➡️ Green
    - B ➡️ Blue
* You can access a pixel using <code>getRGB(x, y)</code>
* Extract color channels using bitwise operations
  - Example:
    - <code>int red = (pixel >> 16) & 0xff;</code>
* Source code folder: BasicImagePixels

