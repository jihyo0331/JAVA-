package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/world")
public class HelloWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {return "Hello World!";}

}
