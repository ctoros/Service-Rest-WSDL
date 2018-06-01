package cl.syachile.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.cxf.jaxrs.ext.multipart.Multipart;

@Path("/restservice/")
@Produces
@Consumes
public interface GetMessage {
	@POST
	@Path("/execute/")
	@Produces
	@Consumes
	public String getMessageee(@Multipart String  input);
}