import java.util.Scanner;

public class Main {

    public static boolean validation(String diceNumber){
        boolean boolValue = false;
        try {
            if (Integer.parseInt(diceNumber) == 6 || Integer.parseInt(diceNumber) == 10){
                boolValue = true;
            }
        }catch (NumberFormatException e){
            boolValue = false;
        }
        return boolValue;
    }
 
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        Die die6 = new Die(6, arr);
        System.out.println("Your roll up number for dice is : "+die6.roll());

        String diceNumber;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter 6 or 10 :");
            diceNumber = scanner.nextLine();

            if (validation(diceNumber) && Integer.parseInt(diceNumber) == 6){
                Die d = new Die(Integer.parseInt(diceNumber), new int[]{1,1,1,1,1,2});
                d.roll();

                System.out.println("\nFair dice from Dice factory");
                DiceFactory.makeDice(Integer.parseInt(diceNumber));
                DiceFactory.makeDice(Integer.parseInt(diceNumber));

            }
            else if (validation(diceNumber) && Integer.parseInt(diceNumber) == 10){
                Die d = new Die(Integer.parseInt(diceNumber), new int[]{1,1,1,1,1,1,1,1,1,1});
                d.roll();

                System.out.println("\nFair dice from Dice factory");
                DiceFactory.makeDice(Integer.parseInt(diceNumber));
                DiceFactory.makeDice(Integer.parseInt(diceNumber));

            }
            else{
                System.out.println("Only integer values allowed and value must either be 6 or 10");
            }

        }while (!validation(diceNumber));

    }

}
