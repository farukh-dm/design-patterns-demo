package com.demo.pattern.observerp;

import java.util.HashMap;
import java.util.Map;

import com.demo.pattern.observerp.observer.ScoreDisplay;
import com.demo.pattern.observerp.observer.SummaryDisplay;
import com.demo.pattern.observerp.subject.MatchStatistic;

public class MainMatch {
	
	public static Map<String, String> matchStatisticsMap;
	
	static {
		matchStatisticsMap = new HashMap<String, String>(2);
		matchStatisticsMap.put("score", "2-0");
		matchStatisticsMap.put("summary", "Nice match.");
		
	}
	
	public static void main(String[] args) {
		
		// Subject
		MatchStatistic subject = new MatchStatistic();
		
		// Observer
		ScoreDisplay scoreDisplay = new ScoreDisplay();
		SummaryDisplay summaryDisplay = new SummaryDisplay();
		
		// Add observers
		subject.addObserver(scoreDisplay);
		subject.addObserver(summaryDisplay);
		
		// try
		subject.udpateUpcomingStats(matchStatisticsMap);
		
		System.out.println("================");
		
	}

}
