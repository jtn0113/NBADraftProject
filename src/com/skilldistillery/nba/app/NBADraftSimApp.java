package com.skilldistillery.nba.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.skilldistillery.nba.entities.Commisioner;
import com.skilldistillery.nba.entities.WinsComparator;

public class NBADraftSimApp {

	public static void main(String[] args) {
		Commisioner commisioner = new Commisioner();
		Map<String, Integer> roster = new HashMap<>();
		Map<String, Integer> results = new HashMap<>();
		roster.put("Rockets", 250);
		roster.put("Spurs", 199);
		roster.put("Mavericks", 156);
		roster.put("Lakers", 119);
		roster.put("Clippers", 88);
		roster.put("Warriors", 63);
		roster.put("Bulls", 43);
		roster.put("76ers", 28);
		roster.put("Cavs", 17);
		roster.put("Thunder", 11);
		roster.put("Nets", 8);
		roster.put("Jazz", 7);
		roster.put("Pistons", 6);
		roster.put("Wizards", 5);
		
		for(int i=0; i<100; i++) {
			String winner = commisioner.runRaffle(roster);
			if(!results.containsKey(winner)) {
				results.put(winner, 1);
			} else {
				int counter = results.get(winner);
				results.put(winner, ++counter);
			}
		}
		
		Set<String> keys = results.keySet();
		
		Comparator<String> comparator = new WinsComparator(results);
		
		List<String> keyList = new ArrayList<>(keys);
		keyList.sort(comparator);
		
		for (String string : keyList) {
			System.out.println(string + " : " + results.get(string));
		}
		
	}

}
