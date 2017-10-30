package com.senao.manager;

import com.senao.vo.Schedule;

/**
 * 
 * @author T00058
 *
 */
public class ScheduleManagerTest {
	
	public static void main(String[] args) {
		ScheduleManager scheduleManager = new ScheduleManager();
		scheduleManager.processJsonConfig();
		System.out.println(scheduleManager.count());
		for(Schedule schedule:scheduleManager.getSchedules()){
			System.out.println(schedule.getExt());
		}
	}
}
