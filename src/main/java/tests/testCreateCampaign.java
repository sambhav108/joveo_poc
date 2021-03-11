package tests;

import org.apache.http.HttpResponse;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dataProviders.CreateCampaignDP;
import dataProviders.CreateClientDP;
import httptemp.CreateCampaignHelper;
import httptemp.CreateClientMethod;
import pojo.CreateCampaign;
import pojo.CreateClientResponse;

public class testCreateCampaign {

	@BeforeClass
	void createClients()
	{
//		CreateClientMethod cl =  new CreateClientMethod();
//		cl.createClientIds(1, 2);
	}
	
	@Test(dataProvider = "poc-test-campaign", dataProviderClass=CreateCampaignDP.class)
	public void testCreateCamp(String campName, String startDate, String endDate, int budget, String freq)
	{
//	System.out.println(CreateClientMethod.getClientId());
		String client_id = "d6a4f3ac-0c3b-4b51-bb9d-4b3f41742378";
		CreateCampaign camp = CreateCampaignHelper.createCampaignRequest(client_id, campName, startDate, endDate, budget, freq);
		CreateCampaignHelper campObj = new CreateCampaignHelper();
		HttpResponse response = campObj.createCampaign(camp);
		Assert.assertNotNull(response, "the http response object is null");
		int statusCode = response.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, 200, "the response code is not 200. The response code returned is " +statusCode); 
		 CreateClientResponse responseObject = (CreateClientResponse) campObj.getClassObjectFromResponse(response, CreateClientResponse.class);
		Assert.assertTrue(responseObject.getSuccess());
		System.out.println(responseObject.getData().getData().get(0).getId());
		
		
		
	}
	
	
	@AfterClass
	void deleteClients()
	{
		
	}
	
}
