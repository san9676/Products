package sample;

import java.util.List;

public class PreProductDetails implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<PidMatchingValue> pidMatchingValue;
	public int totalACVProductNetAmtUSD;
	public int totalNonACVProductNetAmtUSD;
	public List<ProductFamily> productFamily;
	public int totalACVProductNetAmt;
	public double totalNonACVProductNetAmt;
}