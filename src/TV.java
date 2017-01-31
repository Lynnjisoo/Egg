
public class TV implements Switch{
	boolean On;
	
	@Override
	public void On() {
		
		if(this.On == true){
		System.out.println("You turned the TV on.");
		}
		else{
			System.out.println("The television is off.");
		}
	}


}
