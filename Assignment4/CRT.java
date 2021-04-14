import java.util.Date;

public class CRT extends ComputerMonitor {

    double glassThickness;

    public CRT (double glassInput, long idInput, double priceInput, Date makeDateInput,String manufacturerInput, String modelInput){
        super(idInput, priceInput, makeDateInput, manufacturerInput, modelInput);
        glassThickness = glassInput;
    }

    public double getGlassThickness(){ //getter for Glass Thickness
        return glassThickness;
     }
  
     public void setGlassThickness(double inputGlassThickness){ //setter for Glass Thickness
        this.glassThickness = inputGlassThickness; 
     }

    public String toString(){
        String s = new String();
        s = "CRT (3)";
        return s;
    }

    public boolean equals(Object o){// march 24th video about downcasting
        if (o instanceof CRT && ((CRT) o).getModel().equals(this.getModel()) && ((CRT) o).getId() == this.getId())
            return true;
        else 
            return false;
    }
}