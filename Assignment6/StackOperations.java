import java.util.Queue;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Collections;

public class StackOperations {

    /*
     * Converts from a stack to a Queue. The queue will be represented as a LinkedList
     */
    public static Queue<Character> toQueue(Stack<Character> stackOriginal) {
        /*use a stream to represent a Queue
        
        */
        int QueueVar = IntStream. 
        return null;
    }

    /*
     * Returns a stack with items reversed from the original stack
     */
    public static Stack<Character> reverseStack(Stack<Character> stackOriginal) {

        return (Stack<Character>) Stack.reverse(stackOriginal);
    }

    /*
     * Returns the sum of integers between the start and end positions
     */
    public static int sumBetween(Stack<Integer> stack, int startPosition, int endPosition) {
        //make sure they are within value range
        if (stack. startPosition && stack. >= endPosition){
            int sum = IntStream.rangeClosed(startPosition, endPosition)
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
    public static Stack<Character> readNumericFromFile(final String filePath) throws Exception{
        "abc0123!@$s".chars()//prints ther characters of string line to standardoutput
                     .filter(Character::isDigit)
                     .mapToObj(Character::toChars)
                     .forEach(System.out::println)
        int value = InStream. //not done
                            if (Character::isDigit){
                                push(Character)//push character to stack?
                            }
        return null;
    }
    public void push (E pushValue){
        elements.add(pushValue);
    }
}