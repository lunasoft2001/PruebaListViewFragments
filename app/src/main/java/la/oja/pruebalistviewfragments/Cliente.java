package la.oja.pruebalistviewfragments;

import android.os.Bundle;

/**
 * Created by luna-aleixos on 20.04.2016.
 */
public class Cliente {

//    //Constantes para referenciar los campos
//    public static final String ID_CLIENTE = "_id";
//    public static final String NOMBRE = "nombre";
//    public static final String DIRECCION = "direccion";
//    public static final String TELEFONO = "telefono";

    //Campos privados
    private int idCliente;
    private String nombreCliente;
    private String direccionCliente;
    private String telefonoCliente;


    // getters y setters


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Cliente(int idCliente, String nombreCliente, String direccionCliente, String telefonoCliente){
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
    }

}
