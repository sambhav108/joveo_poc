package httptemp;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;

public class CreateClientMethod {
	String uri = "https://mojo2.joveo.com/thor/api/clients";
	String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJpc3MiOiJhdXRoLmpvdmVvLmNvbSIsImV4cCI6IjIwMjEtMDQtMDNUMTY6Mjk6NDIuMDY1WiIsInN1YiI6InNhbWJoYXZAam92ZW8uY29tIn0.lbSmEGQutwJUhiJRc-25bnb_jmav8437Pgs5QmuatPQHrCfdcgaCofLClNOHwpsHnpiqTGhazLZy0y5_v8ncRQ";

	
	private Logger log = LogManager.getLogger(CreateClientMethod.class.getName());

	public HttpResponse  createClientWithName(String name) throws ClientProtocolException, IOException
	{
	String jsonString = "{\"params\":{\"name\":\""+name+"\",\"country\":\"IND\",\"exportedName\":\"ex1\",\"advertiserName\":\"anbc\",\"ats\":\"ADP Apply 2 Jobs\",\"atsUrl\":\"www.google.com\",\"frequency\":\"3 hours\",\"applyConvWindow\":30,\"timezone\":\"7afb\",\"type\":\"DirectEmployer\",\"industry\":\"47\",\"excludedPublishers\":\"\",\"endDate\":\"03/31/2021\",\"startDate\":\"03/04/2021\",\"markdown\":\"\",\"feeds\":[{\"xmlFeedUrl\":\" https://joveo-samplefeed.s3.amazonaws.com/abhinay/AbSample.xml\",\"id\":null,\"schemaMappings\":{\"schemaMappingsJobCollection\":\"Jobs\",\"schemaMappingsJob\":\"job\",\"schemaMappingsCompany\":null,\"schemaMappingsTitle\":\"title\",\"schemaMappingsCity\":\"city\",\"schemaMappingsState\":\"state\",\"schemaMappingsCountry\":\"country\",\"schemaMappingsDescription\":\"description\",\"schemaMappingsURL\":\"url\",\"schemaMappingsZip\":null,\"schemaMappingsCategory\":\"category\",\"schemaMappingsDatePosted\":\"date\",\"schemaMappingsRefNumber\":\"referencenumber\",\"schemaMappingsModifiedDate\":null,\"schemaMappingsPublishedDate\":null,\"schemaMappingsCPCBid\":\"cpc\",\"schemaMappingsType\":null,\"schemaMappingAdditional\":{},\"schemaMappingPublisher\":{}},\"mandatoryFields\":[\"source\",\"job\",\"title\",\"description\",\"url\",\"referencenumber\"]}],\"sjCreate\":false,\"budgetCap\":{\"value\":100000,\"pacing\":false,\"freq\":\"Monthly\"},\"industries\":[\"47\"],\"globallyExcludedPublishers\":\"\"}}";
	HttpResponse response = postApi(uri, jsonString, getHeaderMap(), "application/json");
	return response;
		
	}
	
	
	public HttpResponse postApi(String uri,String entity,Map<String,String> map,String contentType) throws ClientProtocolException, IOException
{
		log.info("Post api call for url " + uri);
		HttpPost request = new HttpPost(uri);
		log.info("Setting the headers");
		map.forEach((k,v) ->request.setHeader(k,v));
		StringEntity stringEntity = new  StringEntity(entity);
		log.info("Setting the content type");
		stringEntity.setContentType(contentType);
		request.setEntity(stringEntity);
		HttpClient client = HttpClientBuilder.create().build();
		System.out.println("the headers are +" + map);
		System.out.println("The headers and content type are set, hitting the request now.");
		HttpResponse httpResponse = client.execute(request);
		System.out.println("The response recieved is " + httpResponse.getStatusLine());
		log.info("The response recieved is " + httpResponse.getStatusLine());
		return httpResponse;
}
	
	public Map<String,String> getHeaderMap()
	{
		Map<String,String> hm = new HashMap<String,String>();
		hm.put("MojoAccessToken", token);
		hm.put("MojoAgencyId", "joveo");
		return hm;
		
	}
	
	
	public Object getClassObjectFromResponse(HttpResponse response,Class ResponsePojo )

	{	
	try {
		Object responseObject;
			responseObject = ResponsePojo.getDeclaredConstructor().newInstance();
		
		ObjectMapper mapper = new ObjectMapper();
		String responseAsString = getStringFromResponse(response);
			responseObject = mapper.readValue(responseAsString,ResponsePojo);
		
		return responseObject;
		
	}catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
			| InstantiationException | SecurityException | IOException e ) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		log.info("The folllowing exception has occured" + e.getStackTrace());
	} 
	
	return null;
	} 

	
	public String getStringFromResponse(HttpResponse response)
	{
		
		

			try {
				return EntityUtils.toString(response.getEntity());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}
	

}
