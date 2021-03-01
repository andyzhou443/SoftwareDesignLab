/**
 * First Program of Software Design Labs
 * BMI classifier
*@author    Andy Zhou
*@version 1.0   2/28/2021
*/

import java.util.GregorianCalendar; //used to determine current year

/**
 * Class that stores information given user input from TestPersonInfo
 * private String name contains the name of the user (after it has been assigned)
 * private int year_of_birth contains the name of the user (after it has been assigned)
 * private double height contains the height of the user in meters (after it has been assigned)
 * private double weight contains the weight of the user in kg (after it has been assigned)
 */
public class PersonInfo {
    private String name;
    private int year_of_birth;
    private double height;
    private double weight;

    //Javadoc for classes, methods, variables in class

    //default contructors
    //non default constructors
    //setters - set values
    //getters- return values

    /** 
     * public PersonInfo() is the default class contructor with parameters set to default value.
     */
    public PersonInfo(){
        name= "";
        year_of_birth = 0;
        height = 0;
        weight = 0;
    }

    /** 
     * public PersonInfo(String nameInput, int year_of_Birth_Input, double heightInput, double weightInput) is the class contructor with parameters from user input
     * @param nameInput sets name to nameInput 
     * @param year_of_Birth_Input sets year_of_birth to year_of_Birth_Input
     * @param heightInput sets height to heightInput
     * @param weightInput sets weight to weightInput
     */
    public PersonInfo(String nameInput, int year_of_Birth_Input, double heightInput, double weightInput){
        name= nameInput;
        year_of_birth = year_of_Birth_Input;
        height = heightInput;
        weight = weightInput;
    }

    /** 
     * Method with user input for year of birth.
     * Calculates the age using the current year subtracted by the year of birth
     * @param year_of_birth the year of birth value according to user input
     * @return calculated age value 
     */
    public int calculateAge(int year_of_birth){ //function to calculate the age WRONG
        int age = new GregorianCalendar().get(GregorianCalendar.YEAR) - year_of_birth; 
        return age; // return calculated age
    }

    /** 
     * Method to calculate BMI.
     * Calculates the age using the current year subtracted by the year of birth and BMI value based on height and weight according to user input
     * @param weight the weight value according to user input
     * @param height the height value according to user input
     * @return calculated BMI value based on user height and weight input
     */
    public double TestBMI(double weight, double height){ //function to calculate the BMI
        double BMI = weight/(Math.pow(height, 2)); //BMI equation = weight/(height^2)
        return BMI; // return calculated BMI
    }

    /** 
     *Getter method to return name of user input from constructor
     *@return name
     */
    public String getName(){ //getter for name
        return name; 
    }

    /** 
     *Setter method to return name of user input
     *changes name of construtor to that of the users input
     */
    public void setName(String inputName){ //setter for name
        this.name = inputName; 
    }

    /** 
     *Getter method to return year_of_birth of user input from constructor
     *@return year_of_birth
     */
    public int getYearOfBirth(){ //getter for year_for_birth
        return year_of_birth;
    }

    /** 
     *Setter method to put in year_of_birth of user input
     *changes year of birth of construtor to that of the users input
     */
    public void setYearOfBirth(int inputYearOfBirth){ //setter for year of bith
        this.year_of_birth = inputYearOfBirth; //changes value of year_of_birth to input value
    }
    
    /** 
     *Getter method to return height in meters of user input from constructor
     *@return height
     */
    public double getHeight(){ //getter for height
        return height;
    }

    /** 
     *Setter method to put in height in meters of user input
     *changes height in meters of construtor to that of the users input
     */
    public void setHeight(double inputHeight){ //setter for height
        this.height = inputHeight;
    }

    /** 
     *Getter method to return weight in kg of user input from constructor
     *@return weight
     */
    public double getWeight(){ //getter for weight
        return weight;
    }

    /** 
     *Setter method to put in weight in kg of user input
     *changes weight in kg of construtor to that of the users input
     */
    public void setWeight(double inputWeight){ //setter for weight
        this.weight = inputWeight;
    }
}
