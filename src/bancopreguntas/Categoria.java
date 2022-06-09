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
public class Categoria {
    
    private int idCategoria;
    private String categoria;
    private ArrayList<Pregunta> preguntas;

    public Categoria(int idCategoria,String categoria, ArrayList<Pregunta> preguntas) {
        this.idCategoria = idCategoria;
        this.categoria = categoria;
        this.preguntas = new ArrayList<>();
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the preguntas
     */
    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    /**
     * @param preguntas the preguntas to set
     */
    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

 
    
    
    
}
