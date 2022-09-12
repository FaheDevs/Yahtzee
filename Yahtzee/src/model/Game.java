package model;

import java.util.ArrayList;
import java.util.List;

public class Game {

  private  List<Die> dice= new ArrayList<>();
  private  List<ScoreRow> rows = new ArrayList<>();
  private int nbReRolls=3;

  public Game (){
    dice.add( new Die());
    dice.add(new Die());
    dice.add(new Die());
    dice.add(new Die());
    dice.add(new Die());

    rows.add(new ScoreRow(new Aces()));
    rows.add(new ScoreRow(new Twos()));
    rows.add(new ScoreRow(new Threes() ));
    rows.add(new ScoreRow(new Fours() ));
    rows.add(new ScoreRow(new Fives()));
    rows.add(new ScoreRow(new Sixes()));
    rows.add(new ScoreRow(new Chance()));
    rows.add(new ScoreRow(new FourOfKind()));
    rows.add(new ScoreRow(new FullHouse()));
    rows.add(new ScoreRow(new ThreeOfKind()));
    rows.add(new ScoreRow(new LargeStraight()));
    rows.add(new ScoreRow(new SmallStraight()));
    rows.add(new ScoreRow(new Yahtzee()));






    initialRoll();

  }

  public List<Die> getDice() {

    return List.of(dice.get(0),dice.get(1),dice.get(2),dice.get(3),dice.get(4));
  }

  public List<ScoreRow> getRows() {

    return rows;
  }


  private void unblockDice(){


      dice.get(0).unblock();
      dice.get(1).unblock();
      dice.get(2).unblock();
      dice.get(3).unblock();
      dice.get(4).unblock();

  }
  public boolean choose(ScoreRow scoreRow) { // this method to works with get score method
    if (scoreRow.isAvailable()) {
      scoreRow.record(getHand());
      initialRoll();
      return false;
    }else
      return true;
  }

  public void reRoll() {

    if(nbReRolls >=1){


      dice.get(0).roll();
      dice.get(1).roll();
      dice.get(2).roll();
      dice.get(3).roll();
      dice.get(4).roll();
      nbReRolls--;
    }
  }

  public void initialRoll() {

    unblockDice();
    nbReRolls=3;
    reRoll();

  }

  public int getTotalScore() {
    int getTotal = 0;

    for(ScoreRow row: rows){
      getTotal += row.getScore();
    }
    return getTotal;
  }


  private DiceHand getHand(){

    return new DiceHand(dice);

  }
}