package com.myapps;

import org.apache.camel.builder.RouteBuilder;

import java.util.Date;

public class MyAPPRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:myAPPTime?period=5000").process(p-> System.out.println("Payload")).log(">> ${body}");
    }
}
