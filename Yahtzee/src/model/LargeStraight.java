package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargeStraight implements Combination {


    @Override
    public int getScore(DiceHand hand) {
        int sum = 0;
        List<Integer> faces = new ArrayList<>(); // the 5 dice faces in the passed hand

        for (int i = 0; i < 5; i++) { // get the faces in a list
            faces.add(hand.get(i));
        }


        Boolean isLargeStraight = false;
        if (faces.contains(2) && faces.contains(3) && faces.contains(4) && faces.contains(5)) {
            if ( faces.contains(1) || faces.contains(6)) {
                isLargeStraight = true;
            }
        }

        if(isLargeStraight){
            sum = 40;
        }

        return sum;
    }

    @Override
    public String description() {
        return "Large Straight";
    }
}