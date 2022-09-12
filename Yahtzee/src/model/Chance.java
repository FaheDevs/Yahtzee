package model;

public class Chance implements Combination{
    @Override
    public int getScore(DiceHand hand) {



       /* for (int i = 0; i < 5 ; i++) {
            if(hand.get(i)==hand.get(i)) ChanceSum++;
        }*/

        return hand.sum();
    }

    @Override
    public String description() {
        return "Chance";
    }
}