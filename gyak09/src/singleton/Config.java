package singleton;

import java.util.Hashtable;

public class Config {
	Hashtable<String, String> data = new Hashtable<>();
	
	private static Config instance = new Config();
	
	public static Config getInstance(){
		return instance;
	}
	
	private Config(){
		data.put("timeout", "12");
		data.put("db_ip", "localhost");
		data.put("db_port", "3000");
		data.put("threads",  "12");
	}
	
	public String getValue(String key){
		return data.get(key);
	}
	
	
	public Hashtable<String, String> getConfig(){
		return this.data;
	}
	
}
