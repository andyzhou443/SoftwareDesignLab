import java.util.Date;

public abstract class ComputerMonitor extends Screen {

    public ComputerMonitor (long idInput, double priceInput, Date makeDateInput,String manufacturerInput, String modelInput){
        super(idInput, priceInput, makeDateInput, manufacturerInput, modelInput);
    }

    public String toString(){
        String s = new String();
        s = "ComputerMonitor (2)";
        return s;
    }

    public boolean equals(Object o){// march 24th video about downcasting
        if (o instanceof ComputerMonitor && ((ComputerMonitor) o).getPrice()==this.getPrice() && ((ComputerMonitor) o).getId() == this.getId())
            return true;
        else 
            return false;
    }

}
