package enums;

public enum Mensaje {

    MSG_ERR("El proceso no fue el esperado");
    String mensaje;

    private Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
