package krakedev.com.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import krakedev.com.inventario.entidades.Categoria;
import krakedev.com.inventario.entidades.Producto;
@Path("productos")

public class ServiciosProducto {
	public ArrayList<Producto> listaP = new ArrayList<Producto>(3);
	
	@Override
	public String toString() {
		return "ServiciosProducto [Listado= Producto 1" + listaP.get(0) + "Producto 2" + listaP.get(1) + "Producto 3" + listaP.get(2)+"]";
	}
	
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println("Producto recibido---->>>>"+producto);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("Producto actualizado---->>>>"+producto);
	}
	
	@Path("consultar")
	@GET
	public void recuperarTodos() {
		Categoria c1 = new Categoria("CAT1",001);
		Categoria c2 = new Categoria("CAT2",002);
		Categoria c3 = new Categoria("CAT3",003);
		Producto p1 = new Producto("123","Dorito",c1,2.3,3);
		Producto p2 = new Producto("567","Rufles",c2,2.5,3);
		Producto p3 = new Producto("888","Chitos",c3,3.3,3);

		listaP.add(p1);
		listaP.add(p2);
		listaP.add(p3);
		
		System.out.println(listaP);
		
	}
	

}
