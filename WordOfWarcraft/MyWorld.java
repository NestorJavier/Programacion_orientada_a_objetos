import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 600, 1);
        addObject(new Jugador(),65,513);
        int i = 25;
        int j = 20;
        
        try
        {
           //Abrir el fichero indicado en la variable nombreFichero
           FileReader fr = new FileReader("Level1.txt");
           //Leer el primer carácter
           //Se debe almacenar en una variable de tipo int
           int caract = fr.read();
           //Se recorre el fichero hasta encontrar el carácter -1
           //   que marca el final del fichero
           while(caract != -1)
           {
               if((char)caract == '1')
               {
                   addObject(new MuroN(),i,j);
                   i = i+50;
               }
               else
                if((char)caract == '0')
                {
                    addObject(new MuroE(),i,j);
                    i = i+50;
                }
                else
                 if((char)caract == ' ')
                 {
                     i = i+50;
                 }
                 else
                  if((char)caract == '\n')
                  {
                     i = 25;
                     j = j+45;
                  }
                 

               //Leer el siguiente carácter
               caract = fr.read();
           }
           //Cerrar el fichero
           fr.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void leer(String nombreArchivo)
    {
        
    }
    
}
