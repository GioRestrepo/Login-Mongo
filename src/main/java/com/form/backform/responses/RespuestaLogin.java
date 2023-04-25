package com.form.backform.responses;

public class RespuestaLogin {
   public String mensaje;

    public RespuestaLogin(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
