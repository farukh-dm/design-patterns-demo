package com.demo.pattern.observerp.subject;

import java.util.Map;
import java.util.Observable;

public class MatchStatistic extends Observable {
	
	public void udpateUpcomingStats(Map<String, String> matchStatisticsMap) {
		this.setChanged();
		this.notifyObservers(matchStatisticsMap);
	}
	
}
