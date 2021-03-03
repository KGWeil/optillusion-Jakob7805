
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
        size(260,140);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        alleQuadrate();
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
        fill( farbwert );
        rect(x, y, s, s);
        ellipseMode(CORNERS);
        if ( farbwert == 255 ) {  
            fill( 0 ); 
        } else {  
            fill( 255 ); 
        }
        int d = s/4;
        if ( links ) {
            ellipse( x, y, x+d, y+d );  
            ellipse( x, y + 3*d, x+d, y+s ); 
        } else {
            ellipse( x + 3*d, y, x+s, y+d );  
            ellipse( x + 3*d, y + 3*d, x+ s, y+s );
        }
    }

    public void alleQuadrate()
    {
        int x = 10;
        int y = 10;
        boolean links = true;
        int farbe = 0;
        
        
        for(int j = 0; j < 4; j++)
        {
            
        for(int i = 0; i < 8; i++)
        {
            zeichneQuadrat(x +s * i, y , farbe, links);
            
            farbe = (i%2 == 0)? 255:0;

            
        }
        
        if(links == true){links = false;} else{links = true;}
        zeichneLinien(y);
        y = y + 30;
        
        
    }
}
    public void zeichneLinien(int y)
    {
       stroke(127, 255, 0);
       line(0, y, 260, y);
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
