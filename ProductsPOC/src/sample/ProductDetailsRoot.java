package sample;


public class ProductDetailsRoot  implements java.io.Serializable {
       /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	   public PreProductDetails preProductDetails;
       public PreServiceDetails preServiceDetails;
       public OptyDetails optyDetails;
       public ProductDetails productDetails;
       public ServiceDetails serviceDetails; 
       public OfferDetails offerDetails;
       public SubscriptionDetails subscriptionDetails;
	/**
	 * @return the offerDetails
	 */
	public OfferDetails getOfferDetails() {
		return offerDetails;
	}
	/**
	 * @param offerDetails the offerDetails to set
	 */
	public void setOfferDetails(OfferDetails offerDetails) {
		this.offerDetails = offerDetails;
	}
       
}