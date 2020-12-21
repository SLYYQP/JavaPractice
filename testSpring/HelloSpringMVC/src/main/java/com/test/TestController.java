package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.entity.Page;
import com.test.entity.Score;
import com.test.entity.UserInfo;
import com.test.mapper.UserInfoMapper;

@Controller
public class TestController {
	@Autowired
    private MyConfig config;
	
	@Autowired
	private UserInfoMapper userinfomapper;
	
	
	
	@RequestMapping(value ="/login", method = RequestMethod.POST)
    public @ResponseBody Object showMessage2(HttpServletRequest request,String username,String password) {
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
	
		System.out.println(username);
		UserInfo res = userinfomapper.login(username, password);
		if(res==null){
			return "fail";
		}else{
			request.getSession().setAttribute("loginuser", res);
		}
        return "success";
    }
	
	@RequestMapping(value ="/info", method = RequestMethod.GET)
    public @ResponseBody Object info(HttpServletRequest request) {
		UserInfo ress = (UserInfo)request.getSession().getAttribute("loginuser");
		return ress;
    }
	
	@RequestMapping(value ="/allinfo", method = RequestMethod.GET)
    public @ResponseBody Object allinfo(Page page) {
		
		System.out.println("======================================"+page.getKeyword());
		
		List<UserInfo> ree = userinfomapper.allinfo(page);
		int count = userinfomapper.countuser(page);
		Map<String,Object> resu = new HashMap();
		resu.put("users", ree);
		resu.put("total", count);
	
		return resu;
    }
	
	@RequestMapping(value ="/allscore", method = RequestMethod.GET)
    public @ResponseBody Object allscore() {
		List<Score> ss = userinfomapper.score();
		
		for(int i=0;i<ss.size();i++){
			Score gr = ss.get(i);
			UserInfo user =userinfomapper.getUserById(gr.getUserid());
			gr.setChname(user.getChname());
		}
		return ss;
    }
	

	@RequestMapping(value ="/addperson", method = RequestMethod.GET)
    public @ResponseBody Object addperson(HttpServletRequest request,UserInfo user) {

		int num = userinfomapper.add(user);
		if(num>0){
			return "success";
		}else{
			return "fail";
		}
		
    }
	

	@RequestMapping(value ="/delperson", method = RequestMethod.GET)
    public @ResponseBody Object delperson(HttpServletRequest request) {
		String userid = request.getParameter("userid");
		int id = Integer.parseInt(userid);
		
		System.out.println(id);
		int num1 = userinfomapper.del(id);
		if(num1>0){
			return "success";
		}else{
			return "fail";
		}
    }
	
	@RequestMapping(value ="/upperson", method = RequestMethod.GET)
    public @ResponseBody Object upperson(HttpServletRequest request,UserInfo user) {
		System.out.println("======================================"+user.getId());
		
	
		int num1 = userinfomapper.upperson(user);
		if(num1>0){
			return "success";
		}else{
			return "fail";
		}
	}
}
