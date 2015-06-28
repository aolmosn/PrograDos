/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.modelo;

/**
 *
 * @author Cubil
 */
public class Solicitud extends Objeto{
    private int rutSolicitud;
    private String nombreSolicitud;
    private String correoSolicitud;
    private int idObjetoSolicitud;
    private String estadoSolicitud;
    private String nomMiembroSolicitud;

    public int getRutSolicitud() {
        return rutSolicitud;
    }

    public void setRutSolicitud(int rutSolicitud) {
        this.rutSolicitud = rutSolicitud;
    }

    public String getNombreSolicitud() {
        return nombreSolicitud;
    }

    public void setNombreSolicitud(String nombreSolicitud) {
        this.nombreSolicitud = nombreSolicitud;
    }

    public String getCorreoSolicitud() {
        return correoSolicitud;
    }

    public void setCorreoSolicitud(String correoSolicitud) {
        this.correoSolicitud = correoSolicitud;
    }

    public int getIdObjetoSolicitud() {
        return idObjetoSolicitud;
    }

    public void setIdObjetoSolicitud(int idObjetoSolicitud) {
        this.idObjetoSolicitud = idObjetoSolicitud;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public String getNomMiembroSolicitud() {
        return nomMiembroSolicitud;
    }

    public void setNomMiembroSolicitud(String nomMiembroSolicitud) {
        this.nomMiembroSolicitud = nomMiembroSolicitud;
    }
    
}
