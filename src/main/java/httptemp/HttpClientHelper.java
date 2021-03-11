package httptemp;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpClientHelper {
	private Logger log = LogManager.getLogger(HttpClientHelper.class.getName());
	String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJpc3MiOiJhdXRoLmpvdmVvLmNvbSIsImV4cCI6IjIwMjEtMDQtMDNUMTY6Mjk6NDIuMDY1WiIsInN1YiI6InNhbWJoYXZAam92ZW8uY29tIn0.lbSmEGQutwJUhiJRc-25bnb_jmav8437Pgs5QmuatPQHrCfdcgaCofLClNOHwpsHnpiqTGhazLZy0y5_v8ncRQ";

	
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
	
	
	public String getStringFromObject(Object obj) {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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


}
