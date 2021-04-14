import java.util.Date;

public class LED extends ComputerMonitor {

    public LED (long idInput, double priceInput, Date makeDateInput,String manufacturerInput, String modelInput){
        super(idInput, priceInput, makeDateInput, manufacturerInput, modelInput);
    }

    public String toString(){
        String s = new String();
        s = "LED (3)";
        return s;
    }

    public boolean equals(Object o){// march 24th video about downcasting
        if (o instanceof LED && ((LED) o).getPrice()==this.getPrice() && ((LED) o).getId() == this.getId())
            return true;
        else 
            return false;
    }
}