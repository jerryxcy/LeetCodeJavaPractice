package org.leetcode.question.june;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class ReconstructItineraryTest {

	@Test
	public void testMethod() {
		ReconstructItinerary it = new ReconstructItinerary();
		
		List<List<String>> tickets = new ArrayList<List<String>>();
		tickets.add(Stream.of("MUC", "LHR").collect(Collectors.toList()));
		tickets.add(Stream.of("JFK", "MUC").collect(Collectors.toList()));
		tickets.add(Stream.of("SFO", "SJC").collect(Collectors.toList()));
		tickets.add(Stream.of("LHR", "SFO").collect(Collectors.toList()));
		List<String> expected = Stream.of("JFK", "MUC", "LHR", "SFO", "SJC").collect(Collectors.toList());
		assertTrue(expected.equals(it.findItinerary(tickets)));
		
		tickets = new ArrayList<List<String>>();
		tickets.add(Stream.of("EZE","AXA").collect(Collectors.toList()));
		tickets.add(Stream.of("TIA","ANU").collect(Collectors.toList()));
		tickets.add(Stream.of("ANU","JFK").collect(Collectors.toList()));
		tickets.add(Stream.of("JFK","ANU").collect(Collectors.toList()));
		tickets.add(Stream.of("ANU","EZE").collect(Collectors.toList()));
		tickets.add(Stream.of("TIA","ANU").collect(Collectors.toList()));
		tickets.add(Stream.of("AXA","TIA").collect(Collectors.toList()));
		tickets.add(Stream.of("TIA","JFK").collect(Collectors.toList()));
		tickets.add(Stream.of("ANU","TIA").collect(Collectors.toList()));
		tickets.add(Stream.of("JFK","TIA").collect(Collectors.toList()));
		expected = Stream.of("JFK","ANU","EZE","AXA","TIA","ANU","JFK","TIA","ANU","TIA","JFK").collect(Collectors.toList());
		assertTrue(expected.equals(it.findItinerary(tickets)));
	}
}
