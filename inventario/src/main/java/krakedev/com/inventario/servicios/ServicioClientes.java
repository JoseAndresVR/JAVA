package krakedev.com.inventario.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.entidades.Entidades;
import com.krakedev.persistencia.ClientesBDD;
@Path("clientes")
//@Path("/customers")
public class ServicioClientes {
	@Path("metodo1")
	@GET
   // @GET
   // @Path("/m1")
   // @Produces(MediaType.TEXT_PLAIN)
    public String saludar() {
        return "¡Hola desde el método saludar!";
    }
	
	@Path("buscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Entidades cliente() {
		Entidades cl = new Entidades("0804514875","Jose","1");
		return cl;
	}
	
	@Path("ins")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Entidades clienteI) {
		System.out.println("Cliente nuevo>>>>>>>>>>>>>>>>>>>>"+clienteI);
		ClientesBDD cli = new ClientesBDD();
		cli.insertar(clienteI);
	}
	
	@Path("act")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Entidades clienteI) {
		System.out.println("Cliente actualizado>>>>>>>>>>>>>>>>>>>>"+clienteI);
	}
}


