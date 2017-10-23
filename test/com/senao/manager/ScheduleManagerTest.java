package com.senao.manager;

import com.senao.vo.Schedule;

public class ScheduleManagerTest {
	
	public static void main(String[] args) {
		ScheduleManager scheduleManager = new ScheduleManager();
		scheduleManager.processConfigs();
		System.out.println(scheduleManager.count());
		for(Schedule schedule:scheduleManager.getSchedules()){
			System.out.println(schedule.getExt());
		}
	}
}
