package model;

public class Fives implements Combination {


    @Override
    public int getScore(DiceHand hand) {
        int FivesSum = 0;

        for (int i = 0; i < 5 ; i++) {
            if(hand.get(i) == 5) FivesSum+=5;
        }

        return FivesSum;
    }

    @Override
    public String description() {
        return "Sum of Fives";
    }
}