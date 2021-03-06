
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: Hier sollen mehrere vorgegebene Figuren gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500, 1000); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
        //oben abstand 100, unten 200
        //mitte 100
        rect(50, 50, 400, 400);
        ellipse(250, 250, 350, 350);
        ellipse(250, 250, 250, 250);
        ellipse(250, 250, 150, 150);
        
        ellipse(250, 700, 400, 400);
        
        
        rect(110, 560, 280, 280); //erstes Rechteck
        
        rect(140, 590, 220, 220); //zweites Recheck
        
        rect(170, 620, 160, 160); //drittes Rechteck
        
        
        
        
        
        // Zeichne dir zunächst eine Skizze auf ein Blatt Papier und überlege dir, welche
        // Werte du den Methoden rect(x,y,b,h) und ellipse(x,y,b,h) übergeben musst, 
        // dass Bild C gezeichnet wird

        // ***** hier kommen deine Anweisungen hin ************

        // ***** Ende der eigenen Anweisungen **********
    }

    //***** Zusatzaufgabe bzw. Hausaufgabe *************
    public void zeichneBildA() {
        // ***** hier kommen deine Anweisungen hin ************
        ellipse(250, 250, 300, 300);
        rect(100, 400, 300, 300);
        triangle(250, 700, 100, 900, 400, 900);
        

        // ***** Ende der eigenen Anweisungen **********  
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        // zeichneBildC(); // Aufruf deiner Methode
        zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
