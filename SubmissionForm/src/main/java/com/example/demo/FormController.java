 package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormController {
	@Autowired            //
	CustomerRepo repo;             //repo is used to do specific action
	
	//root url
	@RequestMapping("/")   
	public String edureka() {
		return "edureka";
	}
	//after user enters the data...data is fetched and stored in repository
	@RequestMapping("/details")  
	public String details(Customers customers) {
		repo.save(customers);
		return "edureka";
	}
	//url to view getails
	@RequestMapping("/getdetails")   
	public String getDetails() {
		return "ViewCustomers";
	}
	
	/*@GetMapping("edureka")   //to use exact url that have mentioned
	public String edureka() {
		return "edureka";
	}*/
	
	//post url to view details
	@PostMapping("/getdetails")  //this is used when we done with the url
	public ModelAndView getdetails(@RequestParam int cid) {
		
		ModelAndView  mv=new ModelAndView("Retrieve");
		Customers customers=repo.findById(cid).orElse(null);
		mv.addObject(customers);
		
		return mv;
	}
	
	//crud operation
	
	@RequestMapping("/customers")
	@ResponseBody       //tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object....if methode is not returning jsp file
	public List<Customers> getCustomers() {
		return repo.findAll();
	}
	
	@RequestMapping("/customers/{cid}")
	@ResponseBody       //tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object
	public Optional<Customers> getCustomersById(@PathVariable("cid") int cid) {    //have to tell the string cid should be taken from the url passed-->PathVariable
		return repo.findById(cid);
	}
	
	@PostMapping("/customers")
	public Customers getCustomersDetails(@RequestBody Customers customers) {    //if we send raw data requestBody should be used to map httprequest body to domain object/java object
		repo.save(customers);
		return customers;
	}
	
	@DeleteMapping("/customers/{cid}")
	public Customers deleteCustomersDetails(@PathVariable int cid) {
		Customers cust=repo.getOne(cid);
		repo.delete(cust);
		return cust;
	}
	
	@PutMapping(path="/customers" , consumes= {"application/json"})    //we need json format so application/json is used...xml-->application/xml
	public Customers updateCustomersDetails(@RequestBody Customers customers) {
		repo.save(customers);
		return customers;
	}

}
