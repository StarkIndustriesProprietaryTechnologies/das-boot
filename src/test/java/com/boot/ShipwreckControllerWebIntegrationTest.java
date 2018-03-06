/**
 * @author ashish.adhikari
 */
package com.boot;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * @author ashish.adhikari
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ShipwreckControllerWebIntegrationTest {
	@Test
	public void testListAll() throws IOException{
		TestRestTemplate template = new TestRestTemplate(new RestTemplate());
		ResponseEntity<String> entity =  template.getForEntity("http://localhost:8080/api/v1/shipwrecks", String.class);
		
		assertThat(entity.getStatusCode(), equalTo(org.springframework.http.HttpStatus.OK));
		
		ObjectMapper mapper =  new ObjectMapper();
		JsonNode responseJson = mapper.readTree(entity.getBody());
		assertThat(responseJson.isMissingNode(), is(false));
		assertThat(responseJson.toString(), equalTo("[]"));
		
	}
}
