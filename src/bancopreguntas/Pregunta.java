/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopreguntas;

import java.util.ArrayList;

/**
 *
 * @author Pipe
 */
public class Pregunta {
    
    private int idPregunta;
    private String pregunta;
    private Ronda ronda;

    public Pregunta() {
    }
    

    

    public Pregunta(int idPregunta, String pregunta, Ronda ronda) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
        this.ronda=ronda;
    }

    /**
     * @return the idPregunta
     */
    public int getIdPregunta() {
        return idPregunta;
    }

    /**
     * @param idPregunta the idPregunta to set
     */
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the ronda
     */
    public Ronda getRonda() {
        return ronda;
    }

    /**
     * @param ronda the ronda to set
     */
    public void setRonda(Ronda ronda) {
        this.ronda = ronda;
    }

    /**
     * @return the respuestas
     */


    
    
    
    
}
