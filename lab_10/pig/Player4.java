package pig;

public class Player4 extends Player {
	
	@Override
	public boolean throwAgain (Player opponent) {
		if (super.rollCount() == 5) {
			return false;
		}
		else {
			return true;
		}
	}

}
