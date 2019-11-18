/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pootaller;

import java.sql.Date;

/**
 *
 * @author Home
 */
public class Orden {

    private int Ordenid;
    private int Empleadoid;
    private int Clienteid;
    private Date fechaorden;
    private double descuento;

    public Orden(int Ordenid, int Empleadoid, int Clienteid, Date fechaorden, double descuento) {
        this.Ordenid = Ordenid;
        this.Empleadoid = Empleadoid;
        this.Clienteid = Clienteid;
        this.fechaorden = fechaorden;
        this.descuento = descuento;
    }

    public Orden() {
    }
    
    public int getOrdenid() {
        return Ordenid;
    }

    public void setOrdenid(int Ordenid) {
        this.Ordenid = Ordenid;
    }

    public int getEmpleadoid() {
        return Empleadoid;
    }

    public void setEmpleadoid(int Empleadoid) {
        this.Empleadoid = Empleadoid;
    }

    public int getClienteid() {
        return Clienteid;
    }

    public void setClienteid(int Clienteid) {
        this.Clienteid = Clienteid;
    }

    public Date getFechaorden() {
        return fechaorden;
    }

    public void setFechaorden(Date fechaorden) {
        this.fechaorden = fechaorden;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
}
