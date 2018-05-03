package mx.com.cinepolis.scheduler.service.impl;

import mx.com.cinepolis.scheduler.commons.to.*;
import mx.com.cinepolis.scheduler.service.CatalogService;
import mx.com.cinepolis.scheduler.service.GithubService;

import java.util.ArrayList;
import java.util.List;

public class CatalogServiceImpl implements CatalogService {

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTO getUser() {
        UserTO userTO = new UserTO();
        userTO.setIdUser(1L);
        userTO.setName("Javier");
        userTO.setEmail("francisco.rodriguez@axity.com.mx");
        userTO.setUserName("jrodriguez");
        return userTO;
    }

    @Override
    public List<CatalogsTO> getEstados(String pais) {
        List<CatalogsTO> catalogsTOList = new ArrayList<CatalogsTO>();
        if(pais.equals("Mexico")){
            catalogsTOList.add(new CatalogsTO(){{
                setId(1);
                setName("Puebla");
            }});
            catalogsTOList.add(new CatalogsTO(){{
                setId(2);
                setName("Aguascalientes");
            }});
            catalogsTOList.add(new CatalogsTO(){{
                setId(3);
                setName("Guadalajara");
            }});
        }else if(pais.equals("USA")){
            catalogsTOList.add(new CatalogsTO(){{
                setId(1);
                setName("Texas");
            }});
            catalogsTOList.add(new CatalogsTO(){{
                setId(2);
                setName("New York");
            }});
            catalogsTOList.add(new CatalogsTO(){{
                setId(3);
                setName("Miami");
            }});
        }
        return catalogsTOList;
    }

    @Override
    public List<CalotogVideoJuegos> getVideojuegos(String tipo) {
        List<CalotogVideoJuegos> calotogVideoJuegosList = new ArrayList<>();
        if (tipo.equals("Action")){
            calotogVideoJuegosList.add(new CalotogVideoJuegos(){{
                setId(1);
                setVideojuego("Call of Duty");
            }});
            calotogVideoJuegosList.add(new CalotogVideoJuegos(){{
                setId(2);
                setVideojuego("Fallout");
            }});
        }
        return calotogVideoJuegosList;
    }

    @Override
    public GithubUserTO validateUser(String user, String password) {
        GithubUserTO githubUserTO = new GithubUserTO();
        if(user.equals("Urbano") && password.equals("axity")){
            githubUserTO.setName("Urbano");
            githubUserTO.setLogin("UrbanRude");
            githubUserTO.setAvatar_url("https://www.google.com.mx/imgres?imgurl=https%3A%2F%2");
            githubUserTO.setFollowers(10);
            githubUserTO.setFollowing(12);
            githubUserTO.setValidate(true);
        }
        return githubUserTO;
    }

    @Override
    public FormularioTO addUser(FormularioTO formularioTO) {
        return formularioTO;
    }

}
