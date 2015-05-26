package recom.util;

import java.util.Calendar;


public class RecomemberUpdateTime {

	public String getUpdateTime(){
		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);

		int[] nowTime = {year, month, day, hour, day, min, sec};

		String updateTime = new String();

		for(int time : nowTime){
			updateTime = updateTime.concat(String.valueOf(time));
		}
		return updateTime;
	}

}
