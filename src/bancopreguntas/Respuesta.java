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

   

    public Respuesta(int idRespuesta,boolean resultado, String respuesta, char literalABCD) {
        this.idRespuesta =idRespuesta;
        this.resultado = resultado;
        this.respuesta = respuesta;
        this.literalABCD = literalABCD;
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

   
    
    
    
    
}
