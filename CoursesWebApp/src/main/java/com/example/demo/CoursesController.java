package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CoursesController {
	@RequestMapping("courses")
	public String courses(HttpServletRequest req) {   //url can also be passed without using HttpServeletRequest   courses(@RequestParam("cname")String coursename,HttpSession session)
		
//		System.out.println("Welcome to edureka");
		String cname=req.getParameter("cname");
		
		HttpSession session = req.getSession();     //to pass the url object to the jsp file
		session.setAttribute("cname", cname);
		
		System.out.println("The course name is: "+cname);
		return "course";
	}

	/*@RequestMapping("courses")
	public ModelAndView courses(@RequestParam("cname")String coursename) {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("cname",coursename);
		mv.setViewName("course");
		return mv;
	}*/
	
}
