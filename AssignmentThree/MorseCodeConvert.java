/**
* Third Program of Software Design Labs
* Morse Code Assignment
*@author    Andy Zhou
*@version 1.0   3/26/2021
*/

import java.util.ArrayList;
import java.util.Scanner; //Scanner for user input
import java.io.File; //Gives File Class
import java.io.FileNotFoundException;

/**
 * Class that stores information given user input from TestPersonInfo
 * private ArrayList <MorseCode> listCodes store all the characters and morse code
 */
public class MorseCodeConvert {
    //Contructor responsible for loading morsecode.text
    //2) reads the file
    //3) setup the lookup table (listcode)
        //morsecode objects to refer to each character
    private ArrayList <MorseCode> listCodes = new ArrayList <MorseCode>();
    
    

    public MorseCodeConvert(String value){
        Scanner scanner;
        try{
            scanner = new Scanner(new File(value));
        }
        catch(FileNotFoundException issue){
            throw Exception ("Failed to open file: " + value);
        }
    
        while(scanner.hasNextline()){
            String readLine = scanner.nextLine();// reads line
    
            String[] tabs = sentence.split("\t"); // tabs will contain two parts, one with characters, one with morse code
    
            if (readline.matches(".+\\t+\\W")){
                listCodes.add(new MorseCode(tabs[0].charAt(0),tabs[1]));
            }
            else{
                System.err.println("Invalid line: " + readLine);
            }
        }
        scanner.close();
    }

    /**
     * This is the method for printing entire content of the ArrayList
     */
    public void printEncodingList(){
        for(int h = 0; h < listCodes.size(); h++){
            System.out.println(listCodes.get(h).getCharacter() +"\t" + listCodes.get(h).getEncoding());
        }
    }

    /**
     * This is the method for turning a String into morse code
     * @param value a String that the user wants to convert to morse code
     */
    public void encodeString(String value){
        String morseEquivalent;

        for(int i = 0; i < value.length(); i++){
            Char currentChar = value.charAt(i);
            int j = 0;
            boolean found = false;
            while (j < listCodes.size()){
                if(currentChar != listCodes.get(j).getCharacter()) found = true;
                j++;
            }
            if(found){
                morseEquivalent = morseEquivalent + listCodes.get(j).getEncoding();
            }
        }
        System.out.println(morseEquivalent);
    }

    /**
     * This is the method for turning a String into morse code
     * @param value a String that the user wants to convert to morse code
     */
    public void encodeFile(String value){
        Scanner scanner;
        try{ //attempts to open the file, if it failes, an exception is thrown.
            scanner = new Scanner(new File(value));
        }
        catch(FileNotFoundException issue){
            throw Exception ("Failed to open file: " + value);
        }

        while(scanner.hasNextline()){
            for(int i = 0; i < value.length(); i++){
                Char currentChar = value.charAt(i);
                int j = 0;
                boolean found = false;
                while (j < listCodes.size()){
                    if(currentChar != listCodes.get(j).getCharacter()) found = true;
                    j++;
                }
                if(found){
                    morseEquivalent = morseEquivalent + listCodes.get(j).getEncoding();
                }
                else
                {
                    morseEquivalent = morseEquivalent + "?";
                }
            }
            System.out.println(morseEquivalent);
        }
        scanner.close();
    }
}
