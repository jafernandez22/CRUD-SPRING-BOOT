# API PRACTICA-1 ESTUDIANTES DE UNIVERSIDAD

API REST para la gestión de estudiantes, docentes y materias en una universidad.

## Estructura del Proyecto

```
src/main/java/org/universidad/api/
├── controller
│   ├── EstudianteController.java
│   ├── DocenteController.java
│   ├── MateriaController.java
├── dto
│   ├── DocenteDTO.java
│   ├── EstudianteDTO.java
│   ├── MateriaDTO.java
├── model
│   ├── Docente.java
│   ├── Estudiante.java
│   ├── Materia.java
│   └── Persona.java
├── repository
│   ├── EstudianteRepository.java
├── service
│   ├── IEstudianteService.java
│   └── impl
│       ├── EstudianteServiceImpl.java
└── UniversidadApplication.java
```

## Instalación

Clona el repositorio y ejecuta el siguiente comando:

```bash
git clone https://github.com/TU_USUARIO/CRUD-SPRING-BOOT.git
cd CRUD-SPRING-BOOT
mvn clean install
```

## Ejecución

Para ejecutar la aplicación, usa:

```bash
mvn spring-boot:run
```
La API como tal estará disponible en: `http://localhost:8080/api/estudiantes`

## Endpoints Principales

### Estudiantes
- `GET /estudiantes` - Obtener todos los estudiantes
- `PUT /estudiantes/id(Ejemplo: 1)` - Actualizar un estudiante por ID
- `POST /estudiantes` - Crear un nuevo estudiante (Introduce datos nuevos POSTMAN: body/raw)
- `DELETE /estudiantes/id(Ejemplo: 1)` - Elimina un nuevo estudiante 


## Tecnologías Utilizadas

- **Spring Boot 3.4.4**
- **Java 23**
- **Maven**

## Repositorio GitHub

[Enlace al repositorio]()

