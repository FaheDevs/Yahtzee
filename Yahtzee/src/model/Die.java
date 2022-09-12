package model;

import java.util.Random;

public class Die {

  private Random  generator = new Random();
  private int faceValue;
  private boolean isBlocked=false;

  public Die(){

 faceValue=generator.nextInt(6)+1;
 }

  public boolean isBlocked() {

    return isBlocked;
  }

  public void unblock() {
    isBlocked=false;

  }

  public void block() {
      isBlocked=true;
  }

  public int value() {
    return this.faceValue;
  }
  public int roll(){

      if(!isBlocked) faceValue=generator.nextInt(6)+1;

    return faceValue;

  }
}
