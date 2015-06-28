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
public class Solicitud {
    private int rut;
    private String nombre;
    private String correo;
    private int idObjeto;
    private String estado;
    private String nomMiembro;

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomMiembro() {
        return nomMiembro;
    }

    public void setNomMiembro(String nomMiembro) {
        this.nomMiembro = nomMiembro;
    }
    
}
