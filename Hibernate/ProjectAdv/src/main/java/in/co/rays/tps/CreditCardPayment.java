package in.co.rays.tps;

public class CreditCardPayment extends Payment {
	

	private String cctype;

	public CreditCardPayment() 	{}

	public String getCctype() {
		return cctype;
	}

	public void setCctype(String cctype) {
		this.cctype = cctype;
	}
	

}
