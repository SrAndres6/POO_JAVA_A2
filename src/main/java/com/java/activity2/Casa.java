package com.java.activity2;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Casa {

    private String direccion;
    private int habitaciones;
    private boolean tienePatio;
    private LocalDate fechaConstruccion;
    private BigDecimal avaluo;
    private boolean enVenta;

    public Casa() { // Constructor por defecto
        this.direccion = "Desconocida";
        this.habitaciones = 1;
        this.tienePatio = false;
        this.fechaConstruccion = LocalDate.of(2000, 1, 1);
        this.avaluo = BigDecimal.valueOf(50000);
        this.enVenta = false;
    }

    public Casa(String direccion, int habitaciones, boolean tienePatio,
                LocalDate fechaConstruccion, BigDecimal avaluo, boolean enVenta) {

        setDireccion(direccion);
        setHabitaciones(habitaciones);
        setTienePatio(tienePatio);
        setFechaConstruccion(fechaConstruccion);
        setAvaluo(avaluo);
        setEnVenta(enVenta);
    }

    // SETTERS con validaciones

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isBlank())
            throw new IllegalArgumentException("Dirección inválida.");
        this.direccion = direccion;
    }

    public int getHabitaciones() { return habitaciones; }

    public void setHabitaciones(int habitaciones) {
        if (habitaciones < 1 || habitaciones > 20)
            throw new IllegalArgumentException("Número de habitaciones inválido.");
        this.habitaciones = habitaciones;
    }

    public boolean isTienePatio() { return tienePatio; }

    public void setTienePatio(boolean tienePatio) { this.tienePatio = tienePatio; }

    public LocalDate getFechaConstruccion() { return fechaConstruccion; }

    public void setFechaConstruccion(LocalDate fechaConstruccion) {
        if (fechaConstruccion.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Fecha futura inválida.");
        this.fechaConstruccion = fechaConstruccion;
    }

    public BigDecimal getAvaluo() { return avaluo; }

    public void setAvaluo(BigDecimal avaluo) {
        if (avaluo.doubleValue() <= 0)
            throw new IllegalArgumentException("Avalúo inválido.");
        this.avaluo = avaluo;
    }

    public boolean isEnVenta() { return enVenta; }

    public void setEnVenta(boolean enVenta) { this.enVenta = enVenta; }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", habitaciones=" + habitaciones +
                ", tienePatio=" + tienePatio +
                ", fechaConstruccion=" + fechaConstruccion +
                ", avaluo=" + avaluo +
                ", enVenta=" + enVenta +
                '}';
    }
}
