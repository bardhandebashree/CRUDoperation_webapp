package com.source1.boot.Homecontrol;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.source1.boot.model.Model1;
import com.source1.boot.mrepo.Modelrepo;

@Controller
public class Homecontroller {

	@Autowired
	Modelrepo repo;
		//call home.jsp
		@RequestMapping("/")
		public String home()
		{
			return "home.jsp";
		}
		//fill the form and post the values to h2
//		@RequestMapping(path="/addvalues", method= RequestMethod.POST)
//		public String addvalues(@RequestParam int mid, @RequestParam String mname ,@RequestParam String mtech)
//		{
//			Model1 mobj= new Model1();
//			mobj.setMid(mid);
//			mobj.setMname(mname);
//			mobj.setMtech(mtech);
//			System.out.println("11111111111111111111111;111111111111111111111111111");
//			repo.save(mobj);
//			return "home.jsp";
//		}
		//in the url localhost:8080/getvalues/put id primarykey and GET the database record with the id
//		@RequestMapping(path="/getvalues/{mid}", method=RequestMethod.GET)
//		@ResponseBody
//		public String getValue(@PathVariable("mid") int mid) {
//			
//		System.out.println("11111111111111111111111;111111111111111111111111111");		
//			
//			return repo.findById(mid).toString();
//			
//		}
//		//in the url localhost:8080/getvalues/  and get all records in the database 
//		@RequestMapping(path="/getvalues", method=RequestMethod.GET)
//		@ResponseBody
//		public String getAllValue() {
//			
//		System.out.println("11111111111111111111111;111111111111111111111111111");				
//			
//			return repo.findAll().toString();
//			
//		}
		//return data from id in the form
		@RequestMapping(path="/getvalues", method=RequestMethod.GET)
		public ModelAndView getValues(@RequestParam int mid) {
			
		System.out.println("11111111111111111111111;111111111111111111111111111");				
			ModelAndView mv= new ModelAndView("datashow.jsp");
			
			Model1 mobj=repo.findById(mid).orElse(null);
			mv.addObject(mobj);
			return mv;
			
		}
		
		
		
	}




