import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
public class DrawPanel extends JPanel
{
    /* shapes values:
    0 = MyLine
    1 = MyOval
    2 = MyRectangle
    */

    private String statusText; //String containing shpape statistic information

    //-------data fields------
    private Random randomNumbers = new Random();
    private MyShape [] shapes; //array containing all shapes
    private int [] shapeCount; //statistic on the number of each shape

    //------constructors-------
    public DrawPanel(int numberShapes)
    {
        setBackground(Color.WHITE);
        initShapes(numberShapes);
    }

    //-------methods--------
    public void initShapes(numberShapes)
    {
        shapes = new MyShape[numberShapes]; //create the array of shape by user's input

        for(int i=0; i<numberShapes; i++)
        {

        }
    }
    private MyShape createShape(int shapeType, Color color, boolean filled, int... coordinates)
    {
        switch (shapeType) {
            case 0: //MyLine
                
                break;

            case 1: //MyOval

                break;
            case 2: //MyRectangle

                break;

            default:
                break;
        }
        //return new 
    }
}