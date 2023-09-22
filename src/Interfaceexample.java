interface Waterbottleinterface{
	String color= "blue";
	
	void fillup();
	
}



public class Interfaceexample implements Waterbottleinterface {

	public static void main(String[] args) {
	

		System.out.println(color);
		
		Interfaceexample g = new Interfaceexample();
		g.fillup();
	}

	@Override
	public void fillup() {
		System.out.println("it is filled");
		
	}

}
