package model;

public class Threes implements Combination {


    @Override
    public int getScore(DiceHand hand) {
        int ThreesSum = 0;

        for (int i = 0; i < 5 ; i++) {
            if(hand.get(i) == 3) ThreesSum+=3;
        }

        return ThreesSum;
    }

    @Override
    public String description() {
        return "Sum of Threes";
    }
}
