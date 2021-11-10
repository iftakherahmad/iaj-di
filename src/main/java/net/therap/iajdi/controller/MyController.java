package net.therap.iajdi.controller;

import net.therap.iajdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author iftakhar.ahmed
 * @since 11/9/21
 */
@Controller
public class MyController {

    @Autowired
    public GreetingService greetingService;

    public void sayHellow(){
        System.out.println(greetingService.getGreeting());
    }
}