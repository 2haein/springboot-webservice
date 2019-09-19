package com.haein.webservice.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@Controller
public class CommonController {
    
    @RequestMapping("/a")
    public @ResponseBody String root_test() throws Exception{
        return "Hello Root(/)";
    }
 
    @RequestMapping("/demo")
    public String demo_test() throws Exception{
        return "Hello demo(/demo)";
    }
 
}
 