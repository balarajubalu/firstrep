package com.raju.controler;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.raju.DTO.Loginproperties;
import com.raju.DTO.UserLogin;
import com.raju.model.User;
import com.raju.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value="admin",method=RequestMethod.GET)
	public ModelAndView showAdminPage(){
		String targetViewName="/WEB-INF/pages/adminHome.jsp";
		String status="welcome ";
		return new ModelAndView(targetViewName,"status",status);	
	}

	@RequestMapping(value="register",method=RequestMethod.GET)
	public ModelAndView showPage() {
		String targetview="/WEB-INF/pages/userregister.jsp";
		return new ModelAndView(targetview,"userbean",new User());
	}

	@RequestMapping(value="register_page",method=RequestMethod.POST)
	public ModelAndView registerPage(@RequestAttribute()User userRegister) {
		String message=null;
		
			message=userService.userRegister(userRegister);
		String targetviewname="/WEB-INF/pages/userregister.jsp";
		return new ModelAndView(targetviewname,"message",message);
	}
	
	/*@RequestMapping(value="/searchbyname", method=RequestMethod.GET)
	public ModelAndView findByName(@RequestParam("name")String name) {
		List<User> usersbyname=userService.findByName(name);
		
		String targetandview="/WEB-INF/pages/listofUsers.jsp";
		return new ModelAndView(targetandview,"listUsers",usersbyname);


	}*/
	/*@RequestMapping(value="getallemp",method=RequestMethod.GET)
	public ModelAndView getallUsers() {

		List<User> allUsers = userService.getAllUsers();
		String targetandview="/WEB-INF/pages/listofUsers.jsp";
		return new ModelAndView(targetandview,"listUsers",allUsers);
	}*/
	
	@RequestMapping(value="go_to_loginuser_Page",method=RequestMethod.GET)
	public ModelAndView showLoginPage() {

		String targetview="/WEB-INF/pages/loginuser.jsp";
		String message="welcom to user please Login .";
		return new ModelAndView(targetview,"message",message);
	}
	@RequestMapping(value="login_user",method=RequestMethod.POST)
	public ModelAndView userLogin(@RequestParam("username")String userName,
			@RequestParam("password")String password) {
		String msg="User name password didn't matched ";
		
		String targetandview="//WEB-INF/pages/loginuser.jsp";
		if(userName!=null  && password!=null && password.trim().length()>0&& userName.trim().length()>0) {

			Loginproperties loginproperties=new Loginproperties();
			loginproperties.setUsername(userName);
			loginproperties.setPassword(password);

			UserLogin userLogin=userService.userLogin(loginproperties);
			if(userLogin!=null&&userLogin.getUsername()!=null ) {//&& userLogin.getPassword()!=null
				
				msg="hello "+userLogin.getUsername()+" welcom to Login page";
				targetandview="/WEB-INF/pages/login_succes_page.jsp";


			}
		}
		return new ModelAndView(targetandview,"message",msg);

	}
	@RequestMapping("logout")
	public String Logout(HttpSession session){
	session.invalidate();
	return "go_to_loginuser_Page";

	}

	/*@RequestMapping(value="logout")
	public ModelAndView logOut(HttpServletRequest request){
		HttpSession httpSession = request.getSession();
		httpSession.invalidate();

		String targetAndView="//WEB-INF/pages/loginuser.jsp";
		String message="Logout succecfully..";
		return new ModelAndView(targetAndView,"msg",message);
	}*/
	/*public String logout(HttpSession session ) {
        session.invalidate();
        return "WEB-INF/pages/loginuser.jsp";
     }*/

}