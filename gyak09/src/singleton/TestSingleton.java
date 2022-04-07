package singleton;

public class TestSingleton {
	public static void main(String[] args){
		Config config = Config.getInstance();
		System.out.println(config.getConfig());
		
		int timeout = Integer.parseInt(config.getValue("timeout"));
		
		System.out.println("timeout :" + timeout + "s");
		
		printConfig();
	}
	
	public static void printConfig(){
		Config config = Config.getInstance();
		System.out.println(config.getConfig());
	}
}
