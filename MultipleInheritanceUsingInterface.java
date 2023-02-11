// CNG Car interface
interface CNG_Car{
	// Abstract methods
	void drive();
	void cng_kit();
  }
  
  // Petrol Car interface
  interface Petrol_Car{
	// Abstract methods
	void drive();
	void petrol_kit();
  }
  
  // Multiple Inheritance using Interface
  class Hybrid_Car implements Petrol_Car, CNG_Car {
	public void drive(){
	  System.out.println("Driving a Hybrid Car");
	}
  
	// Overridden method of CNG_Car Interface
	public void cng_kit(){
	  System.out.println("Using the CNG kit for Hybrid Car");
	}
  
	// Overridden method of Petrol_Car Interface
	public void petrol_kit(){
	  System.out.println("Using the Petrol kit for Hybrid Car");
	}
  }
  
  // Driver Code
  class MultipleInheritanceUsingInterface{
	public static void main(String args[]) {
	  // Creating a new object of the Hybrid Car class
	  Hybrid_Car obj = new Hybrid_Car();
  
	  // Calling the methods of the Hybrid_Car class
	  obj.drive();
	  obj.cng_kit();
	  obj.petrol_kit();
	}
  }
  