package com.example.taller6.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @Column(name = "cod_producto", length = 5, nullable = false)
    private String codProducto;

    @Column(name = "descripcion", length = 30)
    private String descripcion;

    @Column(name = "precio_unitario", precision = 9, scale = 2)
    private int precioUnitario;

    //Contructors
    public Producto() {
    }

    public Producto(String codProducto, String descripcion, int precioUnitario) {
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    // Getters and Setters
    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
