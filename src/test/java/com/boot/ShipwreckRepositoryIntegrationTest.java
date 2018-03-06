/**
 * @author ashish.adhikari
 */
package com.boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
/**
 * @author ashish.adhikari
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class ShipwreckRepositoryIntegrationTest {
	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	@Test
	public void testFindAll() {
		List<Shipwreck> shipwrecks = shipwreckRepository.findAll();
		assertThat(shipwrecks.size(),is(greaterThanOrEqualTo(0)));
	}
}
