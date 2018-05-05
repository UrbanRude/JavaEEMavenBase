package mx.com.cinepolis.schedule.rest;

import com.sun.jndi.toolkit.url.Uri;
import mx.com.arquitectura.base.model.UserDO;
import mx.com.cinepolis.scheduler.commons.to.*;
import mx.com.cinepolis.scheduler.facade.CatalogFacadeEJB;
import mx.com.cinepolis.scheduler.facade.GithubFacadeEJB;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

/**
 * @author jrodriguez
 */
@Path("/catalog")
public class CatalogRest {

    @EJB
    private CatalogFacadeEJB catalogFacadeEJB;

    @EJB
    private GithubFacadeEJB githubFacadeEJB;

    @GET
    @Produces("application/json")
    @Path("/user")
    public Response getSimpleCatalog()
    {
        UserTO userTO = catalogFacadeEJB.getSimpleUser();
        return Response.ok().entity(userTO).build();
    }

    @GET
    @Produces("application/json")
    @Path("/userGit/{user}")
    public Response getUserGit(@PathParam("user") String user){
        GithubUserTO githubUserTO = githubFacadeEJB.getUserGit(user);
        return Response.ok().entity(githubUserTO).build();
    }


    @GET
    @Produces("application/json")
    @Path("/country")
    public Response getEstadosQuery(@Context UriInfo uri){

        MultivaluedMap<String,String> queryParams = uri.getQueryParameters();
        String pais = queryParams.getFirst("pais");

        List<CatalogsTO> catalogsTOList = catalogFacadeEJB.getEstados(pais);
        GenericEntity<List<CatalogsTO>> entity = new GenericEntity<List<CatalogsTO>>(catalogsTOList){};
        return Response.ok().entity(entity).build();
    }

    @GET
    @Produces("application/json")
    @Path("/login")
    public Response getValidateUser(@Context UriInfo uri){
        MultivaluedMap<String,String> queryParams = uri.getQueryParameters();
        String user = queryParams.getFirst("user");
        String pass = queryParams.getFirst("pass");
        GithubUserTO githubUserTO = catalogFacadeEJB.validateUser(user,pass);
        return Response.ok().entity(githubUserTO).build();
    }


    @GET
    @Produces("application/json")
    @Path("/country/{pais}")
    public Response getEstados(@PathParam("pais") String pais){
        List<CatalogsTO> catalogsTOList = catalogFacadeEJB.getEstados(pais);
        GenericEntity<List<CatalogsTO>> entity = new GenericEntity<List<CatalogsTO>>(catalogsTOList){};
        return Response.ok().entity(entity).build();
    }

    @GET
    @Produces("application/json")
    @Path("/game/{tipo}")
    public Response getVideoJuegos(@PathParam("tipo") String tipo){
        List<CalotogVideoJuegos> calotogVideoJuegosList = catalogFacadeEJB.getCalotogVideoJuegos(tipo);
        GenericEntity<List<CalotogVideoJuegos>> entity = new GenericEntity<List<CalotogVideoJuegos>>(calotogVideoJuegosList){};
        return Response.ok().entity(entity).build();
    }

    @GET
    @Produces("application/json")
    @Path("/search/{user}")
    public Response getUserById(@PathParam("user") long idUser){
        UserTO userTO = catalogFacadeEJB.getUserById(idUser);
        return Response.ok().entity(userTO).build();
    }

    @POST
    @Produces("application/json")
    @Path("/alta")
    public Response getAddUser(FormularioTO formularioTO){
        FormularioTO formularioTO1 = catalogFacadeEJB.getAddUser(formularioTO);
        return Response.ok().entity(formularioTO1).build();
    }

    @GET
    @Produces("application/json")
    @Path("/users")
    public Response getAllUser(){
        List<UserTO> userTOList = catalogFacadeEJB.getAllUsers();
        GenericEntity<List<UserTO>> entity = new GenericEntity<List<UserTO>>(userTOList){};
        return Response.ok().entity(entity).build();
    }

    @POST
    @Produces("application/json")
    @Path("/create")
    public Response getAddUserPost(UserTO userTO){
        ValidateTO validateTO = catalogFacadeEJB.getAltaUser(userTO);
        return Response.ok().entity(validateTO).build();
    }

}
