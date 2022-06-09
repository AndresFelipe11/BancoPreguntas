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
    private ArrayList<Respuesta> respuestas;

    public Pregunta(int idPregunta, String pregunta, ArrayList<Respuesta> respuestas) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
        this.respuestas = new ArrayList<>();
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
     * @return the respuestas
     */
    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuestas to set
     */
    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    
    
    
    
}
