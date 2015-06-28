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
public class Seleccion {
    private String acronimo;
    private String pais;
    private String nomFederacion;
    private String nomMiembro;

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNomFederacion() {
        return nomFederacion;
    }

    public void setNomFederacion(String nomFederacion) {
        this.nomFederacion = nomFederacion;
    }

    public String getNomMiembro() {
        return nomMiembro;
    }

    public void setNomMiembro(String nomMiembro) {
        this.nomMiembro = nomMiembro;
    }
    
}
