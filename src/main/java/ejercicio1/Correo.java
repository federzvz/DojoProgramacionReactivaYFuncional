package ejercicio1;

import java.util.Objects;

public class Correo {
    String correo;
    boolean estado;
    boolean recibido;

    public Correo(String correo, boolean recibido) {
        this.correo = correo;
        this.recibido = recibido;
    }

    public Correo() {
    }

    public String Correo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEnviado() {
        return recibido;
    }

    public void setEnviado(boolean recibido) {
        this.recibido = recibido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isRecibido() {
        return recibido;
    }

    public void setRecibido(boolean recibido) {
        this.recibido = recibido;
    }

    @Override
    public String toString() {
        return "Correo{" +
                "correo='" + correo + '\'' +
                ", enviado=" + recibido +
                '}';
    }
}
