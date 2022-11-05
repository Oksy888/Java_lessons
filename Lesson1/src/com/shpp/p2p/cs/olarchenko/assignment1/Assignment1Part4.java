package com.shpp.p2p.cs.olarchenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part4 extends KarelTheRobot {
    //Specifies the program entry point
    @Override
    public void run() throws Exception {

        while (frontIsClear() && leftIsClear()) {
            fillInRowOneBeeperOneEmpty();
            GoBackToTheStartAndGoUp();
            fillInSecondRowOneBeeperOneEmpty();
            GoBackToTheStartAndGoUp();
        }
        if (leftIsBlocked()) {
            fillInRowOneBeeperOneEmpty();
        }
    }

    private void fillInSecondRowOneBeeperOneEmpty() throws Exception {
        while (frontIsClear()) {
            if (frontIsClear()) {
                move();
            }
            putBeeper();
            if (frontIsClear()) {
                move();
            }
        }
    }

    private void GoUpRow() throws Exception {
        turnRight();
        if (frontIsClear()) {
            move();
        }
        turnRight();
    }

    //
    private void fillInRowOneBeeperOneEmpty() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            if (frontIsClear()) {
                move();
            }
            if (frontIsClear()) {
                move();
                putBeeper();
            }
        }
    }

    // go down through the column and turn on east to further move
    private void GoBackToTheStartAndGoUp() throws Exception {
        turnAround();
        goToTheWall();
        GoUpRow();
    }

    //moving to the next column, as we know it happening on equal rang every 4th column

    // turn on 180 degrees
    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    // turn right
    private void turnRight() throws Exception {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }

    //Moves forward until it is blocked by a wall
    private void goToTheWall() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }


}

