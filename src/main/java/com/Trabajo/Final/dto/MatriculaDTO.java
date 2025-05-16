package com.Trabajo.Final.dto;

public class MatriculaDTO {

    private Long id;  // ✅ Necesario para editar/eliminar

    private String nombreApoderado;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String numeroDocumentoApoderado;
    private String correoElectronico;
    private String direccion;
    private String telefono;

    private String nombreAlumno;
    private String apellidoPaternoAlumno;
    private String apellidoMaternoAlumno;
    private String numeroDocumentoAlumno;

    private String nivel;
    private String grado;
    private String turno;
    private String sede;

    // ✅ Getters y Setters para 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters y Setters para 'nombreApoderado'
    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }

    // Getters y Setters para 'apellidoPaterno'
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    // Getters y Setters para 'apellidoMaterno'
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    // Getters y Setters para 'numeroDocumentoApoderado'
    public String getNumeroDocumentoApoderado() {
        return numeroDocumentoApoderado;
    }

    public void setNumeroDocumentoApoderado(String numeroDocumentoApoderado) {
        this.numeroDocumentoApoderado = numeroDocumentoApoderado;
    }

    // Getters y Setters para 'correoElectronico'
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // Getters y Setters para 'direccion'
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getters y Setters para 'telefono'
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Getters y Setters para 'nombreAlumno'
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    // Getters y Setters para 'apellidoPaternoAlumno'
    public String getApellidoPaternoAlumno() {
        return apellidoPaternoAlumno;
    }

    public void setApellidoPaternoAlumno(String apellidoPaternoAlumno) {
        this.apellidoPaternoAlumno = apellidoPaternoAlumno;
    }

    // Getters y Setters para 'apellidoMaternoAlumno'
    public String getApellidoMaternoAlumno() {
        return apellidoMaternoAlumno;
    }

    public void setApellidoMaternoAlumno(String apellidoMaternoAlumno) {
        this.apellidoMaternoAlumno = apellidoMaternoAlumno;
    }

    // Getters y Setters para 'numeroDocumentoAlumno'
    public String getNumeroDocumentoAlumno() {
        return numeroDocumentoAlumno;
    }

    public void setNumeroDocumentoAlumno(String numeroDocumentoAlumno) {
        this.numeroDocumentoAlumno = numeroDocumentoAlumno;
    }

    // Getters y Setters para 'nivel'
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    // Getters y Setters para 'grado'
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    // Getters y Setters para 'turno'
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // Getters y Setters para 'sede'
    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
