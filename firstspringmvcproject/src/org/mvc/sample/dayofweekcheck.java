package org.mvc.sample;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class dayofweekcheck extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handles) throws Exception
	{
		
		Calendar c=Calendar.getInstance();
		int day=c.get(c.DAY_OF_WEEK);
		if(day==2)
		{
			
			response.getWriter().write("Site is closed today");
			return false;
		}
		
		
		
		return true;
		
	}

}
