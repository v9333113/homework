package com.senao.manager;

import com.senao.vo.Config;

public class ConfigManagerTest {

	public static void main(String[] args) {
		ConfigManager configs = new ConfigManager();
		configs.processConfigs();
		System.out.println(configs.count());
		for(Config config:configs.getConfigs()){
			System.out.println(config.getDestination());
		}
	}

}
