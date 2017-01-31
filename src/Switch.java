import java.util.ArrayList;

public interface Switch {
	
	public void On();
	
	public static void main(String[] ARGS) {
		ArrayList<Switch> myList = new ArrayList<>();
		
		myList.add(new Cellphone());
		myList.add(new Lights());
		myList.add(new Radio());
		myList.add(new TV());
		
		for(int i = 0; i <= 3; i++) {
			myList.get(i).On();
		}
	}
	
	

}
