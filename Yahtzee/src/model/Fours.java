package model;

public class Fours implements Combination {


    @Override
    public int getScore(DiceHand hand) {
        int FoursSum = 0;

        for (int i = 0; i < 5 ; i++) {
            if(hand.get(i) == 4) FoursSum+=4;
        }

        return FoursSum;
    }

    @Override
    public String description() {
        return "Sum of Fours";
    }
}