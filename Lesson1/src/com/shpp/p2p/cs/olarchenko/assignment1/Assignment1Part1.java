package com.shpp.p2p.cs.olarchenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1 extends KarelTheRobot {
    //Specifies the program entry point
    @Override
    public void run() throws Exception {
        goToTheNewspaper();
        pickNewspaper();
        goBackInStartPoint();
    }
// Go to the house enter - it is point without wall
    private void goToTheNewspaper() throws Exception {
        goToTheWall();
        turnRight();
        move();
        turnLeft();
        move();
        move();
    }
// if there is a newspaper - pick it
    private void pickNewspaper() throws Exception {

        if (beepersPresent()) {
            pickBeeper();
        }
    }
    //go back to the start point, facing east
        private void goBackInStartPoint() throws Exception {
        turnAround();
        goToTheWall();
        turnRight();
        move();
        turnRight();
    }
    // turn on 180 degrees
       private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }
// turn right
    private void turnRight() throws Exception {
        for (int i = 0; i < 3; i++){
            turnLeft();
        }
    }
    //Moves forward until it is blocked by a wall
    private void goToTheWall() throws Exception {
        while (frontIsClear()){
            move();
        }
    }


}

