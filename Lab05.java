/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {

     public static void main(String[] args) {
          Display.openWorld("maps/shuttle.map");
          Display.setSize(10, 10);
          Display.setSpeed(5);
          Racer karel = new Racer(1);
          Racer bob = new Racer(4);
          Racer tom = new Racer(7);
          karel.shuttle(2, 7);
          karel.shuttle(4, 5);
          karel.shuttle(6, 3);
          karel.move();
          bob.shuttle(2, 7);
          bob.shuttle(4, 5);
          bob.shuttle(6, 3);
          bob.move();
          tom.shuttle(2, 7);
          tom.shuttle(4, 5);
          tom.shuttle(6, 3);
          tom.move();
           
     }
}
