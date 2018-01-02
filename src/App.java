//.toString() method and inheritance

class Frog{ //commenting out toString method with cause sysout to return the class name followed by a hashcode 
	
	private String name;
	private int id;
	
	public Frog(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		
		return id + ": " + name;
	}
	
}

//hashcodes are unique identifiers for objects

public class App {

	public static void main(String[] args){
		
		Frog frog1 = new Frog(7, "Ryne");
		System.out.println(frog1);//invokes toString method to display returned string value
		
		Frog frog2 = new Frog(1, "Fred");
		System.out.println(frog2);//invokes toString method to display returned string value
	}
	
}
