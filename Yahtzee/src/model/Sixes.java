package model;

public class Sixes implements Combination {


    @Override
    public int getScore(DiceHand hand) {
        int SixesSum = 0;

        for (int i = 0; i < 5 ; i++) {
            if(hand.get(i) == 6) SixesSum+=6;
        }

        return SixesSum;
    }

    @Override
    public String description() {
        return "Sum of Sixes";
    }
}