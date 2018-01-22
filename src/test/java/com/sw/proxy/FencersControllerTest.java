package com.sw.proxy;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.sw.proxy.model.Fencer;

public class FencersControllerTest {

	private FencersController controller = new FencersController();
	
	@Test
	public void callingGetFencer_ReturnsFencer() {
		Fencer fencer = controller.getFencer();
		assertNotNull(fencer);
	}
}
