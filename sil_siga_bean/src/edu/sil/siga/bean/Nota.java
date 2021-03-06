/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.siga.bean;

import java.util.Date;

/**
 *
 * @author Eduardo Lopez
 */
public class Nota {
    int id;
    Alumno alumno;
    Clase clase;
    Periodo periodo;
    TipoEvaluacion tipoEvaluacion;
    int nota;
    Double peso; //en el BEAN siempre es UTIL
    Date fecha;

    
    public Nota(){
       this(0, new Alumno(), new Clase(), new Periodo(), new TipoEvaluacion(), 0 , 0.0, new Date());
    }

    public Nota(int id, Alumno alumno, Clase clase, Periodo periodo, TipoEvaluacion tipoEvaluacion, int nota, Double peso, Date fecha) {
        this.id = id;
        this.alumno = alumno;
        this.clase = clase;
        this.periodo = periodo;
        this.tipoEvaluacion = tipoEvaluacion;
        this.nota = nota;
        this.peso = peso;
        this.fecha = fecha;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public TipoEvaluacion getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public void setTipoEvaluacion(TipoEvaluacion tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
