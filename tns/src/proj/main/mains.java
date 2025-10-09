package proj.main;
import proj.application.GSNormalAcc;
import proj.application.GSPrimeAcc;

public class mains {
public static void main(String[] args) {
		
		GSPrimeAcc gsPrime = new GSPrimeAcc(100,"Nikhitha",500,true);
		
		GSNormalAcc gsnormal = new GSNormalAcc(101,"Krupa",5200,4000);
		
		gsPrime.bookProduct(1000);
	 gsnormal.bookProduct(383.4f);
		
	}

}

