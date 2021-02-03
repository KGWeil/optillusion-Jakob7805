import processing.core.PApplet;
import processing.core.PFont;

public class Kaffeehaus extends PApplet
{       

    public int s = 40;
    int[] abstaende = {10, 20, 30, 20, 10, 20, 30, 20, 10};
    @Override
    public void settings()
    {
        size(640,400);

    }  

    public void parallelen()
    {
        for (int i = 0; i<10; i++) //Zählvariable i
        {
            line(0, i * s, 640, i * s); //10 Linien werden gezeichnet
        }
    }
    public void zeichneQuadrate()
    {
        fill(0);
        for (int j = 0; j <10; j++)
        {
            for (int i = 0; i < 8; i++)
            {
                rect(abstaende[j] + i * 2 * s, j * 40, s, s);
            }
        }
        
    }

    @Override
    public void setup()
    {
        background(255);
        stroke(125);
        parallelen();
        zeichneQuadrate();

    }

    @Override
    public void draw()
    {

    }

    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
