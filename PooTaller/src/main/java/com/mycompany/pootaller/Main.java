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
public class Main {

    public static void main(String[] args) {
        crear();
        read();
        update();
        delete();
    }

    public static void crear() {
        DaoOrden daoOrden = new DaoOrden();
        Orden orden = new Orden(1, 0, 0, new Date(1999, 1, 2), 20);
        daoOrden.setup();
        daoOrden.crear(orden);
        // Orden orden = new Orden(2, 1, 2, new Date(1999, 1, 2), 20);
        daoOrden.crear(orden);
    }

    public static void read() {
        DaoOrden daoOrden = new DaoOrden();
        daoOrden.setup();
        Orden orden = daoOrden.read(1);
        orden.imprimir();
    }

    public static void update() {

        DaoOrden daoOrden = new DaoOrden();
        daoOrden.setup();
        Orden orden = daoOrden.read(1);
        orden.setFechaorden(new Date(1999, 4, 15));
        daoOrden.update(orden);
    }

    public static void delete() {
        DaoOrden daoOrden = new DaoOrden();
        daoOrden.setup();
        daoOrden.delete(1);
        daoOrden.delete(2);
    }
}
