/**
* Third Program of Software Design Labs
* Morse Code Assignment
*@author    Andy Zhou
*@version 1.0   3/26/2021
*/

import java.util.ArrayList;//ArrayList for storing characters and morse code
import java.util.Scanner; //Scanner for user input
import java.io.File; //Gives File Class
import java.io.FileNotFoundException;//Gives FileNotFoundException

/**
 * Class that stores information given user input from TestPersonInfo
 * private ArrayList <MorseCode> listCodes store all the characters and morse code
 */
public class MorseCodeConvert {
    //Contructor responsible for loading morsecode.text
    //2) reads the file
    //3) setup the lookup table (listcode)
        //morsecode objects to refer to each character
    private ArrayList <MorseCode> listCodes = new ArrayList <MorseCode>();// creates ArrayList that stores the characters and its morse code conversions
    
    /**
     * This is the non-default constructor.
     * It reads all the lines from the file and add each valid line to ArrayList. Will throw expception message for skipped lines
     * @param value this is the file to be read
     * @throws FileNotFoundException an Exception that will be thrown if file used for this method is not found.
     * @throws Exception an Exception that will be thrown if 
     */
    public MorseCodeConvert(String value) throws FileNotFoundException, Exception{
        Scanner scanner;
        try{//if file is not found, throw exception stating the file is not found
            scanner = new Scanner(new File(value));
        }
        catch(FileNotFoundException issue){
            System.err.println("Failed to open file: " + value);
            throw issue;
        }
    
        while(scanner.hasNextLine()){//checks if there is another line in scammer
            String readLine = scanner.nextLine();// reads line
    
            String[] tabs = readLine.split("\t"); // tabs will contain two parts, one with characters, one with morse code
    
            if (readLine.matches(".+\t+\\W+")){ //regex to check the format of the given morse code converstion
                try
                {
                    listCodes.add(new MorseCode(tabs[0].charAt(0),tabs[1]));//adds to default constructor
                }
                catch (Exception e)
                {
                    System.err.println(e);
                }
            }
            else{
                System.err.println("Invalid line: " + readLine);//if there is an invalid line, it will state it
            }
        }
        scanner.close();
    }

    /**
     * This is the method for printing entire content of the ArrayList
     */
    public void printEncodingList(){
        for(int h = 0; h < listCodes.size(); h++){
            System.out.println("('" + listCodes.get(h).getCharacter() +"', " + listCodes.get(h).getEncoding()+")");
        }
    }

    /**
     * This is the method for turning a String into morse code
     * @param value a String that the user wants to convert to morse code
     */
    public void encodeString(String value){
        String morseEquivalent = "";
        String space = " ";

        if(value == null || value == "") //if there is no string, print nothing and skip line
        {
            System.out.println();
            return;
        }
        for(int i = 0; i < value.length(); i++){
            char currentChar = Character.toUpperCase(value.charAt(i));//turns lowercase to uppercase
            int j = 0;
            boolean found = false;
            while (j < listCodes.size()){// checks character with the ones in listcode
                if(currentChar == listCodes.get(j).getCharacter())  //if the character is found, turn found to true break the loop
                {
                    found = true;
                    break;
                }
                j++;//moves on to next character
            }
            if(found){//if character is found, add the morse code equivalent to the morse code converstion and a space
                morseEquivalent = morseEquivalent + listCodes.get(j).getEncoding() + space;
            }
            else if(currentChar == ' '){// this was the original idea of adding a space but it doesnt seem to work. If current character is a space, add a space to morse code
            morseEquivalent = morseEquivalent + ' ';
            }
        }
        System.out.println(morseEquivalent);
    }

    /**
     * This is the method for turning a text file into morse code
     * @param value a String that the user wants to convert to morse code
     * @throws FileNotFoundException an exception that is thrown if file cannot be opened
     */
    public void encodeFile(String value) throws FileNotFoundException{
        String space = " ";
        String morseEquivalent = "";//starts morseEquivalent with nothing in String
        Scanner scanner;
        try{ //attempts to open the file, if it failes, an exception is thrown.
            scanner = new Scanner(new File(value));
        }
        catch(FileNotFoundException issue){
            System.err.println("Failed to open file: " + value);
            throw issue;
        }

        String readline;
        while(scanner.hasNextLine()){//if scanner has a next line, continue the loop
            readline = scanner.nextLine();
            for(int i = 0; i < readline.length(); i++){//loop to convert string character to morse code
                char currentChar = Character.toUpperCase(readline.charAt(i));//makes characters capitalized
                int j = 0;
                boolean found = false;
                while (j < listCodes.size()){// checks character with the ones in listcode
                    if(currentChar == listCodes.get(j).getCharacter()) //if the character is found, break the loop
                    {
                        found = true;
                        break;
                    }
                    j++;//moves on to next character
                }
                if(found){
                    morseEquivalent = morseEquivalent + listCodes.get(j).getEncoding()+ space;
                    // morseEquivalent = morseEquivalent + listCodes.get(j).getCharacter();
                }
                else if(currentChar == ' '){ //if there is space, add a space in morsecode
                    morseEquivalent = morseEquivalent + ' ';
                }
                else//if there is an unidentified value, add a ?
                {
                    morseEquivalent = morseEquivalent + "?";
                }
                
            }
            System.out.println(morseEquivalent);//print morse code equivalent
        }
        scanner.close();
    }
}
