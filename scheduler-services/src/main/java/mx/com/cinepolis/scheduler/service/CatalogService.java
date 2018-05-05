package mx.com.cinepolis.scheduler.service;

import mx.com.arquitectura.base.model.UserDO;
import mx.com.cinepolis.scheduler.commons.to.*;

import java.util.List;

/**
 * @author jrodriguez
 */
public interface CatalogService {

    /**
     *
     * @return User
     */
    UserTO getUser();

    /**
     * Retorna la lista de estados de un pais
     * @param pais acepta un pais como string
     * @return Lista de estados
     */
    List<CatalogsTO> getEstados(String pais);

    List<CalotogVideoJuegos> getVideojuegos(String tipo);

    GithubUserTO validateUser(String user, String password);

    FormularioTO addUser(FormularioTO formularioTO);

    /**
     * Retorna la lista de los usuarios de la bd
     * @return Lista de usuarios
     */

    List<UserTO>  getAllUsers();
    ValidateTO getAltaUser(UserTO userTO);
    UserTO getUserParticular(long idUser);

}
