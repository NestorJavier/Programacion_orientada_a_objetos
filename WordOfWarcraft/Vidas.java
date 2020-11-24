import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vidas extends Actor
{
   private int vid;
    public Vidas(){    
        vid=4;
    }
    public void act() 
    {
    }   
    public void cambia()
    {     
        vid--;
        if(vid>0)
        {
        setImage(vid+".png");
        }
    }
}
