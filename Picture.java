/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Circle floor;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person man;
   


    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {    
       
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        floor = new Circle();
        floor.moveVertical(160);
        floor.moveHorizontal(-480);
        floor.changeSize(1000);
        floor.changeColor("green");
        floor.makeVisible();
        
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();            
        
        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();      
    }

    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    public void slowMoveSun()
    {
       sun.slowMoveVertical(80);
       wall.changeColor("black");
       window.changeColor("white");       
       roof.changeColor("black");
       floor.changeColor("black");
       sun.changeColor("black");
    }
    
    /**
     * Slowly move the person vertically by 'distance' pixels.
     */
    public void slowMoveMan()
    {
       man = new Person();
       man.makeVisible();
       man.moveHorizontal (-200);
       man.slowMoveHorizontal (60);      
    }
   
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
                        roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
