package me.escoffier.workshop;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Calendar;
import java.text.SimpleDateFormat;

@Path("/")
public class MyFirstResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String print() {      
        return "hello from " + System.getenv("HOSTNAME") + ", it's " + now();
    }

    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }

}