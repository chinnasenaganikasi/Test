package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@PropertySource("file:C:\\Users\\chinna\\Desktop\\WorkSpace\\application.properties")
@Profile("one")
public class TestClass {

    @Autowired
    Environment env;

    
    public String test() {
        System.out.println(env.getProperty("test.one"));
        return env.getProperty("test.one");
    }
}