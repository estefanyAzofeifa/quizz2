/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz;

/**
 *
 * @author estef
 */
public class Cancion {
public int id;
public String titulo;
public String autor;
public int duracion;
public int anioCreacion;

    Cancion() {
        }
    public void Cancion(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Cancion(int id, String titulo, String autor, int duracion, int anioCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anioCreacion = anioCreacion;
    }

    }


