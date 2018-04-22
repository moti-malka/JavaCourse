package gradespackage;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/event")
public class GradesController {
	
	@GET
	@Path("/all")
	public String getAllEvents() {
		
		Grades moti = new Grades();
		String p = "moti malka the king";
		return p;
	}
}