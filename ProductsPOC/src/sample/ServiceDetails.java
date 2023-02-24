package sample;

import java.util.List;

public class ServiceDetails implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int  totalACVServiceNetAmtUSD;
   public int totalNonACVServiceNetAmtUSD;
   public List<ServiceCategory> serviceCategory;
   public double totalACVServiceNetAmt;
   public double totalNonACVServiceNetAmt;
}