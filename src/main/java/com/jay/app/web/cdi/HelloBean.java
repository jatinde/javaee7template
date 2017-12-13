package com.jay.app.web.cdi;

import com.jay.app.web.ejb.HelloEJB;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("hello")
@SessionScoped
public class HelloBean implements Serializable {

    @EJB
    private HelloEJB helloEJB;

    private String gretting;

    public String sayHello(String name) {
        return helloEJB.sayHello(name);
    }

    public String getGretting() {
        gretting = this.sayHello("Jatinder");
        return gretting;
    }
}
