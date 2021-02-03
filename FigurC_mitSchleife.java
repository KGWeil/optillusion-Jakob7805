
import processing.core.PApplet;

/**
 * Klasse figurC_mitSchleife.
 * Beschreibung: Die FigurC aus der vorherigen Aufgabe soll mit einer Zählschleife implementiert werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class FigurC_mitSchleife extends PApplet

{   
    protected static short bild = 2; //Neue Variable, die das Bild anzeigt
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {

        switch(bild){
        case 0: size(320,50);
        break;
        case 1: size(100, 250);
        break;
        case 2: size(250, 250);
        break;
        default: return;
        
    }

    }        

    private void zeichneBildB() 
    {
        for (int i = 0; i < 10; i++)
        {
            rect(30 * i + 10, 10, 30, 30);
        }
    }

    private void zeichneBildC()
    {
       
    }

    private void zeichneBildD()
    {
     for (int i = 0; i < 10; i++)
        {
     circle(125, 125, 10 * i + 10);
     }
    }
    
    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        switch(bild) {
        case 0: zeichneBildB();
        break;
        case 1: zeichneBildC();
        break;
        case 2: zeichneBildD();
        break;
        default: return;
    }
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {FigurC_mitSchleife.class.getName() });
    }

}
