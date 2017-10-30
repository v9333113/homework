package com.senao.manager;

import com.senao.vo.Config;

/**
 * 
 * @author T00058
 *
 */
public class ConfigManagerTest {

	public static void main(String[] args) {
		ConfigManager configs = new ConfigManager();
		configs.processJsonConfig();
		System.out.println(configs.count());
		for(Config config:configs.getConfigs()){
			System.out.println(config.getDestination());
		}
	}

}
