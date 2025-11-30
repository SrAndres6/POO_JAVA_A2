package com.java.activity2;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Transporte {

    // =====================================
    //            ATRIBUTOS
    // =====================================
    private String tipo;
    private int velocidadMax;
    private boolean electrico;
    private BigDecimal precio;
    private LocalDate fechaFabricacion;
    private Casa estacionamiento; // Objeto propio

    // =====================================
    //       CONSTRUCTOR VACÍO / DEFECTO
    // =====================================
    public Transporte() { // Constructor por defecto
        this.tipo = "Desconocido";
        this.velocidadMax = 0;
        this.electrico = false;
        this.precio = BigDecimal.valueOf(1000);
        this.fechaFabricacion = LocalDate.of(2020, 1, 1);
        this.estacionamiento = null;
    }

    // =====================================
    //    CONSTRUCTOR CON PARÁMETROS
    // =====================================
    public Transporte(String tipo, int velocidadMax, boolean electrico,
                      BigDecimal precio, LocalDate fechaFabricacion,
                      Casa estacionamiento) {

        setTipo(tipo);
        setVelocidadMax(velocidadMax);
        setElectrico(electrico);
        setPrecio(precio);
        setFechaFabricacion(fechaFabricacion);
        setEstacionamiento(estacionamiento);
    }

    // =====================================
    //           GETTERS / SETTERS
    // =====================================

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank())
            throw new IllegalArgumentException("El tipo no puede ser vacío.");
        this.tipo = tipo;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        if (velocidadMax < 0 || velocidadMax > 500)
            throw new IllegalArgumentException("Velocidad inválida.");
        this.velocidadMax = velocidadMax;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        if (precio == null || precio.doubleValue() <= 0 || precio.doubleValue() > 100000)
            throw new IllegalArgumentException("Precio fuera de rango.");
        this.precio = precio;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        if (fechaFabricacion.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("La fecha no puede ser futura.");
        this.fechaFabricacion = fechaFabricacion;
    }

    public Casa getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Casa estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    // =====================================
    //               toString
    // =====================================

    @Override
    public String toString() {
        return "Transporte{" +
                "tipo='" + tipo + '\'' +
                ", velocidadMax=" + velocidadMax +
                ", electrico=" + electrico +
                ", precio=" + precio +
                ", fechaFabricacion=" + fechaFabricacion +
                ", estacionamiento=" + (estacionamiento != null ? estacionamiento.getDireccion() : "Ninguno") +
                '}';
    }
}
