package app;

import com.angelbroking.smartapi.SmartConnect;
import com.angelbroking.smartapi.http.SessionExpiryHook;
import com.angelbroking.smartapi.models.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartConnect sm=new SmartConnect();
		sm.setApiKey("MCtptPWb");
		
		sm.setSessionExpiryHook((SessionExpiryHook) new SessionExpiryHook() {
			
			public void sessionExpired() {
				System.out.println("session expired");
			}
			});
//		String clientId = "U66285";
//		User user = sm.generateSession("U66285", "investingme2");
//		String feedToken = user.getFeedToken();
//		String strWatchListScript = "nse_cm|2885&nse_cm|1594&nse_cm|11536&mcx_fo|221658";
//		String task = "mw";	
			User user = sm.generateSession("U66285","Investingme@2");
//			System.out.println(user.toString());
			sm.setAccessToken(user.getAccessToken());
			sm.setUserId(user.getUserId());
			
//			String clientID = System.getProperty("clientID");
//			String clientPass = System.getProperty("clientPass");
//			String apiKey = System.getProperty("apiKey");
//			String totp = System.getProperty("totp");
//			SmartConnect smartConnect = new SmartConnect(apiKey);
//			User user = smartConnect.generateSession(clientID, clientPass, totp);
//			String feedToken = user.getFeedToken();
//			System.out.println(feedToken);
	}

}
