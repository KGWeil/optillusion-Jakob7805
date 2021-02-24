
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    protected int s = 30;
    @Override
    public void settings()
    {
        size(500,500);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
    zeichneQuadrat( 10, 10, 255, true );
    }
    
    public int betrag(int x)
    {
        if(x < 0) {return -x;}else{return x;}
    }

    /**
     * Methode zeichneQuadrat
     *
     * @param x Ein Parameter
     * @param y Ein Parameter
     * @param farbe Ein Parameter
     * @param links Ein Parameter
     */
    public void zeichneQuadrat(int x, int y, int farbwert, boolean links)
    {
    int farbekreis = betrag(farbwert - 255);
    fill( farbwert );
    rect(x, y, s, s);
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
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}
