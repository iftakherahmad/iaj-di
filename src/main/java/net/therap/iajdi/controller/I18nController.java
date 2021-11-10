package net.therap.iajdi.controller;

import net.therap.iajdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author iftakhar.ahmed
 * @since 11/10/21
 */
@Controller
public class I18nController {

    private GreetingService greetingService;

    public I18nController(@Qualifier("I18nService") GreetingService greetingService) {
        this.greetingService=greetingService;
    }

    public void sayGreeting(){
        System.out.println(greetingService.getGreeting());
    }
}