package Com.Resto.RestaurantMngSys.Controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Com.Resto.RestaurantMngSys.Entity.Admin;
import Com.Resto.RestaurantMngSys.Service.AdminLoginServiceImpl;

public class AdminLoginControllerTest {
	
	@InjectMocks
	private AdminLoginController adminLoginController;
	
	@Mock
	private AdminLoginServiceImpl adservice;
	
	 @Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }

	@Test
	public void adminLoginTest() {
		
		Admin admin = new Admin();
		admin.setAdusrname("myadmin");
		when(adservice.checkLogin("myadmin", "password")).thenReturn(admin);
		
		Admin ad = adminLoginController.checkLogin("myadmin", "password");
				
		String usrname = admin.getAdusrname();
				
		assertEquals(usrname, "myadmin");
	}
	
	@Test
	public void helloTest() {
		String result = adminLoginController.getMsg();
		assertEquals(result, "hello");
	}

}
