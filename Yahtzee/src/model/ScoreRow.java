package model;

import java.util.ArrayList;
import java.util.List;

public class ScoreRow {


  private int score;
  private boolean isFilled = false;
  private Combination combination;


  public ScoreRow(Combination Handset){

    this.combination = Handset;
    isFilled=false;
    score = 0;

  }


 // public void reset() {
  //  score = 0;
 // }

  public String description() {


    return combination.description();
  }

   public void reset() {
    score = 0;
  }



  public boolean isAvailable() {
    return !isFilled;
  }

  public int getScore() {

    return score;
  }

  public void record(DiceHand hand) { // this method records the score
    score = combination.getScore(hand);
    isFilled = true;


  }


}
