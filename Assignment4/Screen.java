import java.util.Date;

public abstract class Screen {
   public long id;
   public double price;
   public Date makeDate;
   public String manufacturer;
   public String model;

   public String toString(){
   String s = new String();
   s = "Screen (1)";
   return s;
   }

   public Screen (long idInput, double priceInput, Date makeDateInput,String manufacturerInput, String modelInput){
      id = idInput;
      price = priceInput;
      makeDate = makeDateInput;
      manufacturer = manufacturerInput;
      model = modelInput;
   }

   public boolean equals(Object o){// march 24th video about downcasting
      if (o instanceof Screen && ((Screen) o).getPrice()==this.getPrice() && ((Screen) o).getId() == this.getId())
          return true;
      else 
          return false;
  }

   public long getId(){ //getter for Id
      return id; 
   }

   public void setId(long inputId){ //setter for Id
      this.id = inputId; 
   }

   public double getPrice(){ //getter for Price
      return price; 
   }

   public void setPrice(double inputPrice){ //setter for Price
      this.price = inputPrice; 
   }

   public Date getMakeDate(){ //getter for Date
      return makeDate; 
   }

   public void setMakeDate(Date inputMakeDate){ //setter for Date
      this.makeDate = inputMakeDate; 
   }

   public String getManufacturer(){ //getter for Manufacturer
      return manufacturer; 
   }

   public void setManufacturer(String inputManufacturer){ //setter for Manufacturer
      this.manufacturer = inputManufacturer; 
   }

   public String getModel(){ //getter for Models
      return model; 
   }

   public void setModel(String inputModel){ //setter for Model
      this.model = inputModel; 
   }

}

/*
* line 2, the alienware one should not fail, check if your equals() is implemented correctly for SmartTV
* line 4/5, the LG monitors, check how your equals() for CRT returns true or false (i suspect some if statement is broken)

also keep in mind your equals method must take an Object as a parameter so it gets picked up by ArrayList<>.contains(). so like this
... equals(Object o)
   { ...} 

   toString is inherited from class object. Returns string representation of that specific object at that moment
*/

