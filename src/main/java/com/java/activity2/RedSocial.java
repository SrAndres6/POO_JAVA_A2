package com.java.activity2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RedSocial {

    private String nombre;
    private int anioCreacion;
    private boolean activa;
    private LocalDate fechaUltimaActualizacion;
    private int usuarios;
    private List<String> publicaciones;

    public RedSocial() { // Constructor por defecto
        this.nombre = "Sin nombre";
        this.anioCreacion = 2010;
        this.activa = true;
        this.fechaUltimaActualizacion = LocalDate.now();
        this.usuarios = 0;
        this.publicaciones = new ArrayList<>();
    }

    public RedSocial(String nombre, int anioCreacion, boolean activa,
                     LocalDate fechaUltimaActualizacion, int usuarios,
                     List<String> publicaciones) {

        setNombre(nombre);
        setAnioCreacion(anioCreacion);
        setActiva(activa);
        setFechaUltimaActualizacion(fechaUltimaActualizacion);
        setUsuarios(usuarios);
        setPublicaciones(publicaciones);
    }

    // ===========================
    // GETTERS - SETTERS
    // ===========================

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("Nombre inválido.");
        this.nombre = nombre;
    }

    public int getAnioCreacion() { return anioCreacion; }

    public void setAnioCreacion(int anioCreacion) {
        if (anioCreacion < 1990 || anioCreacion > LocalDate.now().getYear())
            throw new IllegalArgumentException("Año inválido.");
        this.anioCreacion = anioCreacion;
    }

    public boolean isActiva() { return activa; }

    public void setActiva(boolean activa) { this.activa = activa; }

    public LocalDate getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(LocalDate fechaUltimaActualizacion) {
        if (fechaUltimaActualizacion.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Fecha futura no válida.");
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public int getUsuarios() { return usuarios; }

    public void setUsuarios(int usuarios) {
        if (usuarios < 0)
            throw new IllegalArgumentException("Usuarios no pueden ser negativos.");
        this.usuarios = usuarios;
    }

    public List<String> getPublicaciones() { return publicaciones; }

    public void setPublicaciones(List<String> publicaciones) {
        if (publicaciones == null)
            throw new IllegalArgumentException("La lista no puede ser nula.");
        this.publicaciones = publicaciones;
    }

    @Override
    public String toString() {
        return "RedSocial{" +
                "nombre='" + nombre + '\'' +
                ", anioCreacion=" + anioCreacion +
                ", activa=" + activa +
                ", fechaUltimaActualizacion=" + fechaUltimaActualizacion +
                ", usuarios=" + usuarios +
                ", publicaciones=" + publicaciones +
                '}';
    }
}
