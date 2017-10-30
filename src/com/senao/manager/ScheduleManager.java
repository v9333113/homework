package com.senao.manager;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.senao.vo.Schedule;

/**
 * 
 * @author T00058
 *
 */
public class ScheduleManager extends JsonManager{
	
	private List<Schedule> schedules = new ArrayList<>();
	private String path = "src/com/senao/json/schedule.json";
	
	/**
	 * List<Object>轉換成成List<vo>
	 */
	@SuppressWarnings("unchecked")
	public void processJsonConfig() {
		ObjectMapper mapper = new ObjectMapper();
		List<Object> objects = (List<Object>)this.getConfigObjet(path);
		try {
			for(Object obj:objects){
				Schedule schedule = mapper.convertValue(obj, Schedule.class);
				schedules.add(schedule);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//計算
	public Integer count(){
		return schedules.size();
	}
	
	//取得物件
	public List<Schedule> getSchedules() {
		return schedules;
	}
}	
