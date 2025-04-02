package com.universidad.service; // Define el paquete al que pertenece esta interfaz

import com.universidad.dto.EstudianteDTO; // Importa la clase EstudianteDTO del paquete dto

import java.util.List; // Importa la interfaz List para manejar listas
import java.util.Optional;

public interface IEstudianteService { // Define la interfaz IEstudianteService
    
    List<EstudianteDTO> obtenerTodosLosEstudiantes(); // Método para obtener una lista de todos los EstudianteDTO
    Optional<EstudianteDTO> obtenerEstudiantePorId(Long id);

    //A Actualizar Estudiante
    EstudianteDTO actualizarEstudiant(Long id, EstudianteDTO estudianteDTO);

    //B crear  nuevo estudiante
    EstudianteDTO crearEstudiantenuv(EstudianteDTO estudianteDTO);
    //C eliminar un estudiante
    boolean eliminarEstudiante(Long id);
}