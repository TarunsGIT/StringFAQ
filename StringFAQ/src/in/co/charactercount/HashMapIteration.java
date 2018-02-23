package in.co.charactercount;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);

		for (String s : map.keySet()) {
			System.out.println(s + ":" + map.get(s));
		}
		HashSet<String> set = new HashSet<String>();
		// Set<String> s=map.keySet();
		for (String keys : map.keySet()) {
			set.add(keys);
		}
		System.out.println();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s + ":" + map.get(s));
		}

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}
	}

}
