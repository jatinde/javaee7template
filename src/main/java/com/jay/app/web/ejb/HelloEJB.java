package com.jay.app.web.ejb;

import javax.ejb.Local;

@Local
public interface HelloEJB {

    public String sayHello(String name);
}
