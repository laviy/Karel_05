/**
*
* Description of the program goes here  // provide a brief description
*
* @author Yoni Lavi
* @version 6/11/14
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {

     public static void main(String[] args) {
          Display.openWorld("maps/shuttle.map");
          Display.setSize(10, 10);
          Display.setSpeed(8);
          Racer karel = new Racer(1);
          Racer bob = new Racer(4);
          Racer tom = new Racer(7);
          karel.runTheRace();
          bob.runTheRace();
          tom.runTheRace();
           
     }
}
