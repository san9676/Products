package response;
import sample.OptyDetails;

//import java.util.List;

import sample.OfferDetails;
import sample.SubscriptionDetails;
public class ProductDetailsResponse implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	public PreProductDetails preProductDetails;
    public PreServiceDetails preServiceDetails;
    public OptyDetails optyDetails;
    public PreProductDetails productDetails;
    public PreServiceDetails serviceDetails; 
    public OfferDetails offerDetails;
    public SubscriptionDetails subscriptionDetails; 
}
