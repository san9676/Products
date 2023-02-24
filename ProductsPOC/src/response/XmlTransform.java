package response;



import java.lang.reflect.InvocationTargetException;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

//import org.apache.commons.beanutils.BeanUtils;
import sample.*;
import sample.PidMatchingValue;



public class XmlTransform{
	
	public ProductDetailsRoot produtDetailsRoot;
	public ProductDetailsResponse respone;
	
	public Object offerdetails;
	Map<String, Object> map=null;
	ObjectMapper mapper = new ObjectMapper();

	//public double preProdSum;
	//public double preSerSum;
	//public double ProdSum;
	//public double serSum;
	
	
	/*public double getPreProdSum() {
		return preProdSum;
	}
	public void setPreProdSum(double preProdSum) {
		this.preProdSum = preProdSum;
	}
	public double getPreSerSum() {
		return preSerSum;
	}
	public void setPreSerSum(double preSerSum) {
		this.preSerSum = preSerSum;
	}
	public double getProdSum() {
		return ProdSum;
	}
	public void setProdSum(double prodSum) {
		ProdSum = prodSum;
	}
	public double getSerSum() {
		return serSum;
	}
	public void setSerSum(double serSum) {
		this.serSum = serSum;
	}*/
	public ProductDetailsResponse getRespone() {
		return respone;
	}
	public void setRespone(ProductDetailsResponse respone) {
		this.respone = respone;
	}
	public ProductDetailsRoot getProdutDetailsRoot() {
		return produtDetailsRoot;
	}
	public void setProdutDetailsRoot(ProductDetailsRoot produtDetailsRoot) {
		this.produtDetailsRoot = produtDetailsRoot;
	}
	
	
	
	@SuppressWarnings({ "unchecked", "unlikely-arg-type" })
	public void transform() throws IllegalAccessException, InvocationTargetException  {
		
		map = mapper.convertValue(produtDetailsRoot, Map.class);
		offerdetails=map.get(getProdutDetailsRoot().offerDetails);
		System.out.println(map);
		System.out.println(offerdetails);
		}
		
		
			
			
		
		
}
