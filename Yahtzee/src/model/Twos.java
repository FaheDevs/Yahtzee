package model;

public class Twos implements Combination {


    @Override
    public int getScore(DiceHand hand) {
        int TwosSum = 0;

        for (int i = 0; i < 5 ; i++) {
            if(hand.get(i) == 2) TwosSum+=2;
        }

        return TwosSum;
    }

    @Override
    public String description() {
        return "Sum of Twos";
    }
}
