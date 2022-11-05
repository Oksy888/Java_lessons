package com.shpp.p2p.cs.olarchenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {
    //Specifies the program entry point
    @Override
    public void run() throws Exception {
        while (frontIsClear()) {
            fillInColumnAndGoDown();
            GoToTheNextColunm();
        }
        // if front isn`t clear, the last corner is needed to be filled with beeper
        fillInColumnAndGoDown();
    }

    // go through the column until the wall and put beepers in empty place
    private void fillInColumnAndGoDown() throws Exception {
        turnLeft();
        while (frontIsClear()) {
            if (noBeepersPresent()) {
                putBeeper();
            }
            move();
        }
        if (noBeepersPresent()) {
            putBeeper();
        }
        GoDownAndLookOnEast();

    }

    // go down through the column and turn on east to further move
    private void GoDownAndLookOnEast() throws Exception {
        turnAround();
        goToTheWall();
        turnLeft();
    }

    //moving to the next column, as we know it happening on equal rang every 4th column
    private void GoToTheNextColunm() throws Exception {
        for (int i = 0; i <= 3; i++) move();
    }

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

