package com.senao.manager;

import java.io.File;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

/**
 * 
 * @author T00058
 *
 */
public abstract class JsonManager {
	
	
	/**
	 * 讀JSON 換物件
	 * @param path
	 * @return
	 */
	protected Object getConfigObjet(String path){
		ObjectMapper mapper = new ObjectMapper();
		Object objs = null;
		try {
			objs = mapper.readValue(new File(path),
					TypeFactory.defaultInstance().constructCollectionType(List.class,  
							Object.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objs;
	}
	
	/**
	 * 執行json轉換
	 */
	public abstract void processJsonConfig();
}
