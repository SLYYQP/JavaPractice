package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class HelloSpringController {
    String message = "Welcome to Spring MVC!";
    @Autowired
    private MyConfig config;
 
    @RequestMapping("/hello")
    
    public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "Spring") String name) {
 
        ModelAndView mv = new ModelAndView("hellospring");//指定视图　　　　　//向视图中添加所要展示或使用的内容，将在页面中使用
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }
    
    @RequestMapping("/hello2")
    public @ResponseBody Object showMessage2(@RequestParam(value = "name", required = false, defaultValue = "Spring") String name) {
 
        User user=new User();
        user.setUsername("syq");
        user.setAge("20");
        return config;
    }
}