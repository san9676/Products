package Test;

import java.lang.reflect.InvocationTargetException;

//import org.apache.commons.beanutils.BeanUtils;

import sample.OfferDetails;
import sample.OptyDetails;
import sample.SubscriptionDetails;
//import java.util.*;

public class TestTransform {
	 
	public sample.ProductDetailsRoot produtDetailsRoot;
	public ProductDetailsRoot output;
	
	public OfferDetails offerdetails;
	public OptyDetails optydetails;
	public SubscriptionDetails subscriptiondetails;
	
	public sample.ProductDetailsRoot getProdutDetailsRoot() {
		return produtDetailsRoot;
	}
	public void setProdutDetailsRoot(sample.ProductDetailsRoot produtDetailsRoot) {
		this.produtDetailsRoot = produtDetailsRoot;
	}
	public ProductDetailsRoot getOutput() {
		return output;
	}
	public void setOutput(ProductDetailsRoot output) {
		this.output = output;
	}
     
	
	public void tran() throws IllegalAccessException, InvocationTargetException {
		//ProductDetailsRoot productDetailsRoot = new ProductDetailsRoot();
		//OfferDetails offerDetails=new OfferDetails();
		//productDetailsRoot.setOfferDetails(offerDetails);
		//productDetailsRoot.get
		offerdetails=produtDetailsRoot.offerDetails;
		optydetails=produtDetailsRoot.optyDetails;
		subscriptiondetails=produtDetailsRoot.subscriptionDetails;
		
		
		/*BeanUtils.copyProperties(offerdetails, output.offerDetails);
		BeanUtils.copyProperties(optydetails, output.optyDetails);
		BeanUtils.copyProperties(subscriptiondetails, output.subscriptionDetails);*/
		
		
	}
	

     

}
