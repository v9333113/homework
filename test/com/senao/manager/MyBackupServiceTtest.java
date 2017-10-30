package com.senao.manager;

import java.util.List;

import com.senao.service.MyBackupService;

/**
 * 
 * @author T00058
 *
 */
public class MyBackupServiceTtest {

	public static void main(String[] args) {
		MyBackupService service = new MyBackupService();
		service.processJsonConfigs();
		List<JsonManager> managers = service.getManagers();
		System.out.println(managers);
	}

}
