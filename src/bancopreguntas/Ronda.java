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
public class Ronda {
    
        private int nivelDificultad;
        private Categoria categoria;
        private int puntaje;
        private boolean estado;

    public Ronda(int nivelDificultad, Categoria categoria) {
        this.nivelDificultad = nivelDificultad;
        this.categoria = categoria;
        this.puntaje = nivelDificultad*25;
        this.estado=false;
    }

    
    /**
     * @return the nivelDificultad
     */
    public int getNivelDificultad() {
        return nivelDificultad;
    }

    /**
     * @param nivelDificultad the nivelDificultad to set
     */
    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
        
        
        
        

}
