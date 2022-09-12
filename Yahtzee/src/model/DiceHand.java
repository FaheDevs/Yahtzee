package model;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiceHand {
    private List<Integer> faces = new ArrayList<>();





    public DiceHand(List<Die> dice) {

        dice.add(new Die());
        dice.add(new Die());
        dice.add(new Die());
        dice.add(new Die());
        dice.add(new Die());

        faces.add(dice.get(0).value());
        faces.add(dice.get(1).value());
        faces.add(dice.get(2).value());
        faces.add(dice.get(3).value());
        faces.add(dice.get(4).value());

    }

    public int get(int die ){

        return faces.get(die);
    }
    public int sum(){
        Die de =new Die();
        int Sum=0;
        for (int i = 0; i < 5 ; i++) {
            Sum+=de.value();
        }
        // Die de =new Die();
        //Sum=Sum+de.value();
        return Sum;


    }
//    public int count(int faceValue){
//        int counter =0;
//        Die dieCount =new Die();
//        List<Integer> facesFreq = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            faces.add(dieCount.value());
//            counter+= dieCount.value();
//        }
//        for (int i = 0; i < 6; i++) { // add the frequency of each face from 1 to 6
//            facesFreq.add(Collections.frequency(faces, i + 1));
//        }
//        if (Collections.frequency(faces, i + 1) == 3) return counter;
//        return 0;
//
//
//        return  faceValue;
//
//    }
}