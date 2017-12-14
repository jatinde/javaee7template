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


    private String name;

    private String greet;

    public String sayHello() {
        return helloEJB.sayHello(this.name);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGreet() {
        if(this.name == null || this.name.trim().equals("")){
            greet = "";
        } else {
            greet = this.sayHello();
        }
        return greet;
    }
}
