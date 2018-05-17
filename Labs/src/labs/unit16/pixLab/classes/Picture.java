package labs.unit16.pixLab.classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

import labs.unit11.ClassTester;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture(PictureTester.getSimplePathFromLead("flower1.jpg"));
    Picture flower2 = new Picture(PictureTester.getSimplePathFromLead("flower2.jpg"));
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write(PictureTester.getSimplePathFromLead("collage.jpg"));
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  public void setBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
  }
  public void setRed()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setBlue(0);
      }
    }
  }
  public void setGreen()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setRed(0);
      }
    }
  }

  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture(PictureTester.getSimplePathFromLead("beach.jpg"));
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

public void negate() {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
}
public void grayscale() {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int averageGrayScaleInt = pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue();
    	averageGrayScaleInt /= 3;
        pixelObj.setRed(averageGrayScaleInt);
        pixelObj.setGreen(averageGrayScaleInt);
        pixelObj.setBlue(averageGrayScaleInt);
      }
    }
}

public void fixUnderwater() {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(pixelObj.getRed() - 60);
        pixelObj.setGreen(pixelObj.getGreen() - 60);
        pixelObj.setBlue(pixelObj.getBlue() - 60);
      }
    }
}

public void mirrorRightToLeft() {
	Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
}

public void mirrorHorizontal() {
	Pixel[][] pixels = this.getPixels2D();
    Pixel topMostPixel = null;
    Pixel bottomMostPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topMostPixel = pixels[row][col];
        bottomMostPixel = pixels[pixels.length - 1 - row][col];
        bottomMostPixel.setColor(topMostPixel.getColor());
      }
    }
}

public void mirrorHorizontalBotToTop() {
	Pixel[][] pixels = this.getPixels2D();
    Pixel topMostPixel = null;
    Pixel bottomMostPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length / 2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topMostPixel = pixels[row][col];
        bottomMostPixel = pixels[pixels.length - 1 - row][col];
        topMostPixel.setColor(bottomMostPixel.getColor());
      }
    }
	
}

public void mirrorDiagonal() {
	Pixel[][] pixels = this.getPixels2D();
	Pixel upDiagonal = null;
	Pixel downDiagonal = null;
	for (int row = 0; row < pixels.length; row++) {
		for (int col = 0; col < pixels.length; col++) {
			
			upDiagonal = pixels[row][col];
			downDiagonal = pixels[col][row];
			upDiagonal.setColor(downDiagonal.getColor());
		}
	}
	
}

public void mirrorArms()
{
  int mirrorPoint = 196;
  Pixel leftPixel = null;
  Pixel rightPixel = null;
  Pixel[][] pixels = this.getPixels2D();
  
  // loop through the rows
  for (int row = 157; row < mirrorPoint; row++)
  {
    // loop from 13 to just before the mirror point
    for (int col = 100; col < 168; col++)
    {
      
      leftPixel = pixels[row][col];      
      rightPixel = pixels[row + 80]                       
                       [col - 5];
      rightPixel.setColor(leftPixel.getColor());
    }
  }
  for (int row = 168; row < mirrorPoint; row++)
  {
    // loop from 13 to just before the mirror point
    for (int col = 239; col < 296; col++)
    {
      
      leftPixel = pixels[row][col];      
      rightPixel = pixels[row + 80]                       
                       [col + 6];
      rightPixel.setColor(leftPixel.getColor());
    }
  }
}

public void mirrorGull() {
	    int mirrorPoint = 340;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 200; row < 341; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 200; col < mirrorPoint; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row]                       
	                         [mirrorPoint - col + mirrorPoint + 80];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
	  }

public void encode(Picture picture) {
	//  b
	//b c b
	//  b
	//
	//
	int color = 0;
	Pixel[][] pixels = this.getPixels2D();
	Pixel[][] messagePixels = picture.getPixels2D();
//	System.out.println(pixels.length);System.out.println(pixels[0].length);
//	System.out.println(messagePixels.length);System.out.println(messagePixels[0].length);
	//Iterate through all the pixels
	for(int row = 2; row < messagePixels.length - 2; row++) {
		for(int col = 2; col < messagePixels[0].length - 2; col++) {
			//Skip over a pixel for the least value in rgb
			Pixel skipPixel = pixels[row][col + 2];
			if (skipPixel.getBlue() % 2 == 0 && skipPixel.getBlue() < skipPixel.getRed() && skipPixel.getBlue() < skipPixel.getGreen()) {
				skipPixel.setBlue(skipPixel.getBlue() - 1);
			}
			else if (skipPixel.getGreen() % 2 == 0 && skipPixel.getGreen() < skipPixel.getRed() && skipPixel.getGreen() < skipPixel.getBlue()) {
				skipPixel.setGreen(skipPixel.getGreen() - 1);
			}
			else if (skipPixel.getRed() % 2 == 0 && skipPixel.getRed() < skipPixel.getBlue() && skipPixel.getRed() < skipPixel.getGreen()) {
				skipPixel.setRed(skipPixel.getRed() - 1);
			}
			//if black
			Pixel messagePixel = messagePixels[row][col];
			if(messagePixel.colorDistance(Color.BLACK) < 50) {
				//load in pixels creating a staggered circle
				Pixel[] pixelCollection = new Pixel[16];
				int index = 0;
				for (int i = -2; i < 2; i++) {
					pixelCollection[index] = pixels[row][col + i];
					pixelCollection[index + 4] = pixels[row + i][col];
					pixelCollection[index + 8] = pixels[row + i][col - i];
					pixelCollection[index + 12] = pixels[row - i][col + i];
					index++;
				}
				index = 0;
				//iterate over the pixel collection
				for(Pixel pixel : pixelCollection) {
					//every four pixels switch the color
					if(index % 4 == 0 && index != 0)
						color++;
					index++;
					if(color >= 2)
						color = -1;
					//change the r g b values to even accordingly
					switch(color) {
					case 0:
						if(pixel.getRed() % 2 == 1) {
							pixel.setRed(pixel.getRed() + 1);
						}
						break;
					case 1:
						if(pixel.getBlue() % 2 == 1) {
							pixel.setBlue(pixel.getBlue() + 1);
						}
						break;
					case 2:
						if(pixel.getGreen() % 2 == 1) {
							pixel.setGreen(pixel.getGreen() + 1);
						}
						break;
					}
				}
				color = 0;
				if(color >= 2)
					color = -1;
				color++;
			}
		}
	}
	
}
public Picture decode() {
	int color = 0;
	Pixel[][] pixels = this.getPixels2D();
	Picture messagePicture = new Picture(pixels.length,pixels[0].length);
	Pixel[][] messagePixels = messagePicture.getPixels2D();
	for(int row = 2; row < messagePixels.length - 2; row++) {
		for(int col = 2; col < messagePixels[0].length - 2; col++) {
//			Pixel right = pixels[row][col + 1];
//			Pixel left = pixels[row][col - 1];
//			Pixel up = pixels[row - 1][col];
//			Pixel down = pixels[row + 1][col];
//			Pixel[] pixelCollection = {right,left,up,down,pixels[row][col + 2],pixels[row][col - 2],pixels[row + 2][col],pixels[row - 2][col],pixels[row - 1][col - 1],pixels[row + 1][col + 1],pixels[row - 1][col + 1],pixels[row + 1][col - 1],pixels[row + 2][col + 2],pixels[row - 2][col - 2],pixels[row + 2][col - 2],pixels[row - 2][col + 2]};
			Pixel[] pixelCollection = new Pixel[16];
			int index = 0;
			for (int i = -2; i < 2; i++) {
				pixelCollection[index] = pixels[row][col + i];
				pixelCollection[index + 4] = pixels[row + i][col];
				pixelCollection[index + 8] = pixels[row + i][col - i];
				pixelCollection[index + 12] = pixels[row - i][col + i];
				index++;
			}
			index = 0;
			boolean similar = true;
			for(Pixel pixel : pixelCollection) {
				if(index % 4 == 0 && index != 0)
					color++;
				index++;
				if(color >= 2)
					color = -1;
				switch(color) {
				case 0:
					if(pixel.getRed() % 2 == 1) {
						similar = false;
					}
					break;
				case 1:
					if(pixel.getBlue() % 2 == 1) {
						similar = false;
					}
					break;
				case 2:
					if(pixel.getGreen() % 2 == 1) {
						similar = false;
					}
				}
			}
			color = 0;
			if(similar)
				messagePixels[row][col].setColor(Color.BLACK);
			if(color >= 2)
				color = -1;
			color++;
		}
	}
	//clean it up a little bit
	for(int row = 2; row < messagePixels.length - 2; row++) {
		for(int col = 2; col < messagePixels[0].length - 2; col++) {
			Pixel currentPixel = messagePixels[row][col];
			Pixel right = messagePixels[row][col + 1];
			Pixel left = messagePixels[row][col - 1];
			Pixel up = messagePixels[row - 1][col];
			Pixel down = messagePixels[row + 1][col];
			if(currentPixel.getColor().getRed() == 0 && currentPixel.getBlue() == 0 && currentPixel.getGreen() == 0) {
				int sideCount = 0;
				if(right.getAverage() == 255) {
					sideCount++;
				}
				if(left.getAverage() == 255) {
					sideCount++;
				}
				if(up.getAverage() == 255) {
					sideCount++;
				}
				if(down.getAverage() == 255) {
					sideCount++;
				}
				if(sideCount >= 3) {
					currentPixel.setColor(Color.WHITE);
				}
				
			}
		}
	}
	return messagePicture;
}
public void encodeTest(Picture messagePict)
{
Pixel[][] messagePixels = messagePict.getPixels2D();
Pixel[][] currPixels = this.getPixels2D();
Pixel currPixel = null;
Pixel messagePixel = null;
int count = 0;
for (int row = 0; row < this.getHeight(); row++)
{
for (int col = 0; col < this.getWidth(); col++)
{
// if the current pixel red is odd make it even
currPixel = currPixels[row][col];
if (currPixel.getRed() % 2 == 1)
currPixel.setRed(currPixel.getRed() - 1);
messagePixel = messagePixels[row][col];
if (messagePixel.colorDistance(Color.BLACK) < 50)
{
currPixel.setRed(currPixel.getRed() + 1);
count++;
}
}
}
System.out.println(count);
}
/**
* Method to decode a message hidden in the
* red value of the current picture
* @return the picture with the hidden message
*/
public Picture decodeTest()
{
Pixel[][] pixels = this.getPixels2D();
int height = this.getHeight();
int width = this.getWidth();
Pixel currPixel = null;

Pixel messagePixel = null;
Picture messagePicture = new Picture(height,width);
Pixel[][] messagePixels = messagePicture.getPixels2D();
int count = 0;
for (int row = 0; row < this.getHeight(); row++)
{
for (int col = 0; col < this.getWidth(); col++)
{
currPixel = pixels[row][col];
messagePixel = messagePixels[row][col];
if (currPixel.getRed() % 2 == 1)
{
messagePixel.setColor(Color.BLACK);
count++;
}
}
}
System.out.println(count);
return messagePicture;
}
  
} // this } is the end of class Picture, put all new methods before this
