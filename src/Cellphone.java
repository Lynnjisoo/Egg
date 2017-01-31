
public class Cellphone implements Switch {
	boolean On;
	
	@Override
	public void On() {

		if(this.On == true){
		System.out.println("You turned the cellphone on.");
		}
		else{
			System.out.println("The cellphone is off.");
		}
	}


}
