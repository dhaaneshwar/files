package Mulesoft;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Mule {
	
	private static  String HashRequestBody(String body) {
	    String hashedBody = "";
	    try {
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        hashedBody = Base64.getEncoder().encodeToString(digest.digest(body.getBytes()));     
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    }
	    return hashedBody;
	}

	private static String SignMessage(String clientSecret, String messageToSign) {
	    String hash = "";
	    try {
	        Mac sha256_HMAC;
	        sha256_HMAC = Mac.getInstance("HmacSHA256");
	        SecretKeySpec secret_key = new SecretKeySpec(clientSecret.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
	        sha256_HMAC.init(secret_key);
	        hash = Base64.getEncoder().encodeToString(sha256_HMAC.doFinal(messageToSign.getBytes(StandardCharsets.UTF_8)));
	    } catch (NoSuchAlgorithmException e) {
	    e.printStackTrace();
	    } catch (InvalidKeyException e) {
	    e.printStackTrace();
	    }
	    return hash;
	}
	
	private static String CreateMessageToSign(
		    String clientId, 
		    String pathAndQuery, 
		    String requestMethod, 
		    String contentType,
		    String hashedBody, 
		    String timeStamp) {
		        String messageToSign = String.join("\n", 
		            new String[] {
		                clientId, 
		                requestMethod, 
		                contentType, 
		                hashedBody, 
		                pathAndQuery, 
		                timeStamp});
		        return messageToSign;
		}
	
	public static void main(String[] args) {
		String clientId = "801e66e6-3be0-4bc0-8434-3e7451b45a1e";
		String clientSecret = "8i2iUNRjd6qA6Q7jEz0bmvd2cwmCF_x6emANpTntz3V6I9hkYVBjfUSeMrfl0J7A";

		String baseUrl = "https://ordering.api.olosandbox.com";
		//Dynamic location ID
		String pathAndQuery = "/v1.1/restaurants/60837/menu";
		String url = baseUrl + pathAndQuery;
		String requestMethod = "GET";
		String contentType = "";

		String body = "";
		String hashedBody = HashRequestBody(body);

		// Can't use RFC_1123_DATE_TIME here as it's not the same as C# (Java uses d instead of dd for day)
		String timeStamp = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss O").format(ZonedDateTime.now(ZoneOffset.UTC));

		String messageToSign = CreateMessageToSign(clientId, pathAndQuery, requestMethod, contentType, hashedBody, timeStamp);
		String signedMessage = SignMessage(clientSecret, messageToSign);
		System.out.println(messageToSign);
		System.out.println(signedMessage);

//		CloseableHttpClient httpClient = HttpClients.createDefault();
//		HttpGet request = new HttpGet(url);
//		request.addHeader("Date", timeStamp);
//		request.addHeader("Authorization", String.format("OloSignature %1s:%2s", clientId, signedMessage));
//
//		try {
//		    HttpResponse response = httpClient.execute(request);
//		    HttpEntity entity = response.getEntity();
//		    // do something with response         
//		} catch (ClientProtocolException e) {
//		    e.printStackTrace();
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
//		
//		String clientSecret = System.getenv("clientSecret");
//		String signedMessage = SignMessage(clientSecret, messageToSign);
	}

}
