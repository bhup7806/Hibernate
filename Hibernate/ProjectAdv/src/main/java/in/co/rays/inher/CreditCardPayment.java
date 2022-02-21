package in.co.rays.inher;

public class CreditCardPayment extends Payment {
	
private String ccType;
	
	public CreditCardPayment() {}

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

}
