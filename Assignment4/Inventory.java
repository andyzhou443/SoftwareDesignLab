import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Inventory{
    public Inventory(){}

    ArrayList <Screen> listInventory = new ArrayList<>();

    public int inventoryCount(){
        return listInventory.size();
    }

    public boolean addToInventory (Screen o) throws Exception{
        if(listInventory.contains(o)){
            throw new Exception ("The inventory contains a similar Screen object");
        }
        else{
            listInventory.add(o);
            return true;
        }
    }

    ArrayList <ComputerMonitor> listComputerMonitor(){
        ArrayList <ComputerMonitor> compMon = new ArrayList<>();
        int i = 0;
        while(i < listInventory.size()){
            if(listInventory.get(i) instanceof ComputerMonitor){
            compMon.add(((ComputerMonitor) listInventory.get(i)));
            }
            i++;
        }

        return compMon;
    }

    ArrayList <SmartTV> listSmartTV(){
        ArrayList <SmartTV> smaTV = new ArrayList<>();
        int i = 0;
        while(i < listInventory.size()){
            if(listInventory.get(i) instanceof SmartTV){
            smaTV.add(((SmartTV) listInventory.get(i)));
            }
            i++;
        }

        return smaTV;
    }

    public void printInventory(){
        String glass = "";
        String os = "";
        String date = "";

        for(int i = 0; i < listInventory.size();i++){
            
            Screen value = listInventory.get(i);
            if (value instanceof CRT){
                glass = String.format("%-2.2f", ((CRT) value).getGlassThickness());
            }
            if (value instanceof SmartTV){
                os = ((SmartTV) value).getOperatingSystem();
            }
            
            String pattern = "yyyy-MM-dd"; //I got this from tutorials.jenkov.com
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat (pattern);
            date = simpleDateFormat.format(listInventory.get(i).getMakeDate());

        }

        System.out.println("+-------------+-------------+-------------+------------+--------------+----------+-------+------------+");
        System.out.println("|    Type     |     ID      |    Price    |  Make Date | Manufacturer |  Model   | Glass |     OS     |");
        System.out.println("+-------------+-------------+-------------+------------+--------------+----------+-------+------------+");
        for(int i = 0; i < listInventory.size(); i ++){
            System.out.printf("%s%12s%s","| ", listInventory.get(i).toString(), "|");
            System.out.printf("%13s%s", listInventory.get(i).getId(), "|");
            System.out.printf("%13s%s", listInventory.get(i).getPrice(), "|");
            System.out.printf("%12s%s", date, "|");
            System.out.printf("%14s%s",listInventory.get(i).getManufacturer(), "|");
            System.out.printf("%10s%s",listInventory.get(i).getModel(), "|");
            System.out.printf("%7s%s", glass, "|");
            System.out.printf("%12s%s",os, "|\n");
            System.out.println("+-------------+-------------+-------------+------------+--------------+----------+-------+------------+\n");
        }

    }

}
