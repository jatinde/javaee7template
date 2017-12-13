package com.jay.app.web.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
public interface HelloEJB {

    public String sayHello(String name);
}
