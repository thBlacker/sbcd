package com.cb.sbcd.test;


import com.cb.sbcd.log.LoggManager;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String helloWorld(){
        Logger logger = LoggManager.getServiceLogger();
        logger.info("123");
        return "h";
    }


}
