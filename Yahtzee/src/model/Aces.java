package model;

public class Aces implements Combination{
    @Override
    public int getScore(DiceHand hand) {
        int AcesSum = 0;

        for (int i = 0; i < 5 ; i++) {
            if(hand.get(i) == 1) AcesSum++;
        }

        return AcesSum;
    }

    @Override
    public String description() {
        return "Count of Aces";
    }
}