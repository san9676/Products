package Test;

import java.util.Map;


import com.fasterxml.jackson.databind.ObjectMapper;


public class MapKeyValue {
	
	public Object obj;
	Map<String, Object> map=null;
	public String output;

	/**
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}
	/**
	 * @param output the output to set
	 */
	public void setOutput(String output) {
		this.output = output;
	}

	/**
	 * @return the map
	 */
	ObjectMapper mapper = new ObjectMapper();
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
 
	
	@SuppressWarnings("unchecked")
	public  void getValues() {
		  

	
		
		map = mapper.convertValue(obj, Map.class);

		
		output=map.toString();
		
		
		  
	  }
	
	
}
