import java.util.Timer;
import java.util.concurrent.TimeUnit;

import util.ScheduledTask;
import util.Impl.ExpiryCacheImpl;

public class Main {

    public static void main(String[] args) throws InterruptedException

    {   // Adding logs few more
    	
        System.out.println(" Initializing ... ");
        ExpiryCacheImpl<String, String> cache = new ExpiryCacheImpl<String, String>(true);
         
        Timer time = new Timer(); // Instantiate Timer Object
        
		ScheduledTask st = new ScheduledTask(); // Instantiate SheduledTask class
		time.schedule(st, 0, 5000); // Create Repetitively task for every 1 secs

        String key = "abcde";
        int ttl = 5;
        cache.put(key, "123", ttl, TimeUnit.SECONDS);
        cache.put("abc", "123", ttl, TimeUnit.SECONDS);
        Thread.sleep(3000); 
         String name = cache.get(key);
        System.out.println("1. Value is: " + name);
        
       Thread.sleep(3000);
       name = cache.get(key);
       System.out.println("2. Value is: " + name);
        
    }
}