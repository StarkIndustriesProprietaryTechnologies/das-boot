/**
 * @author ashish.adhikari
 */
package com.boot;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

/**
 * @author ashish.adhikari
 *
 */
public class ShipwreckControllerTest {
	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwreckRepository sr;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet() {
		Shipwreck sw = new Shipwreck();
		sw.setId(1L);
		when(sr.findOne(1L)).thenReturn(sw);
		
		
		Shipwreck shipwreck = sc.get(1L);
		
		verify(sr).findOne(1L);
		
//		assertEquals(1L, shipwreck.getId().longValue());
		
		assertThat(shipwreck.getId(),is(1l));
	}
	
	
	
}
