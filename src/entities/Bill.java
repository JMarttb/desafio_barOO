package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
    private static final double BEER_PRICE = 5.0;
    private static final double BARBECUE_PRICE = 7.0;
    private static final double SOFT_DRINK_PRICE = 3.0;
    private static final double COVER_CHARGE = 4.0;
	
	
	public double cover() {
		if (feeding() > 30) {
			return 0.0;
		}
		else {
			return COVER_CHARGE;
		}
	}
	
	public String coverMessage() {
        if (cover() == 0.0) {
            return "Isento de couvert";
        } else {
            return String.format("Couvert = R$ %.2f", COVER_CHARGE);
        }
    }
	
	public double feeding(){
		return (this.beer * BEER_PRICE)+(this.barbecue * BARBECUE_PRICE)+(this.softDrink * SOFT_DRINK_PRICE);
	}
	
	public double ticket() {
		this.gender = Character.toUpperCase(gender);
		if (gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}
	
	public double total() {
		return cover() + feeding() + ticket();

	}
	
	public String toString() {
		return "RELATÓRIO: \n"
				+ "Consumo = R$ "
				+ String.format("%.2f\n", feeding())
				+ coverMessage() + "\n"
				+ "Ingresso = R$ "
				+ String.format("%.2f\n", ticket())
				+ "\n"
				+ "Valor a pagar = R$ "
				+ String.format("%.2f\n", total());
	}

}
