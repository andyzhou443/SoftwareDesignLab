/**
 * First Program of Software Design Labs
 * BMI classifier
*@author    Andy Zhou
*@version 1.0   2/28/2021
*/

import java.util.Scanner; //Scanner for user input
/**
 * Class that contains main program and classifyBMI method
 */
public class TestPersonInfo{
    /**
     * Method that uses BMI input to determine weight classification
     * @param BMI BMI value of user
     * @return the string based on BMI classification
     */
    public static String classifyBMI(double BMI){
        if (BMI <= 18.5){
            return( "Underweight");
        }
        else if (18.5 < BMI && BMI < 25){
            return( "Normal Weight");
        }
        else if (25 < BMI && BMI <= 30){
            return( "Overweight");
        }
        else{
            return( "Obese");
        }
    }
    
    /**
     * This is the main method for funning TestPersonInfo.
     * It allows users to input two peoples information (name, year of birth, height, weight) and outputs the name, age, height, weight, and BMI classification
     * @param args an array holding the command-lin arguments
     */
    public static void main(String[] args){

        PersonInfo personOne = new PersonInfo(); // Creates personOne object that uses the default contructor
        /*
        first instance
        initialized with default
        ask for info
        Use setter to set info object
        */
        //obtain user input for personOne which is used to store the information and calculate BMI and age
        System.out.printf( "%s", "First Instance Prompts\n" );
        System.out.printf( "%s", "Enter person's name: ");
        Scanner Scanner = new Scanner(System.in);
        String str = Scanner.nextLine();
        personOne.setName(str); //setter for name
        System.out.printf( "%s", "Enter person's year of birth: ");
        int strOne = Scanner.nextInt();
        personOne.setYearOfBirth(strOne); //setter for Year of Birth
        int age = personOne.calculateAge(personOne.getYearOfBirth()); //calculate and stores age using Year of Birth
        System.out.printf( "%s", "Enter person's height in meters: ");
        double strTwo = Scanner.nextDouble();
        personOne.setHeight(strTwo);
        System.out.printf( "%s", "Enter person's weight in kilograms: ");
        double strThree = Scanner.nextDouble();
        personOne.setWeight(strThree); //setter for weight
        double personOneBMI = personOne.TestBMI(strThree, strTwo); //calculates and store personOne's BMI

        /*
        second instance
        prepare object
        ask for info
        initialize object with non default constructor
        parameters are from input
        DO NOT USE SETTERS
        */
        //obtain user input for personTwo which is used to store the information and calculate BMI and age
        Scanner s2 = new Scanner(System.in); //second scanner (had issues with the first scanner so I called another one to fix the issue)
        System.out.printf( "%s", "\nSecond Instance Prompts\n");
        System.out.printf( "%s", "Enter person's name: ");
        String strFour = s2.nextLine();
        System.out.printf( "%s", "Enter person's year of birth: ");
        int strFive = s2.nextInt();
        System.out.printf( "%s", "Enter person's height in meters: ");
        double strSix = s2.nextDouble();
        System.out.printf( "%s", "Enter person's weight in kilograms: ");
        double strSeven = s2.nextDouble();
        PersonInfo personTwo = new PersonInfo(strFour, strFive, strSix, strSeven); //creates personTwo object using input values and Constructor
        double personTwoBMI = personOne.TestBMI(strSeven, strSix);//calculate user BMI based on the inputted values for height and weight

        //Output One
        //prints all related information and classification of personOne
        System.out.printf( "%s", "\n1st instance Output\n");
        System.out.printf( "%15s %s\n", "Full Name:", personOne.getName());
        System.out.printf( "%15s %d\n", "Age:", age);
        System.out.printf( "%15s %.2f\n", "Height:", personOne.getHeight());
        System.out.printf( "%15s %.2f\n", "Weight:", personOne.getWeight());
        System.out.printf( "%15s %s\n", "Classification:", classifyBMI(personOneBMI));
        
        //Output Two
        //prints all related information and classification of personTwo
        System.out.printf( "%s", "\n2nd instance Output\n");
        System.out.printf( "%15s %s\n", "Full Name:",  personTwo.getName());
        System.out.printf( "%15s %d\n", "Age:", personTwo.calculateAge(strFive));
        System.out.printf( "%15s %.2f\n", "Height:", personTwo.getHeight());
        System.out.printf( "%15s %.2f\n", "Weight:", personTwo.getWeight());
        System.out.printf( "%15s %s\n", "Classification:", classifyBMI(personTwoBMI));

        Scanner.close();// closes Scanner scanner
        s2.close(); //closes s2 scanner
    }
}

