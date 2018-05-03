package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class FormularioTO implements Serializable {

    private static final long serialVersionUID = -8853482566070473179L;

    private String user;
    private String password;
    private String userEmail;
    private String userName;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
