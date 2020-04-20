import java.util.Random;
import java.util.Scanner;

public class Die {
    public int sides;
    public int[] probabilities;
    public Die(int sides, int[] probabilities){
        this.sides = sides;
        this.probabilities = probabilities;
        setProbabilities(probabilities);
    }
    public int  roll(){
        int min = 0;
        Random diceNumber = new Random();
        return diceNumber.nextInt((sides  - min) + 1) + min;
    }

    public int[] setProbabilities(int[] probabilities){
        int totalSum = 0;
        if (probabilities.length == 0 && roll() == 6){
            probabilities = new  int[]{1,1,1,1,1,1};
        }
        if (probabilities.length == 0 && roll() == 10){
            probabilities = new  int[]{1,1,1,1,1,1,1,1,1,1};
        }

        for (int i = 0; i < probabilities.length; i++) {
            if (probabilities[i] < 0){
                System.out.println("ERROR: negative probabilities not allowed");
                totalSum = 1;
                break;
            }
            totalSum += probabilities[i];
        }

        if (totalSum < 1){
            System.out.println("ERROR: probability sum must be greater than 0");
        }
        return probabilities;
    }
}
