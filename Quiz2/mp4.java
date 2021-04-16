import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class mp4 {

    public float frameRate = 0;

    public mp4 (String titleInput, double lengthInput, float frameRateInput){
        super(titleInput, lengthInput);
        frameRate = frameRateInput;
    }
    public boolean isEqual(Object o){
        if (o instanceof Media && ((Media) o).getTitle()==this.getTitle() && ((Media) o).getLength() == this.getLength() && ((Media) o).getFrameRate() == this.getFrameRate())
            return true;
        else 
            return false;
    }

    public static void main(String[] args) throws Exception{
        ArrayList<Media> store = new ArrayList<>();
        Scanner scanner = new Scanner();

        try{//see if file is valid
        scanner = new Scanner(new File(value);
        })
        catch(FileNotFoundException issue){
            System.err.println("Fail to open file" + value);
            throw issue;
        }

        while (scanner.hasNextLine()){
            int i = scanner.nextLine();
            //match file with formate
            if (readLine.matches("[A-z]+[1-9] +\t\f\t\f")){
                scanner = new mp4(); //not correct but urnning out of time
                store.add(scanner.nextLine());
            }
            
        }

        System.out.print(store);
        Scanner.close;
    }

}
