package com.myapps;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.main.Main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

        System.out.println( "Hello World!" );
        Main main = new Main(App.class);

        main.run(args);

//        CamelContext camelContext = new DefaultCamelContext();
//        camelContext.addRoutes(new MyAPPRouteBuilder());
//        camelContext.start();
//        Thread.sleep(30000);
//        camelContext.start();


    }
}
