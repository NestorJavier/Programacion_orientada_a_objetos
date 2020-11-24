import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Word here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Word extends Personaje
{
     public void act() 
    {
               if (atWorldEdge()){
            turn (700);
        }
        if(Greenfoot.getRandomNumber(100)<10){
        
           turn (60);
        }
        move();
    }    
}
