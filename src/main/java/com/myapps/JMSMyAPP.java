package com.myapps;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class JMSMyAPP {
    public static void main(String[] args) throws Exception {
        CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("timer:fooo?period=10000")
                                .setBody().constant("{\"foo\":\"bar\"}")
                                .log("Message to be sent: ${body}")
                                .to("rabbitmq:localhost:5672/A?username=guest&password=guest&autoDelete=false&routingKey=camel");
            }
        });
        camelContext.start();
    }
}
