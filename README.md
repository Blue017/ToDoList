# ToDoList - Aplicación de Lista de Tareas



ToDoList es una aplicación de lista de tareas simple que te permite gestionar tus tareas diarias. Puedes agregar, editar y eliminar tareas, así como marcarlas como completadas. La aplicación está escrita en Java y utiliza una base de datos MongoDB para almacenar tus tareas.

## Características

- Agregar nuevas tareas con descripción y fecha de vencimiento.
- Editar tareas existentes.
- Marcar tareas como completadas.
- Eliminar tareas.
- Iniciar sesión y registrarse como usuario.
- Seguridad de contraseñas con almacenamiento seguro.
- Interfaz de usuario amigable.

## Requisitos previos

Para ejecutar esta aplicación en tu máquina, debes tener instalados los siguientes requisitos:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MongoDB](https://docs.mongodb.com/manual/installation/)

## Instalación y Ejecución

1. Clona este repositorio en tu máquina local:

   ```bash
   https://github.com/Blue017/ToDoList.git
Ve al directorio del proyecto:


cd ToDoList

Compila el proyecto utilizando Maven:

mvn clean install

Ejecuta la aplicación:


java -jar target/Mongo-1.0-SNAPSHOT.jar

Abre tu navegador web y accede a la aplicación en http://localhost:8080.

Configuración

Puedes configurar la conexión a la base de datos MongoDB editando el archivo application.properties en el directorio src/main/resources.

properties

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=todolist

Asegúrate de que la base de datos configurada coincida con tu instancia de MongoDB.



Este proyecto ha sido desarrollado por

[@CARLOSGRCIAGRCIA](https://github.com/CARLOSGRCIAGRCIA)

