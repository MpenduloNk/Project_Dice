public class DiceFactory {
    DiceFactory(){
    }

    static void makeDice(int sides){
        int value;
        int min = 1;
        int range =  sides - min + 1;

        value = (int)(Math.random() * range) + min;
        System.out.println("Your make dice no. is: "+ value);
    }
}
