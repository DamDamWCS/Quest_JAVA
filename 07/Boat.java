public class Boat extends Vehicle {  
      
    
	public Boat(String brand, int kilometers) {  
	    super(brand, kilometers);   
	}
  
    @Override
    public String doStuff() {
        return "Je suis " + this.brand + " et je fait gloupgloup !";
    }
  
}