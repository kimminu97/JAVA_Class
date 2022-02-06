package sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

// ctrl shift o �ڵ� ����Ʈ
public class SmsTest {
	public static void main(String[] args) {
		String api_key = "NCSMFWRCLQYVUUBK";
	    String api_secret = "5YVN4UXSSAAHRLZSDE541QBZWKVZN0EV";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01025940853");
	    params.put("from", "01025940853");
	    params.put("type", "SMS");
	    params.put("text", "�� �տ� �ù谡 �����߽��ϴ�.");
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	}
}
