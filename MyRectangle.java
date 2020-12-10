import java.awt.Color;
import java.awt.Graphics;
public class MyRectangle extends MyShape
{
    //------data fields------
    private boolean filled; // whether this shape is filled

    //------constructors-------
    /**
    * no-argument constructor, initializes vales data to 0 ,color to black and filled to flase
    */
    public MyRectangle() 
    {
      super();
      this.filled = false;
    }
    /**
    * MyRectangle constructor with parameters
    * @param x1 the value of X of the first dot
    * @param y1 the value of y of the first dot
    * @param x2 the value of X of the second dot
    * @param y2 the value of y of the second dot
    * @param myColor the value of the shape's color
    * @param filled boolean value if the shape is filled with color
    */
    public MyRectangle(int x1, int y1, int x2, int y2, Color myColor, boolean filled)
    {
      super(x1,y1,x2,y2,myColor);
      this.filled = filled;
    }

    //------methods---------
    //sets:
    /**
    * set method of if the rectangle is filled with color
    * @param filled boolean value if the shape is filled with color
    */
    public void setFilled(boolean filled)
    {
      this.filled = filled;
    }
      //
    //gets:
    /**
    * get method of if the rectangle is filled with color
    * @return boolean value if the shape is filled with color
    */
    public boolean isFilled()
    {
      return filled;
    } 
      //
    /**
    * get method of the upper left X coordinate
    * @return int value of the minimun between X1 to X2
    */
    public int getUpperLeftX() // get upper left x coordinate
    {
      return Math.min(getX1(), getX2());
    }
    /**
    * get method upper left y coordinate
    * @return int value of the minimum between y1 to y2
    */
    public int getUpperLeftY() // get upper left y coordinate
    {
      return Math.min(getY1(), getY2());
    } 
    /**
    * get method of the width of the shape
    * @return int value of the width of the shape
    */
    public int getWidth() // get shape width
    {
      return Math.abs(getX2() - getX1());
    }
    /**
    * get method of the height of the shape
    * @return int value of the height of the shape
    */
    public int getHeight() // get shape height
    {
      return Math.abs(getY2() - getY1());
    }
    /**
    * draw method which draws the outline an oval
    */
    public void draw(Graphics g)
    {
      g.setColor(getColor());
      
      if (isFilled())
        g.fillRect(getUpperLeftX(), getUpperLeftY(),getWidth(), getHeight());
      else
        g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
    } 
}