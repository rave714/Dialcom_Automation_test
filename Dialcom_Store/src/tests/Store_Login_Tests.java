package tests;

import org.testng.annotations.Test;

import pageobjects.Store_Loginpage;
import utils.AutomationHelper;


public class Store_Login_Tests  extends AutomationHelper {
	  
	  
	  
	  @Test()
	  public void Dstore_login01()throws Exception  {
	    
		  Store_Loginpage Store_Loginpage = new Store_Loginpage();
		  
	    
		
		  Store_Loginpage.dstore_Login_link (driver,"http://localhost/OnlineShopping-master/index.php");
		  Store_Loginpage.d_store_loginpage(driver, "jr@gmail.xom", "123456");
		  Store_Loginpage.d_store_verifydetails(driver, "CATEGORY");
	    
	    
	  }
	  

	}
