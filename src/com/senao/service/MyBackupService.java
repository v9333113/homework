package com.senao.service;

import java.util.ArrayList;
import java.util.List;

import com.senao.manager.ConfigManager;
import com.senao.manager.JsonManager;
import com.senao.manager.ScheduleManager;

/**
 * 
 * @author T00058
 *
 */
public class MyBackupService {
	
	private List<JsonManager> managers = new ArrayList<>();
	
	//constructor
	public MyBackupService(){
		this.managers.add(new ConfigManager());
		this.managers.add(new ScheduleManager());
	}
	
	//執行所有物件轉換
	public void processJsonConfigs(){
		for(int i = 0; i < this.managers.size()-1; i++)
			this.managers.get(i).processJsonConfig();
	}

	public List<JsonManager> getManagers() {
		return managers;
	}
	
}
