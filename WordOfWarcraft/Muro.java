import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro extends Actor
{
    /**
     * Act - do whatever the Muro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean tipo;
    
    public void act(boolean tipo)
    {
        this.tipo = tipo;
    }    
}
