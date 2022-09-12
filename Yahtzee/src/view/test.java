package view;

import model.DiceHand;
import model.Die;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args){
        List<Die> dice1=new ArrayList<>();
        DiceHand d =new DiceHand(dice1);

        System.out.println(("get " ) + d.get(1)+d.get(2)+d.get(3));


            System.out.println(("roll() " ) + d.sum());

    }
}
