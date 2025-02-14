# CRUD API REST con Spring Boot

Este proyecto es una API REST desarrollada en Java con Spring Boot que implementa operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para gestionar usuarios. La aplicación utiliza H2 como base de datos en memoria para pruebas y Swagger para la documentación interactiva de la API.

## Tecnologías y Herramientas Utilizadas

- **Java 17**: Lenguaje de programación principal.
- **Spring Boot 3.x**: Framework para desarrollar aplicaciones web de manera rápida.
- **Spring Web**: Para exponer endpoints REST.
- **Spring Data JPA**: Para el manejo del acceso a datos a través de repositorios.
- **H2 Database**: Base de datos en memoria para pruebas y desarrollo.
- **SpringDoc OpenAPI (Swagger)**: Para generar y visualizar la documentación de la API.
- **Lombok**: Para reducir el código boilerplate en las entidades (getters, setters, constructores, etc.).
- **Maven**: Herramienta de gestión y construcción del proyecto.
- **Spring Boot DevTools**: Facilita el desarrollo con reinicio automático de la aplicación.

## Descripción

La aplicación expone endpoints REST para gestionar usuarios. Las operaciones incluyen:
- **GET /api/usuarios**: Listar todos los usuarios.
- **GET /api/usuarios/{id}**: Obtener un usuario por ID.
- **POST /api/usuarios**: Crear un nuevo usuario.
- **PUT /api/usuarios/{id}**: Actualizar un usuario existente.
- **DELETE /api/usuarios/{id}**: Eliminar un usuario.

## Configuración de Perfiles

El proyecto utiliza dos archivos de propiedades:
- **application-dev.properties**: Configuración para desarrollo (usa H2).
- **application-prod.properties**: Configuración para producción (por ejemplo, para conectar con PostgreSQL).

Puedes seleccionar el perfil deseado al iniciar la aplicación mediante el argumento:
```bash
--spring.profiles.active=dev
o
--spring.profiles.active=prod

Ejecución
Desde la línea de comandos

Para ejecutar la aplicación en el perfil de desarrollo (H2):

mvn spring-boot:run -Dspring-boot.run.profiles=dev

Documentación de la API
Una vez que la aplicación esté en ejecución, puedes acceder a la documentación interactiva de Swagger en:

http://localhost:8080/swagger-ui.html

Consideraciones

    Lombok: Asegúrate de tener el plugin de Lombok instalado y habilitado en tu IDE para que se generen correctamente los métodos.
    Base de Datos: En entorno de desarrollo se utiliza H2. Para producción, configura application-prod.properties con los detalles de tu base de datos (por ejemplo, PostgreSQL).

Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar el proyecto, por favor abre un pull request o crea un issue.

Licencia

Este proyecto está bajo la Licencia MIT.


