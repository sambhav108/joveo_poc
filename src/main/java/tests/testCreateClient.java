package tests;


import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import dataProviders.CreateClientDP;
import httptemp.CreateClientMethod;
import pojo.CreateClient;
import pojo.CreateClientResponse;

public class testCreateClient {
	
	CreateClientMethod cl = new CreateClientMethod();
   
	@Test (dataProvider = "poc-test-statusCode", dataProviderClass=CreateClientDP.class)
	public void testCreateClient(String clientName, int expectedStatusCode)
	{
			HttpResponse response = cl.createClientWithName(clientName);
			Assert.assertNotNull(response, "the http response object is null");
			int statusCode = response.getStatusLine().getStatusCode();
			Assert.assertEquals(statusCode, expectedStatusCode, "the response code is not 200. The response code returned is " +statusCode); 
			 CreateClientResponse responseObject = (CreateClientResponse) cl.getClassObjectFromResponse(response, CreateClientResponse.class);
			Assert.assertTrue(responseObject.getSuccess());
			System.out.println(responseObject.getData().getData().get(0).getId());
			
			
	
		
	
	

}
}
