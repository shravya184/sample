package proj.application;
import proj.framework.PrimeAcc;
public class GSPrimeAcc extends PrimeAcc{
	
	//public static final float charges=0;

	public GSPrimeAcc(int accNo, String accNm, float Charges, boolean isPrime) {
		super(accNo, accNm, Charges, isPrime);
	
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear prime account user, your product charges are "+charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges
				+ "]";
	}

}
