package net.therap.iajdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author iftakhar.ahmed
 * @since 11/10/21
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String getGreeting() {
        return "Service Implementation - Primary";
    }
}