package com.demo.pattern.observerp.observer;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("unchecked")
public class ScoreDisplay implements Observer {

	public void update(Observable o, Object obj) {
		
		HashMap<String, String> matchStatisticsMap = (HashMap<String, String>) obj;
		System.out.println("score: " + matchStatisticsMap.get("score"));
		
	}

}
