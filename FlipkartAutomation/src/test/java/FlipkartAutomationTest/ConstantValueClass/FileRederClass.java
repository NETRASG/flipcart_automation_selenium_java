package FlipkartAutomationTest.ConstantValueClass;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileRederClass {
	
	JSONParser jsonParser=new JSONParser();
	Object objlogin,objbase,objproduct;
	 JSONObject jsonObjectBase,jsonObjectlogin,jsonObjectProduct;

	String localFile="D:\\Users\\ngudagamnala\\eclipse-workspace\\FlipcartAutomation\\FlipkartAutomation\\src\\resources\\";
	
	 private String Url;
	 private String userName;
	 private String phoneNum;
	 private String password;
	 private String productName;
	 private String productSelected;
	 private String productSize
	 
	 ;
	 public String getProductSelected() {
		return productSelected;
	}
	public void setProductSelected(String productSelected) {
		this.productSelected = productSelected;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}



	private int impliciteWait;
	
	 public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getImpliciteWait() {
		return impliciteWait;
	}
	public void setImpliciteWait(int impliciteWait) {
		this.impliciteWait = impliciteWait;
	}
	

	
	       public void jsonReader() {
	    	   try
		          {
		             objbase = jsonParser.parse(new FileReader(localFile+"Baseconfiguration.json"));
		             objlogin=jsonParser.parse(new FileReader(localFile+"loginConfiguration.json"));
		             objproduct=jsonParser.parse(new FileReader(localFile+"productConfiguration.json"));
		             jsonObjectBase = (JSONObject)objbase;
		             jsonObjectlogin = (JSONObject)objlogin;
		             jsonObjectProduct = (JSONObject)objproduct;
		          
		            setUrl((String)jsonObjectBase.get("URL"));
		            setUserName((String)jsonObjectlogin.get("user_name"));
		            setPhoneNum((String)jsonObjectlogin.get("phone_num"));
		           setPassword((String)jsonObjectlogin.get("password"));
		            setProductName((String)jsonObjectProduct.get("product_name"));
		            setImpliciteWait((int)jsonObjectBase.get("implicitWait"));
		            setProductSelected((String)jsonObjectProduct.get("product_select"));
		            setProductSize((String)jsonObjectProduct.get("product_size"));
		            
		            
		          }
		          
		          catch(Exception e) {
		             e.printStackTrace();
		          }
			
	       }
	       

}

