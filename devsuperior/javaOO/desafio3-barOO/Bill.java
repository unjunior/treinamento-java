package desafio;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover() {
		if (feeding() <= 30.0) {
			return 4.00;
		} else {
			return 0.0;
		}

	}

	public double ticket() {

		if (gender == 'M') {
			return 10.00;
		} else {
			return 8.00;
		}
	}

	public double feeding() {
		return (beer * 5.00) + (softDrink * 3.00) + (barbecue * 7.00);

	}

	public double total() {
		return ticket() + cover() + feeding();
	}
	

}
