import java.util.Queue;
import java.util.Stack;
import java.util.stream.*;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Collections;
import java.nio.file.*;
import java.io.*;

public class StackOperations {

    /*
     * Converts from a stack to a Queue. The queue will be represented as a LinkedList
     */
    public static Queue<Character> toQueue(Stack<Character> stackOriginal) {
        /*use a stream to represent a Queue
        
        */
        LinkedList<Character> list = new LinkedList<>();
        stackOriginal.stream()
                     .forEach(
                        (x) -> {list.add(x);
                     }
                     );
        return list;
    }

    /*
     * Returns a stack with items reversed from the original stack
     */
    public static Stack<Character> reverseStack(Stack<Character> stackOriginal) {

        Stack <Character> reverse = new Stack<>();
        stackOriginal.stream()
                     .forEach(
                         (x) -> {reverse.push(x);
                     }
                     );
        Collections.reverse(reverse);
        return reverse;
    }

    /*
     * Returns the sum of integers between the start and end positions
     */
    public static int sumBetween(Stack<Integer> stack, int startPosition, int endPosition) {
        //make sure they are within value range
        if (startPosition >= 0 && stack.size() >= startPosition && stack.size() >= endPosition && endPosition >= 0 && startPosition <= endPosition){
            int sum = IntStream.rangeClosed(stack.elementAt(startPosition), stack.elementAt(endPosition))
                               .sum();
            return sum;
        }
        else{
            return -1;
        }
    }

    /*
     * Reads from an input file and returns the characters that are integers from the file.
     * The function will read the lines from the file, extract the characters, filter non-numeric characters (i.e. not 0,1,...9),
     * and place these character numbers on a stack
     */
    public static Stack<Character> readNumericFromFile(final String filePath){
        Path pathFiles = Paths.get(filePath);
        Stream<String> streamstring = null;
        Stack<Character> returnstack = new Stack<>();
        try {
            streamstring = Files.lines(pathFiles);
        } catch (IOException exception) {
            exception.printStackTrace(System.out);
            return null;
        }
        
        streamstring.forEach(
                    (String s) ->
                    {
                       s.chars()//prints ther characters of string line to standardoutput
                        .filter(Character::isDigit)
                        .forEach((x) -> returnstack.push((char) x));
                    }
                        );

        streamstring.close();
        // int value = InStream. //not done
        //                     if (Character::isDigit){
        //                         push(Character)//push character to stack?
        //                     }
        return returnstack;
    }
}