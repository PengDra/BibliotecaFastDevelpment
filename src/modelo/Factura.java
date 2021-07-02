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
    private int precio_neto;
    private int precio_iva;
    private int costo_iva;
    private String fecha_compra;
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

    public int getPrecio_neto() {
        return precio_neto;
    }

    public void setPrecio_neto(int precio_neto) {
        this.precio_neto = precio_neto;
    }

    public int getPrecio_iva() {
        return precio_iva;
    }

    public void setPrecio_iva(int precio_iva) {
        this.precio_iva = precio_iva;
    }

    public int getCosto_iva() {
        return costo_iva;
    }

    public void setCosto_iva(int costo_iva) {
        this.costo_iva = costo_iva;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
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
