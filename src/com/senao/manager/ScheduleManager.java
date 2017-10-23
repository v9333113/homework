package com.senao.manager;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import com.senao.vo.Schedule;

public class ScheduleManager {
	
	private List<Schedule> schedules;
	
	@SuppressWarnings("unchecked")
	public void processConfigs() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			schedules = (List<Schedule>) mapper.readValue(new File("src/com/senao/json/schedule.json"),
					TypeFactory.defaultInstance().constructCollectionType(List.class,  
							Schedule.class));
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Integer count(){
		return schedules.size();
	}

	public List<Schedule> getSchedules() {
		return schedules;
	}
	
	
}	
