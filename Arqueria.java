
/**
 * Write a description of class Arqueria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arqueria
{
    // instance variables - replace the example below with your own
    private int edad;
    private int ancho;
    private int alto;
    private int salud;

    /**
     * Constructor for objects of class Arqueria
     */
    public Arqueria()
    {

     
    }

    public void golpear(int danio){
        salud -= danio;
    }
}
