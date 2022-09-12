package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeOfKind implements Combination {

    @Override
    public int getScore(DiceHand hand) {

        int sum = 0; // sum of all faces to be returned if three of kind
        List<Integer> facesFreq = new ArrayList<>();// frequency of the 6 faces
        List<Integer> faces = new ArrayList<>(); // the 5 dice faces in the passed hand


        for (int i = 0; i < 5; i++) { // get the faces in an array
            faces.add(hand.get(i));
            sum += hand.get(i);
        }


        for (int i = 0; i < 6; i++) { // add the frequency of each face from 1 to 6
            facesFreq.add(Collections.frequency(faces, i + 1));
        }


        if (Collections.max(facesFreq) == 3) return sum;
        return 0;
    }

    @Override
    public String description() {
        return "Three of a Kind";
    }
}