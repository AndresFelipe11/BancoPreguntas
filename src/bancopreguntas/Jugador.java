/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopreguntas;

/**
 *
 * @author Pipe
 */
public class Jugador {
    
    private int idJugador;
    private String nombreJugador;
    private int puntaje;
    private int intentos;    

    public Jugador(int idJugador, String nombreJugador, int puntaje, int intentos) {
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
        this.puntaje = puntaje;
        this.intentos = intentos;
    }

    /**
     * @return the idJugador
     */
    public int getIdJugador() {
        return idJugador;
    }

    /**
     * @param idJugador the idJugador to set
     */
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    /**
     * @return the nombreJugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * @param nombreJugador the nombreJugador to set
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }



    
    
}

