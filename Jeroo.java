/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    // Put your own methods here
    



    public void rcorner(){
      hop();
      turn(RIGHT);
      hop();
      plant();
      turn(LEFT);
    }

    public void lcorner(){
      hop();
      turn(LEFT);
      hop();
      plant();
      turn(RIGHT);
    }

    public void backup(){ 
      turn(RIGHT);
      turn(RIGHT);
      hop();
      hop();
      plant();
    }

    public void spin(){
      
      turn(RIGHT);
      turn(RIGHT);
    }

    public void setupBowling(){
      rcorner();
      rcorner();
      rcorner();
      rcorner();
      lcorner();
      lcorner();
      lcorner();
      backup();
      hop();
      hop();
      plant();
      spin();
      rcorner();
      turn(RIGHT);
      hop();
      hop();
      hop();
    }
    
    
    
    
    
    

    // Do NOT touch the following code.
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
