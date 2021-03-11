package httptemp;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import helpers.Utils;
import pojo.CreateClientResponse;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;

public class CreateClientMethod extends HttpClientHelper {
	String uri = "https://mojo2.joveo.com/thor/api/clients";
		String prefix = "poc_";
			
	static List<String> clientIds = new ArrayList<String>();
	
	private Logger log = LogManager.getLogger(CreateClientMethod.class.getName());

	public static String getClientId()
	{
		Random randomGenerator = new Random();
	    return clientIds.get(randomGenerator.nextInt(clientIds.size()));
	}
	
	
	public void createClientIds(int numOfClient, int totalTries)
	{
		while(numOfClient >0 && totalTries >0)
		{
			HttpResponse response = createClientWithName(prefix + Utils.generateRandomString());
			if (!(null == response) && response.getStatusLine().getStatusCode() ==200) {
				 CreateClientResponse responseObject = (CreateClientResponse) getClassObjectFromResponse(response, CreateClientResponse.class);
				 clientIds.add(responseObject.getData().getData().get(0).getId());
				 numOfClient --;
				 
			}
			totalTries --;	
		}
		System.out.println("the list is " + clientIds);
	}
	
	
	public HttpResponse  createClientWithName(String name)
	{
	String jsonString = "{\"params\":{\"name\":\""+name+"\",\"country\":\"IND\",\"exportedName\":\"ex1\",\"advertiserName\":\"anbc\",\"ats\":\"ADP Apply 2 Jobs\",\"atsUrl\":\"www.google.com\",\"frequency\":\"3 hours\",\"applyConvWindow\":30,\"timezone\":\"7afb\",\"type\":\"DirectEmployer\",\"industry\":\"47\",\"excludedPublishers\":\"\",\"endDate\":\"03/31/2021\",\"startDate\":\"03/04/2021\",\"markdown\":\"\",\"feeds\":[{\"xmlFeedUrl\":\" https://joveo-samplefeed.s3.amazonaws.com/abhinay/AbSample.xml\",\"id\":null,\"schemaMappings\":{\"schemaMappingsJobCollection\":\"Jobs\",\"schemaMappingsJob\":\"job\",\"schemaMappingsCompany\":null,\"schemaMappingsTitle\":\"title\",\"schemaMappingsCity\":\"city\",\"schemaMappingsState\":\"state\",\"schemaMappingsCountry\":\"country\",\"schemaMappingsDescription\":\"description\",\"schemaMappingsURL\":\"url\",\"schemaMappingsZip\":null,\"schemaMappingsCategory\":\"category\",\"schemaMappingsDatePosted\":\"date\",\"schemaMappingsRefNumber\":\"referencenumber\",\"schemaMappingsModifiedDate\":null,\"schemaMappingsPublishedDate\":null,\"schemaMappingsCPCBid\":\"cpc\",\"schemaMappingsType\":null,\"schemaMappingAdditional\":{},\"schemaMappingPublisher\":{}},\"mandatoryFields\":[\"source\",\"job\",\"title\",\"description\",\"url\",\"referencenumber\"]}],\"sjCreate\":false,\"budgetCap\":{\"value\":100000,\"pacing\":false,\"freq\":\"Monthly\"},\"industries\":[\"47\"],\"globallyExcludedPublishers\":\"\"}}";
	HttpResponse response = null;
	try {
		response = postApi(uri, jsonString, getHeaderMap(), "application/json");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return response;
		
	}
	
	
	
	
	
	

	

}
