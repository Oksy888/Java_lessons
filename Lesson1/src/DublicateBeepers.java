import com.shpp.karel.KarelTheRobot;

public class DublicateBeepers extends KarelTheRobot {
    @Override
    public void run() throws Exception {
        goToBeepers();
        dublicBeepers();

   /*   for( int i = 0; i < 6; i ++){
          jumpOverHurdle();
          while (frontIsClear()){
              move();
          }
        }*/
    }

    private void dublicBeepers() throws Exception {
        for (int i = 0; i < 6; i ++){
            MoveBeeper();
            returnBackToOrigin();
        }

    }

    private void MoveBeeper() throws Exception {
        pickBeeper();
        move();
        putBeeper();

    }

    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    private void returnBackToOrigin() throws Exception {
        turnAround();
        move();
        putBeeper();
        turnAround();
    }

   /* private void jumpOverHurdle() throws Exception {
        turnLeft();
        while (rightIsBlocked()){
            move();
        }
        turnRight();
        move();
        move();
        turnRight();
        while (frontIsClear()){
            move();
        }
        turnLeft();
    }*/

    private void goToBeepers() throws Exception {
        while (noBeepersPresent()){
            move();
        }
    }

    private void turnRight() throws Exception {
        for (int i = 0; i < 3; i++){
            turnLeft();
        }
    }
    private void moveWhileFrontIsClear() throws Exception {
        while (frontIsClear()){
            move();
        }
    }
}
