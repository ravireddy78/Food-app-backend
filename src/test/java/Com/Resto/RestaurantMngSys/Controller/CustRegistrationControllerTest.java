package Com.Resto.RestaurantMngSys.Controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Com.Resto.RestaurantMngSys.Entity.Customer;
import Com.Resto.RestaurantMngSys.Service.CustRegistrationServiceImpl;

public class CustRegistrationControllerTest {

	@InjectMocks
	CustRegistrationController custreg;
	
	@Mock
	CustRegistrationServiceImpl custservice;
	
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void CustRegistrationTest() {
		Customer cust = new Customer();
		cust.setCustname("kk");
		cust.setCustpass("kk1234");
		cust.setCustmail("kbn@gmail.com");
		cust.setCustaddress("karmala");
		cust.setCustmobileno(989039899);
		
		when(custservice.registerCustomer(cust)).thenReturn("Thank you for Registration");
		String result = custreg.doRegistration(cust);
		assertEquals(result, "Thank you for Registration");
		}

}
