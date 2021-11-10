package net.therap.iajdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author iftakhar.ahmed
 * @since 11/10/21
 */
@Service("I18nService")
@Profile({"EN","default"})
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String getGreeting() {
        return "Hello Babe";
    }
}