package anand.memoryleak;

import java.util.Map;
import java.util.WeakHashMap;

public class MemoryLeak01Solution {
	private Map<Integer, String> cache = new WeakHashMap<Integer, String>();

	public void addUserToCache(int id, String userData) {
		cache.put(id, userData);
	}

	public String getUserFromCache(int id) {
		return cache.get(id);
	}

	public static void main(String[] args) {
		MemoryLeak01Solution app = new MemoryLeak01Solution();

		for (int i = 0; i < 1000000; i++) {
			app.addUserToCache(i, "User" + i);
		}
		System.out.println("Cache filled with 1 million entries");
		// The GC will reclaim memory as the keys are no longer referenced
	}

}
