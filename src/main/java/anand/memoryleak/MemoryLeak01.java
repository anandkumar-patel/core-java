package anand.memoryleak;

import java.util.HashMap;
import java.util.Map;

public class MemoryLeak01 {
	private Map<Integer, String> cache = new HashMap<>();

    public void addUserToCache(int id, String userData) {
        cache.put(id, userData);
    }

    public String getUserFromCache(int id) {
        return cache.get(id);
    }

    public static void main(String[] args) {
    	MemoryLeak01 app = new MemoryLeak01();

        for (int i = 0; i < 1000000; i++) {
            app.addUserToCache(i, "User" + i);
        }
        System.out.println("Cache filled with 1 million entries");
        // Even after these users are no longer needed, they are still retained in memory
    }

}
