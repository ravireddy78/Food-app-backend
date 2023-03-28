package Com.Resto.RestaurantMngSys.Controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Com.Resto.RestaurantMngSys.Entity.CustomerFeedback;
import Com.Resto.RestaurantMngSys.Service.CustFeedbackServiceImpl;

public class CustFeedbackControllerTest {

	@InjectMocks
	private CustFeedbackController cont;
	
	@Mock
	CustFeedbackServiceImpl feedbackservice;
	
	 @Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	 
	@Test
	public void customerFeedbackTest() {
		 
		CustomerFeedback feedback = new CustomerFeedback();
		feedback.setCustmail("aryan@gmail.com");
		feedback.setMessage("Awesome Service");
		when(feedbackservice.postFeedback(feedback)).thenReturn("Thank You For Your Precious Feedback");
		
		String result = cont.getFeedback(feedback);
		
		assertEquals(result, "Thank You For Your Precious Feedback");
	}

}
