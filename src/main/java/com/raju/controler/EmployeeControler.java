package com.raju.controler;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;

import com.raju.model.Employee;
import com.raju.service.EmployeeService;

import sun.security.provider.MD5;

@Controller
public class EmployeeControler {
	@Autowired
public EmployeeService employeeService;
	@RequestMapping(value = "/addemployee", method = RequestMethod.GET)
	public ModelAndView  redirectRequestToAddEmployeePage() {
		String target="/WEB-INF/pages/addemployee.jsp";
		return new ModelAndView(target,"employee",new Employee());
		
	}
	
	
	
	
	
	@RequestMapping(value="employee/add",method=RequestMethod.POST,consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public ModelAndView addEmployee(@ModelAttribute("employee")Employee e,BindingResult bindingResult) {
		String msg="";
		String target="";
		if(e.getEmpId()==null) {
			if(e.getPassword().equals(e.getNewpassword())) {
				
				e.setPassword(md5(e.getPassword()));
				this.employeeService.addEmployee(e);
				
				Employee employeelist=this.employeeService.getEmployee();
				target="/WEB-INF/pages/employeelist.jsp";
				return new ModelAndView(target,"emplist",employeelist);
			}else {
				msg="password missmatch please try again";
				target="/index.jsp";
			}
		}
		return new ModelAndView(target,"msg",msg);
	}
	
	public static String md5(String input) {
		String md5 = null;
		if (null == input)
			return null;
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			digest.update(input.getBytes(), 0, input.length());
			md5 = new BigInteger(1, digest.digest()).toString(16);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return md5;
	}
}
