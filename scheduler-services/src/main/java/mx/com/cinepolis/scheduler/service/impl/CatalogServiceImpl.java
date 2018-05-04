package mx.com.cinepolis.scheduler.service.impl;

import mx.com.arquitectura.base.model.UserDO;
import mx.com.cinepolis.scheduler.commons.to.*;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserDAO;
import mx.com.cinepolis.scheduler.service.CatalogService;
import mx.com.cinepolis.scheduler.service.GithubService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogServiceImpl implements CatalogService {

    @Inject
    private UserDAO userDAO;

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTO getUser() {
        UserTO userTO = new UserTO();
        userTO.setIdUser(1L);
        userTO.setName("Urbano Ceron");
        userTO.setAvatarUrl("");
        userTO.setFollowers(1);
        userTO.setFollowing(1);
        userTO.setLogin("UrbanRude");
        return userTO;
    }

    @Override
    public List<CatalogsTO> getEstados(String pais) {
        List<CatalogsTO> catalogsTOList = new ArrayList<CatalogsTO>();
        if (pais.equals("Mexico")) {
            catalogsTOList.add(new CatalogsTO() {{
                setId(1);
                setName("Puebla");
            }});
            catalogsTOList.add(new CatalogsTO() {{
                setId(2);
                setName("Aguascalientes");
            }});
            catalogsTOList.add(new CatalogsTO() {{
                setId(3);
                setName("Guadalajara");
            }});
        } else if (pais.equals("USA")) {
            catalogsTOList.add(new CatalogsTO() {{
                setId(1);
                setName("Texas");
            }});
            catalogsTOList.add(new CatalogsTO() {{
                setId(2);
                setName("New York");
            }});
            catalogsTOList.add(new CatalogsTO() {{
                setId(3);
                setName("Miami");
            }});
        }
        return catalogsTOList;
    }

    @Override
    public List<CalotogVideoJuegos> getVideojuegos(String tipo) {
        List<CalotogVideoJuegos> calotogVideoJuegosList = new ArrayList<>();
        if (tipo.equals("Action")) {
            calotogVideoJuegosList.add(new CalotogVideoJuegos() {{
                setId(1);
                setVideojuego("Call of Duty");
            }});
            calotogVideoJuegosList.add(new CalotogVideoJuegos() {{
                setId(2);
                setVideojuego("Fallout");
            }});
        }
        return calotogVideoJuegosList;
    }

    @Override
    public GithubUserTO validateUser(String user, String password) {
        GithubUserTO githubUserTO = new GithubUserTO();
        if (user.equals("Urbano") && password.equals("axity")) {
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

    @Override
    public List<UserTO> getAllUsers() {
        List<UserDO> userDOList = userDAO.findAll();
        return userDOList
                .stream()
                .map(x -> new UserTO() {{
                            setIdUser(x.getIdUser());
                            setLogin(x.getLogin());
                            setAvatarUrl(x.getAvatarUrl());
                            setName(x.getName());
                            setFollowers(x.getFollowing());
                            setFollowing(x.getFollowing());

                        }}
                ).collect(Collectors.toList());
    }


}
