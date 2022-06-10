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
public class Respuesta {
    
    private int idRespuesta;
    private boolean resultado;
    private String respuesta;
    private char literalABCD;
    private int idPregunta;

    public Respuesta() {
    }

   

    public Respuesta(int idRespuesta,boolean resultado, String respuesta, char literalABCD, int idPregunta) {
        this.idRespuesta =idRespuesta;
        this.resultado = resultado;
        this.respuesta = respuesta;
        this.literalABCD = literalABCD;
        this.idPregunta= idPregunta;
    }
    
    
    
     /**
     * @return the idRespuesta
     */
    public int getIdRespuesta() {
        return idRespuesta;
    }

    /**
     * @return the resultado
     */
    public boolean isResultado() {
        return resultado;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @return the literalABCD
     */
    public char getLiteralABCD() {
        return literalABCD;
    }

    /**
     * @param idRespuesta the idRespuesta to set
     */
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @param literalABCD the literalABCD to set
     */
    public void setLiteralABCD(char literalABCD) {
        this.literalABCD = literalABCD;
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


    
    
    
}
