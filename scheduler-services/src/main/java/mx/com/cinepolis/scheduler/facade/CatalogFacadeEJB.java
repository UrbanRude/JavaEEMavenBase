package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.*;
import mx.com.cinepolis.scheduler.service.CatalogService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
@LocalBean
public class CatalogFacadeEJB {

    @Inject
    CatalogService catalogService;

    public UserTO getSimpleUser()
    {
        return catalogService.getUser();
    }

    public List<CatalogsTO> getEstados(String pais){ return catalogService.getEstados(pais);}

    public  List<CalotogVideoJuegos> getCalotogVideoJuegos(String tipo){return  catalogService.getVideojuegos(tipo);}

    public GithubUserTO validateUser(String user, String password){ return  catalogService.validateUser(user,password);}

    public FormularioTO getAddUser(FormularioTO formularioTO){return catalogService.addUser(formularioTO);}
}
