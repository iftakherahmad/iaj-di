package net.therap.iajdi.service;

import org.springframework.stereotype.Service;

/**
 * @author iftakhar.ahmed
 * @since 11/10/21
 */
@Service
public class PropertyGreetingService implements GreetingService{

    @Override
    public String getGreeting() {
        return "Service Implementation - Property";
    }
}