package com.senao.manager;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.senao.vo.Config;

/**
 * 
 * @author T00058
 *
 */
public class ConfigManager extends JsonManager{
	
	private List<Config> configs = new ArrayList<>();
	private String path = "src/com/senao/json/config.json";
	
	/**
	 * List<Object>轉換成成List<vo>
	 */
	@SuppressWarnings("unchecked")
	public void processJsonConfig() {
		ObjectMapper mapper = new ObjectMapper();
		List<Object> objects = (List<Object>)this.getConfigObjet(path);
		try {
			for(Object obj:objects){
				Config config = mapper.convertValue(obj, Config.class);
				configs.add(config);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//計算
	public Integer count(){
		return configs.size();
	}
	
	//取得物件
	public List<Config> getConfigs() {
		return configs;
	}
	
	
}
