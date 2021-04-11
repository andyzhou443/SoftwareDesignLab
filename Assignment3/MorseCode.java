/**
* Third Program of Software Design Labs
* Morse Code Assignment
*@author    Andy Zhou
*@version 1.0   3/26/2021
*/

/**
 * Class contains methods for setters and getters.
 * Class also contains non-default contructor that sets user input for character and encoding to that of the constructor
 */
public class MorseCode{
    char character;
    String encoding;

     /** 
     * public MorseCode(char characterInput, String encodingInput) is the class contructor with parameters from user input
     * @param characterInput sets user input character to the one stored in MorseCode constructior
     * @param encodingInput sets user input encoding to the one stored in MorseCode constructior
     * @throws Exception will throw an Exception if a character input is not supported by morse code
     * public MorseCode only accept character values of ASCII codes between 32 and 90 and an encoding value that cannot be NULL and of leangth at least one. If criteria is not met, an Exception is thrown.
     */
    public MorseCode(char characterInput, String encodingInput)throws Exception{
        if(characterInput < 32 || characterInput > 90 || encodingInput == null || encodingInput.length() < 1){ // checks if ASCII codes between 32 and 90 and an encoding value that cannot be NULL and of length at least one.
            throw new Exception ("The character " + characterInput + " is not supported Morse character");
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
    public void setEncoding(String value){ //setter for encoding
        this.encoding = value;
    }

    //sets up character and encoding
}
//NOTE TO SELF output of the jar file should be what your code look like
