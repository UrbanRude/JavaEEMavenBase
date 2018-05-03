package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class CalotogVideoJuegos implements Serializable {

    private static final long serialVersionUID = -8853432566070472168L;

    private int id;
    private String videojuego;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(String videojuego) {
        this.videojuego = videojuego;
    }
}
