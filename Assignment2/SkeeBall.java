/**
 * Second Program of Software Design Labs
 * SkeeBall Project
 * @author Andy Zhou
 * @version 1.0   3/14/2021
 */

import java.util.Scanner; //Scanner for user input
import java.util.Random; //Random number generator

/**
 * Class that contains main program, simulatePlay method and displayStats method
 */
public class SkeeBall{
    int[] arrInt = new int [] {0,0,0,0,0,0,0,0}; //stores score for 8 plays maximum
    static final int MAX_PLAYS = 8; //maximum number of plays

    public int[] simulatePlay(int inputPlay){ //input max value of plays
    /* NOTES for myself
    uses hava random number enerator and assigns percentages 
    "Method repeats the play simulation several times equal to the value entered in main"
    "After each play iteration, print a message which shows the play number and the points assigned (Figure 3)"
    */

        for (int i = 0; i < inputPlay; i++){ // generates random value based on how many rounds the player wants to play

            Random rand = new Random();
            int random = rand.nextInt(19)+1; //generate random number between 1 to 20 for scoring

            switch(random){
                case 1: //every case value represents 5%
                    arrInt[i] = 80;
                    break;
                case 2:
                case 3: 
                    arrInt[i] = 60;
                    break;
                case 4: 
                case 5: 
                case 6: 
                    arrInt[i] = 40;
                    break; 
                case 7: 
                case 8: 
                case 9: 
                    arrInt[i] = 20;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                    arrInt[i] = 10;
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19: 
                case 20:
                    arrInt[i] = 0;
                    break;
                }
                System.out.printf("%s%d%s%d%s", "Rolling ball #", i+1, ". Landed in ", arrInt[i],"\n"); //outputs round number and score from that round
       }
       return arrInt; //return array with newly score point
    }

     /**
     * Method that uses inputPlay integer to display states based on the number of plays the player requested
     * @param inputPlay user input value of how many times the player wants to play a round of SkeeBall
     */
    public void displayStats(int inputPlay){
        int totalScore = 0; //integer that stores total points obtained
        for (int h = 0; h < inputPlay; h++){ //loop to calculate total pointed from array
            totalScore = arrInt[h] + totalScore; //calculates total score by adding the value from the index of the array
        }
        System.out.println("");
        System.out.println("+-------+-------+");
        System.out.println("  Play #    Score");
        System.out.println("+-------+-------+");
        for (int k = 0; k < inputPlay; k++){
            System.out.printf("%s%d%7d%s","     ", k+1, arrInt[k],"\n"); // prints Play # and Score
        }
        System.out.printf("\n%s%d","Total: ",totalScore); //prints total score
    }

    /**
     * This is the main method for running SkeeBall.
     * It allows users to play the SkeeBall game after the user inputs how many rounds they want to play
     * @param args an array holding the command-lin arguments
     */
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        int inputPlay; //variable to store user input
        SkeeBall skee = new SkeeBall(); //access non static member functions
        do { //Do while loop that checks if player input the correct value between 1 to 8.
            System.out.print("Enter the number of plays (1-8)? ");
            inputPlay = Scanner.nextInt();
            if (inputPlay > MAX_PLAYS || inputPlay < 1){
                System.out.println("Invalid input. Please enter a number between 1 and 8.");
            }
        } while (inputPlay < 1 || inputPlay > MAX_PLAYS); //make sure the value is NOT above 8 or below 0
        
        skee.simulatePlay(inputPlay);
        skee.displayStats(inputPlay);
        Scanner.close();// closes Scanner scanner
    }
}


