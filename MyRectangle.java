import java.awt.Color;
import java.awt.Graphics;
public class MyRectangle
{
    //------data fields------
    private boolean filled; // whether this shape is filled

    //------constructors-------
    public MyRectangle() //default 
    {
        this.filled = false;
        super();
    }
    public MyRectangle(int x1, int y1, int x2, int y2, Color myColor, boolean filled)
    {
        this.filled = filled;
        super(x1,y1,x2,y2,myColor);
    }

    //------methods---------
    //sets:
    public void setFilled(boolean filled)
    {
      this.filled = filled;
    }
        //
    //gets:
    public boolean isFilled()
    {
       return filled;
    } 
        //
    
    public int getUpperLeftX() // get upper left x coordinate
    {
      return Math.min(getX1(), getX2());
    }
    public int getUpperLeftY() // get upper left y coordinate
    {
      return Math.min(getY1(), getY2());
    } 
    public int getWidth() // get shape width
    {
      return Math.abs(getX2() - getX1());
    }
    public int getHeight() // get shape height
    {
      return Math.abs(getY2() - getY1());
    }
    public void draw(Graphics g)
   {
      g.setColor(getColor());
      
      if (isFilled())
         g.fillRect(getUpperLeftX(), getUpperLeftY(),getWidth(), getHeight());
      else
         g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
   } 
}