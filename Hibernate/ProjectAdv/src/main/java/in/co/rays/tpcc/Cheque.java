package in.co.rays.tpcc;

public class Cheque extends Payment {
	
	private int chequeNo;

	public Cheque() {}
	public int getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}

}
