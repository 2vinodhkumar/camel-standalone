package com.myapps;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopierWithCamel {
    public static void main(String[] args) throws Exception {
        CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                    from("file:/Users/vinodhkumark/SIEMData/packetbeat-8.5.0-darwin-aarch64/?noop=true").to("file:/Users/vinodhkumark/SIEMData/packetbeat-8.5.0-darwin-aarch64/copied/");
            }
        });
        camelContext.start();
        Thread.sleep(20000);
        camelContext.stop();
    }
}
