package httptemp;

import java.io.IOException;

import org.apache.http.HttpResponse;

import pojo.BudgetCap;
import pojo.CampaignParams;
import pojo.CreateCampaign;

public class CreateCampaignHelper extends HttpClientHelper{

	String createCampUri = "https://mojo2.joveo.com/thor/api/campaigns";
	public static CreateCampaign createCampaignRequest(String clientId, String campName, String startDate, String endDate, int budget, String freq)
	{
		CampaignParams params = new CampaignParams();
		params.setClientId(clientId);
		params.setName(campName);
		BudgetCap bud = new BudgetCap();
		bud.setValue(budget);
		bud.setFreq(freq);
		bud.setPacing(false);
		params.setBudgetCap(bud);
		params.setEndDate(endDate);
		params.setStartDate(startDate);
		CreateCampaign cap = new CreateCampaign();
		cap.setParams(params);
		return cap;
	}
	
	public HttpResponse createCampaign(CreateCampaign camp)
	{
		String jsonString = getStringFromObject(camp);
		HttpResponse response = null;
		try {
			response = postApi(createCampUri, jsonString, getHeaderMap(), "application/json");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
			
		
	}
	
	
}
