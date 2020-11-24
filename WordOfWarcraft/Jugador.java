import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Personaje
{
    private int pun;
    private int x,y;
    private int dir;
    private int cont;

     public Jugador(){
        pun = 0;
        dir=0;
        cont=0;
    }   
     public void act()
    {               
        
        sonido();
      
        Move();
        cont ++;
        
    }
    public void sonido(){
        if(canSee(Word.class)){
            eat(Word.class);
            Greenfoot.playSound("slurp.wav");
            pun++;
        }
    }
    public void Move(){
         x=getX();
         y=getY();

        if(Greenfoot.isKeyDown("right")){
            dir=0; //Direccion 0 derecha
            MoveAux(x,y,dir);
            setLocation(x+2,y);
        }else
              if(Greenfoot.isKeyDown("left"))
              {
                 dir=1; //Direccion 1 izquierda
                 MoveAux(x,y,dir);
                 setLocation(x-2,y);
              }
              else 
                 if(Greenfoot.isKeyDown("up"))
                 { 
                  dir=2; //Direccion 2 arriba
                  MoveAux(x,y,dir);
                  setLocation(x,y-2); 
                 } 
                   else
                      if(Greenfoot.isKeyDown("down")&& isTouching(Muro.class))
                         {
                          dir=2; //Direccion 2 abajo
                          MoveAux(x,y,dir);
                          setLocation(x,y+2);
                                        
                          }
                         else
                            {
                             if(dir==0)
                             setImage("1E.png");
                             if(dir==1)
                             setImage("5E.png");
                             if(dir==2)
                             setImage("espalda.png");                          
                             if(dir==2)
                             setImage("frente.png");                        
                            }
                            
        
    }
    public void MoveAux(int x,int y,int dir)
    {
      
    if(dir==0){

        if(cont == 2)
        {
            setImage("1E.png");
        }
        if(cont == 4)
        {
            setImage("4E.png");
        }
        if(cont == 4)
        {
            setImage("7E.png");
        }
        if(cont == 8)
        {
            setImage("8E.png");
        }
        if(cont == 10)
        {
            setImage("5E.png");
        }
        if(cont >= 6)
        {
            setImage("4E.png");
            cont = 0;
        }
      

    }
    else
     if(dir==1){
         
        if(cont == 2)
        {
            setImage("1R.png");
        }
        if(cont == 4)
        {
            setImage("2R.png");
        }
        if(cont == 6)
        {
            setImage("7R.png");
        }
        if(cont == 8)
        {
            setImage("4R.png");
        }
        if(cont == 10)
        {
            setImage("5R.png");
        }
        if(cont >= 12)
        {
            setImage("4R.png");
            cont = 0;
        }
         
         
        }

      else
          if(dir==2){

            if(cont == 2)
            {
            setImage("espalda.png");
            }
            if(cont == 4)
            {
             setImage("espalda.png");
            }
            if(cont == 6)
            {
            setImage("espalda.png");
            }
            if(cont == 8)
            {
            setImage("espalda.png");
            }
            if(cont == 10)
            {
            setImage("espalda.png");
            }
            if(cont >= 12)
            {
            setImage("espalda.png");
            cont = 0;
            }

         }
          else
              if(dir==2){
                  
                 if(cont == 2)
                 {
                 setImage("frente.png");
                 }
                 if(cont == 4)
                 {
                 setImage("frente.png");
                 }
                 if(cont == 6)
                 {
                 setImage("frente.png");
                 }
                 if(cont == 8)
                 {
                 setImage("frente.png");
                 }
                 if(cont == 10)
                 {
                 setImage("frente.png");
                 }
                 if(cont >= 12)
                 {
                 setImage("frente.png");
                 cont = 0;
                 }

                }
            }
    
 
}
