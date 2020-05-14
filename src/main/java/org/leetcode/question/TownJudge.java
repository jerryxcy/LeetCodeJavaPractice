package org.leetcode.question;

import java.util.HashMap;
import java.util.Map;

public class TownJudge {

	public int findJudge(int N, int[][] trust) {
		Map<Integer, Integer> beTrusted = new HashMap<>();
		Map<Integer, Integer> trustsomeone = new HashMap<>();
		for (int i = 0 ; i < trust.length; i++) {
			if (beTrusted.containsKey(trust[i][1])) {
				beTrusted.put(trust[i][1], beTrusted.get(trust[i][1])+1);
			} else {
				beTrusted.put(trust[i][1], 1);
			}
			if (trustsomeone.containsKey(trust[i][0])) {
				trustsomeone.put(trust[i][0], trustsomeone.get(trust[i][0])+1);
			} else {
				trustsomeone.put(trust[i][0], 1);
			}
		}
		int judge = -1;
		for (Map.Entry<Integer, Integer> entry : beTrusted.entrySet()) {
			if (entry.getValue() == N-1) {
				if (!trustsomeone.containsKey(entry.getKey())) {
					judge = entry.getKey();
				}
			}
		}
		if (trust.length == 0 && N == 1) {
			judge = 1;
		}
		return judge;    
	}
}
