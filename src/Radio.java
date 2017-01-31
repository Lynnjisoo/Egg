
public class Radio implements Switch{
	boolean On;
	
	public void On() {
		
		if(this.On == true) {
		System.out.println("You turned the radio on.");
		}
		else{
			System.out.println("The Radio is off. ");
		}
	}


}
