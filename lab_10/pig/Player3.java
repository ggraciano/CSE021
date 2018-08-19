package pig;

public class Player3 extends Player {
	
	@Override
	public boolean throwAgain (Player opponent) {
		if (super.rollCount() == 2) {
			return false;
		}
		else {
			return true;
		}
	}

}
