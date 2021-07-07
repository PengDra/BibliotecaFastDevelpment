/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author MegaJoc
 */
public class Factura {
    private int id_factura;
    private int folio;
    private double precio_neto;
    private double precio_iva;
    private double costo_iva;
    private int fecha_compra;
    private int hora_compra;
    private int id_dist;
    private int metodo_pago;

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public double getPrecio_neto() {
        return precio_neto;
    }

    public void setPrecio_neto(int precio_neto) {
        this.precio_neto = precio_neto;
    }

    public double getPrecio_iva() {
        return precio_iva;
    }

    public void setPrecio_iva(int precio_iva) {
        this.precio_iva = precio_iva;
    }

    public double getCosto_iva() {
        return costo_iva;
    }

    public void setCosto_iva(int costo_iva) {
        this.costo_iva = costo_iva;
    }

    public int getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(int fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getHora_compra() {
        return hora_compra;
    }

    public void setHora_compra(int hora_compra) {
        this.hora_compra = hora_compra;
    }

    public int getId_dist() {
        return id_dist;
    }

    public void setId_dist(int id_dist) {
        this.id_dist = id_dist;
    }

    public int getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(int metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
}
