
public class Lights implements Switch {
	boolean on;
	
	@Override
	public void On() {
		if(this.on == true) {
		System.out.println("You turned the light on.");
		}
		else{
		System.out.println("You turned the light off." );
		}

	}
}
