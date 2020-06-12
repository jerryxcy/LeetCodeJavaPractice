package org.leetcode.question.june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
	List<Integer> nums = null;
	Map<Integer, Integer> numIndex = null;
	Random random = new Random();
	
	/** Initialize your data structure here. */
	public RandomizedSet() {
		nums = new ArrayList<>();
		numIndex = new HashMap<>();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {
		if (numIndex.containsKey(val)) {
			return false;
		}
		nums.add(val);
		numIndex.put(val, nums.size()-1);
		return true;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	public boolean remove(int val) {
		if (!numIndex.containsKey(val)) {
			return false;
		}
		int lastVal = nums.get(nums.size()-1);
		numIndex.put(lastVal, numIndex.get(val));
		nums.set(numIndex.get(val), lastVal);
		nums.remove(nums.size()-1);
		numIndex.remove(val);
		return true;
	}

	/** Get a random element from the set. */
	public int getRandom() {
		
		return nums.get(random.nextInt(nums.size()));
	}
}
