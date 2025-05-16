package com.Trabajo.Final.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trabajo.Final.dto.MatriculaDTO;
import com.Trabajo.Final.model.Alumno;
import com.Trabajo.Final.model.Apoderado;
import com.Trabajo.Final.model.DatosMatricula;
import com.Trabajo.Final.repository.AlumnoRepository;
import com.Trabajo.Final.repository.ApoderadoRepository;
import com.Trabajo.Final.repository.DatosMatriculaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DatosMatriculaService {

    @Autowired
    private ApoderadoRepository apoderadoRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private DatosMatriculaRepository datosMatriculaRepository;

    // Método para obtener todas las matrículas
    public List<MatriculaDTO> obtenerMatrículas() {
        List<MatriculaDTO> matrículas = new ArrayList<>();

        List<Apoderado> apoderados = apoderadoRepository.findAll();
        List<Alumno> alumnos = alumnoRepository.findAll();
        List<DatosMatricula> datosMatriculas = datosMatriculaRepository.findAll();

        for (int i = 0; i < apoderados.size(); i++) {
            MatriculaDTO matrícula = new MatriculaDTO();
            matrícula.setId(datosMatriculas.get(i).getId()); // Asegúrate de tener el ID
            matrícula.setNombreApoderado(apoderados.get(i).getNombres());
            matrícula.setApellidoPaterno(apoderados.get(i).getApellidoPaterno());
            matrícula.setApellidoMaterno(apoderados.get(i).getApellidoMaterno());
            matrícula.setNumeroDocumentoApoderado(apoderados.get(i).getNumeroDocumento());
            matrícula.setCorreoElectronico(apoderados.get(i).getCorreoElectronico());
            matrícula.setDireccion(apoderados.get(i).getDireccion());
            matrícula.setNombreAlumno(alumnos.get(i).getNombresAlumno());
            matrícula.setApellidoPaterno(alumnos.get(i).getApellidoPaternoAlumno());
            matrícula.setApellidoMaterno(alumnos.get(i).getApellidoMaternoAlumno());
            matrícula.setNumeroDocumentoAlumno(alumnos.get(i).getNumeroDocumentoAlumno());
            matrícula.setNivel(datosMatriculas.get(i).getNivel());
            matrícula.setGrado(datosMatriculas.get(i).getGrado());
            matrícula.setSede(datosMatriculas.get(i).getSede());
            matrícula.setTelefono(apoderados.get(i).getTelefonoMovil());
            matrículas.add(matrícula);
        }

        return matrículas;
    }

    // Método para actualizar matrícula
    public void actualizarMatricula(MatriculaDTO dto) {
        Optional<DatosMatricula> datosOpt = datosMatriculaRepository.findById(dto.getId());
        if (datosOpt.isPresent()) {
            DatosMatricula datos = datosOpt.get();
            datos.setNivel(dto.getNivel());
            datos.setGrado(dto.getGrado());
            datos.setSede(dto.getSede());
            datosMatriculaRepository.save(datos);
        }
    }

    // Método para eliminar matrícula
    public void eliminarMatricula(Long id) {
        datosMatriculaRepository.deleteById(id);
    }

    // Método para guardar matrícula (nuevo método agregado)
    public void guardarMatricula(MatriculaDTO matriculaDTO) {
        // Guardar Apoderado
        Apoderado apoderado = new Apoderado();
        apoderado.setNombres(matriculaDTO.getNombreApoderado());
        apoderado.setApellidoPaterno(matriculaDTO.getApellidoPaterno());
        apoderado.setApellidoMaterno(matriculaDTO.getApellidoMaterno());
        apoderado.setNumeroDocumento(matriculaDTO.getNumeroDocumentoApoderado());
        apoderado.setCorreoElectronico(matriculaDTO.getCorreoElectronico());
        apoderado.setDireccion(matriculaDTO.getDireccion());
        apoderado.setTelefonoMovil(matriculaDTO.getTelefono());

        // Guardar Alumno
        Alumno alumno = new Alumno();
        alumno.setNombresAlumno(matriculaDTO.getNombreAlumno());
        alumno.setApellidoPaternoAlumno(matriculaDTO.getApellidoPaterno());
        alumno.setApellidoMaternoAlumno(matriculaDTO.getApellidoMaterno());
        alumno.setNumeroDocumentoAlumno(matriculaDTO.getNumeroDocumentoAlumno());

        // Guardar Datos de Matrícula
        DatosMatricula datosMatricula = new DatosMatricula();
        datosMatricula.setNivel(matriculaDTO.getNivel());
        datosMatricula.setGrado(matriculaDTO.getGrado());
        datosMatricula.setSede(matriculaDTO.getSede());

        // Guardar en las tablas correspondientes
        apoderadoRepository.save(apoderado);
        alumnoRepository.save(alumno);
        datosMatriculaRepository.save(datosMatricula);
    }
}
