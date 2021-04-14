import java.util.Date;

public class SmartTV extends Screen {

    String operatingSystem;

    public SmartTV (String operatingSystemInput, long idInput, double priceInput, Date makeDateInput,String manufacturerInput, String modelInput){
        super(idInput, priceInput, makeDateInput, manufacturerInput, modelInput);
        operatingSystem = operatingSystemInput;
    }

    public String getOperatingSystem(){ //getter for OS
        return operatingSystem;
     }
  
     public void setOperatingSystem(String inputOperatingSystem){ //setter for OS
        this.operatingSystem = inputOperatingSystem; 
     }

    public String toString(){
        String s = new String();
        s = "SmartTV (2)";
        return s;
    }

    public boolean equals(Object o){// march 24th video about downcasting
        if (o instanceof SmartTV && ((SmartTV) o).getPrice()==this.getPrice() && ((SmartTV) o).getId() == this.getId())
            return true;
        else 
            return false;
    }

}