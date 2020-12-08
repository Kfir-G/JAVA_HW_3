public class MyLine implements MyShape
{
    //------data fields------

    //------constructors-------
    public MyLine()
    {
        super();
    }
    public MyLine(int x1, int y1, int x2, int y2, Color myColor)
    {
        super(x1,y1,x2,y2,myColor);
    }

    //------methods---------
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }
}