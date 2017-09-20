package org.mvc.sample;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	@ModelAttribute
	public void addingHeader(Model m)
	{
		m.addAttribute("h1", "KBK CLG OF ENGINEERING");
		
	}
	
	@InitBinder
	public void binder(WebDataBinder b)
	{
		
		
		
		SimpleDateFormat d=new SimpleDateFormat("yyyy**mm**dd");
		b.registerCustomEditor(Date.class,"date",new CustomDateEditor(d,false));
	}
	
	
	

	@RequestMapping(value="/submission", method=RequestMethod.POST)
public ModelAndView submission(@Valid @ModelAttribute("student1") Student student1,BindingResult br)
{	
		
		if(br.hasErrors())
		{
			
			ModelAndView m=new ModelAndView("admission");
			return m;
			
		}
			
		
		
		
		ModelAndView mav=new ModelAndView("NewFile");
		mav.addObject("welcomeMessage", "Submitted Information");
		return mav;
	}
	
	
	
	
	@RequestMapping(value="/admission" ,method=RequestMethod.GET)
	public ModelAndView admission() throws Exception
	{
		
		String exceptionoccured="NULL_POINTER";
		if(exceptionoccured.equals("NULL_POINTER"))
		{
			throw new NullPointerException("Null Pointer Exception");
			
			
		}
			
			ModelAndView mav=new ModelAndView("admission");
	
			return mav;
		}
	
	
	@ResponseBody
	@RequestMapping(value="/admission1" ,method=RequestMethod.GET)
	public ArrayList<Student> students() throws Exception
	{
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setName("asd");
		s2.setName("asd1");
		s3.setName("asd2");
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		return a;
		}
	
	
	
	@ExceptionHandler(Exception.class)
	public String exceptionhandle(Exception e)
	{
		
		
		return "nullpointer";
	}
	
	
	
	

}
