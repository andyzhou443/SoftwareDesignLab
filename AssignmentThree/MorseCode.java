/**
* Third Program of Software Design Labs
* Morse Code Assignment
*@author    Andy Zhou
*@version 1.0   3/26/2021
*/

public class MorseCode{
    char character;
    String encoding;

     /** 
     * public MorseCode(char characterInput, String encodingInput) is the class contructor with parameters from user input
     * @param characterInput sets name to nameInput 
     * @param encodingInput sets year_of_birth to year_of_Birth_Input
     * ADD THAT IT CHECK
     */
    public MorseCode(char characterInput, String encodingInput){
        if (characterInput < 32 || characterInput > 90 || encodingInput != NULL || encodingInput.length < 1){
            throw new Exception ("The character " + characterInput + "is not supported Morse character");
        }
        character = characterInput;
        encoding = encodingInput;
    }

    /** 
     *Getter method to return character of user input from constructor
     *@return character
     */
    public char getCharacter(){ //getter for character
        return character; 
    }

    /** 
     *Getter method to return encoding of user input from constructor
     *@return encoding
     */
    public String getEncoding(){ //getter for encoding
        return encoding; 
    }

    /** 
     *Setter method to put in character of user input
     *changes character object of construtor to that of the users input
     */
    public void setCharacter(char value){ //setter for character
        this.character = value;
    }

    /** 
     *Setter method to put in encoding of user input
     *changes encoding object of construtor to that of the users input
     */
    public void setEncoding(string value){ //setter for encoding
        this.encoding = value;
    }

    //sets up character and encoding
}
//output of the jar file should be what your code look like
