
/**
 * Tester dieCup
 * 
 * @author Carl Uls�e Christensen og Freja �sterb�g
 * @version 1.0
 */
public class TestDriver   {    
    public static void test(int numberOfDies){
        DieCup cup = new DieCup(numberOfDies);
        cup.roll();
        System.out.println(cup.getEyes());
    }
    
    public static void testMulitple(int noOfRolls, int numberOfDies) {
        DieCup cup = new DieCup(numberOfDies);
        if (noOfRolls == 0) {
            return;
        }
        // We make a new variable which contains the sum of all the rolls
        double rollSum = 0.0;
        // Now we make a for loop to run roll exactly noOfRolls times. 
        for (int i = 1; i <= noOfRolls; i++) {
            // We roll and saves the number of eyes rolled in a temporary variable
            cup.roll();
            int tempEyes = cup.getEyes();
            // We then add the number of eyes to our sum and print out what we rolled.
            rollSum += tempEyes;
            System.out.println("Throw no " + i + ": " + tempEyes);
        }
        // then we output the average.
        double average = rollSum/noOfRolls;
        System.out.println("Average no of eyes: " + average);
    }
    
    public static void compareDieCups(int noOfRolls, int nod1, int nod2){
        // vi laver alle DieCups
        DieCup d1 = new DieCup(nod1);
        DieCup d2 = new DieCup(nod2);
        // tracker scoren
        int wins1 = 0;
        int wins2 = 0;
        int sameScore = 0;
        // roller noOfRolls gange
        for (int i = 1; i <= noOfRolls; i++) {
            // roller
            d1.roll();
            d2.roll();
            // tjekker eyes
            int eyes1 = d1.getEyes();
            int eyes2 = d2.getEyes();
            // scorer rollet
            if (eyes1 > eyes2){
                wins1++;
            }
            else if (eyes2 > eyes1){
                wins2++;
            }
            else {
                sameScore++;
            }
        }
        // printer slut scoren.
        System.out.println("DieCup 1 is highest: " + wins1 + " times");
        System.out.println("DieCup 2 is highest: " + wins2 + " times");
        System.out.println("Same score in both: " + sameScore + " times");
    }
}
