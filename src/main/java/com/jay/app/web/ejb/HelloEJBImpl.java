package com.jay.app.web.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloEJBImpl implements HelloEJB {
    @Override
    public String sayHello(String name) {
        return String.format("Hello %s from EJB", name);
    }
}
