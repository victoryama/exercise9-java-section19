package application;

import java.util.Map;
import java.util.TreeMap;

public class test1 {
	
	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>(); //armazena cookies
		
		cookies.put("username", "Maria");
		cookies.put("Email", "maria@gmail.com");
		cookies.put("phone", "999999");
		
		cookies.remove("Email");
		cookies.put("phone", "3198273");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phoen"));
		System.out.println("Email: " + cookies.get("Emmail"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All cookies: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}
}
