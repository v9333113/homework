package com.senao.manager;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import com.senao.vo.Config;

public class ConfigManager {
	
	private List<Config> configs;
	
	@SuppressWarnings("unchecked")
	public void processConfigs() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			configs = (List<Config>) mapper.readValue(new File("src/com/senao/json/config.json"),
					TypeFactory.defaultInstance().constructCollectionType(List.class,  
							Config.class));
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Integer count(){
		return configs.size();
	}

	public List<Config> getConfigs() {
		return configs;
	}
	
	
}
