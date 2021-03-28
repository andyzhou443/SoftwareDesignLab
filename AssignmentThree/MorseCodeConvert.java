/**
* Third Program of Software Design Labs
* Morse Code Assignment
*@author    Andy Zhou
*@version 1.0   3/26/2021
*/

import java.util.Scanner; //Scanner for user input
import java.io.File; //Gives File Class
import java.io.FileNotFoundException;

/**
 * Class that stores information given user input from TestPersonInfo
 * private ArrayList <MorseCode> listCodes store 
 */
public class MorseCodeConvert {
    //Contructor responsible for loading morsecode.text
    //2) reads the file
    //3) setup the lookup table (listcode)
        //morsecode objects to refer to each character
    private ArrayList <MorseCode> listCodes = new ArrayList <MorseCode>();
    
    Scanner scanner;
    public MorseCodeConvert(String value){
        try{
            scanner = new Scanner(new File(value));
        }
        catch(FileNotFoundException issue){
            throw Exception ("Failed to open file: " + value);
        }
    
    String readLine = scanner.nextLine();// reads line
    
    String[] tabs = sentence.split("\t"); // tabs will contain two parts, one with characters, one with morse code
    listcodes.add(new MorseCode(tabs[0].charAt(0),tabs[1]));//creates morsecode vector-like with first parameter being first character and second part being the code itself
    
    boolean matcher = readline.matches("[a-z]+\t+\W")// detects character a-z and tab and non-word character

    }

    /**
     * This is the method for printing entire content of the ArrayList
     */
    public void printEncodingList(){

    }

    /**
     * This is the method for turning a String into morse code
     * @param value a String that the user wants to convert to morse code
     */
    public void encodeString(String value){

        while(int i = 0; int i < tabs.length; i++){
            println("'listcodes.");
        }
    }

    /**
     * This is the method for turning a String into morse code
     * @param value a String that the user wants to convert to morse code
     */
    public void encodeFile(String value){
        try{ //attempts to open the file, if it failes, an exception is thrown.
            scanner = new Scanner(new File(value));
        }
        catch(FileNotFoundException issue){
            throw Exception ("Failed to open file: " + value);
        }

        while(){

        }
    }
    scanner.close();
}
