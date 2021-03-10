
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen2 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(1200,1200);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        int y = 0;
        int x = 0;
        boolean modus = false;
    for(int j = 1; j<= 12; j++)
    {
        
    for(int i = 1; i <= 12; i++)
    {
        zeichneQuadrat(x, y, 100, modus);
        modus = !modus;
        
        x = 100 * i;
    }
    y = 100 * j;
    modus = !modus;
    }
    }
    private void zeichneQuadrat(int x, int y, int s, boolean modus)
    {
        if(modus)
        {
            fill(0, 255, 0);
            int sn = s - 10;
            rect(x + 5, y + 5, sn, sn);
        }else
        {
            fill(255, 255, 255);
            stroke(0, 255, 0);
            rect(x, y, s, s);
        }
    }
    

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen2.class.getName() });
    }

}
