package mx.com.cinepolis.scheduler.service.impl;

import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.service.CatalogService;

import java.util.ArrayList;
import java.util.List;

public class CatalogServiceImpl implements CatalogService{

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
}
