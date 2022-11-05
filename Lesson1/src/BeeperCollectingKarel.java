import com.shpp.karel.KarelTheRobot;

public class BeeperCollectingKarel extends KarelTheRobot {
    @Override
    public void run() throws Exception {
        collectAllBeepers();
        dropAllBeepers();
        goHome();

    }

    private void collectAllBeepers() throws Exception {
        while (frontIsClear()) {
            collectOneTower();
            move();
        }
        collectOneTower();
    }

    private void collectOneTower() throws Exception {
        turnLeft();
        collectLineOfBeeper();
        turnAround();
        moveToWall();
        turnLeft();
    }

    private void moveToWall() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }

    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    private void collectLineOfBeeper() throws Exception {
        while (beepersPresent()) {
            pickBeeper();
           if (frontIsClear()) {
                move();
            }
        }
    }

    private void dropAllBeepers() throws Exception {
        for (int i = 0; i < 21; i++) {
            if (beepersInBag()) {
                putBeeper();
            }
        }


    }

    private void goHome() throws Exception {
        turnAround();
        moveToWall();
        turnAround();
    }
}
