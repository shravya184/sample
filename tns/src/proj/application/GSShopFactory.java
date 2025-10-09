package proj.application;
import proj.framework.NormalAcc;
import proj.framework.PrimeAcc;
import proj.framework.ShopFactory;
public class GSShopFactory implements ShopFactory{

		@Override
		public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
			PrimeAcc prime = new PrimeAcc(accNo,accNm,charges,isPrime);
			return prime;
		}

		@Override
		public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) {
			NormalAcc nor = new NormalAcc(accNo,accNm,charges,deliveryCharge);
			return nor;
		}

		
	}

