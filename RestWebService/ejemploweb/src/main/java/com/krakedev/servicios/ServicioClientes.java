package com.krakedev.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Path;

@Path("/customers")
public class ServicioClientes {

    @GET
    @Path("/m1")
    @Produces(MediaType.TEXT_PLAIN)
    public String saludar() {
        return "¡Hola desde el método saludar!";
    }
}


