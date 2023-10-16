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

   ```bash
   mvn clean install
  ```

Ejecuta la aplicación:

   ```bash
   java -jar target/Mongo-1.0-SNAPSHOT.jar
  ```


Configuración

Puedes configurar la conexión a la base de datos MongoDB editando el archivo application.properties en el directorio src/main/resources/database/

properties

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=todolist

Asegúrate de que la base de datos configurada coincida con tu instancia de MongoDB.

## DIAGRAMA BASE DE DATOS MONGO
![image](https://github.com/Blue017/ToDoList/assets/115097453/e3f2cfc6-7450-42d2-b065-f35f6e0061ba)

## Diagrama de la aplicacion

# parte 1
![image](https://github.com/Blue017/ToDoList/assets/115097453/bd99b035-6778-47c2-9869-27b6e174b03b)
# parte 2
![image](https://github.com/Blue017/ToDoList/assets/115097453/f4ed4448-1386-433f-9099-0ea6c58871a0)

# en codigo mermaid

   ```bash
graph TD
    A[Inicio] --> B(Inicio de Sesión)
    B -->|Credenciales Correctas| C{Menú Principal}
    C -->|Crear Lista| D(Crear Nueva Lista)
    D --> E{Nueva Lista Creada}
    E -->|Sí| F{Crear Nueva Tarea}
    F -->|No| C
    F -->|Sí| G(Crear Nueva Tarea)
    G --> H{Nueva Tarea Creada}
    H -->|Sí| I{Actualizar Tarea}
    I -->|Sí| J(Actualizar Tarea)
    I -->|No| C
    J --> K{Tarea Actualizada}
    K -->|Sí| L{Eliminar Tarea}
    L -->|Sí| M(Eliminar Tarea)
    L -->|No| C
    M --> N{Tarea Eliminada}
    N -->|Sí| C
    N -->|No| L
    C -->|Eliminar Lista| O(Eliminar Lista)
    O --> P{Lista Eliminada}
    P -->|Sí| C
    P -->|No| O
  ```

## PROBLEMAS DURANTE EL DESARROLLO DEL PROGRAMA

0. **Problema**: Error “conexión DB, error de conexión con base de datos” 

   - **Solución**: El error se debía a que se accedía a la base de datos de mongo DB con una IP no validada en la base de datos para IP permitidas, la solución solo fue autorizar la nueva IP para la conexión a mongoDB Atlas  

1. **Problema**: Error "Constructor TaskUpdateUI in class TaskUpdateUI cannot be applied to given types". 

   - **Solución**: El error se debía a una incompatibilidad en los argumentos del constructor de `TaskUpdateUI`. Se agregó un nuevo argumento, pero al crear una instancia de `TaskUpdateUI`, no se pasó el argumento requerido, lo que causó el error. La solución consistió en ajustar la llamada al constructor para incluir el nuevo argumento necesario. 
  
2. **Problema**: Error "incompatible types: <anonymous Runnable> cannot be converted to TaskUI". 

   - **Solución**: Este error ocurrió al intentar crear una instancia de `TaskUI` en un contexto donde se esperaba un objeto de tipo `TaskUI`. La solución consistió en asegurarse de que la creación de la instancia se realizara dentro de la clase `TaskUI` o que se creara en un contexto donde fuera válida. 
  
3. **Problema**: Error "not an enclosing class: TaskUI". 

   - **Solución**: Este error se relacionó con la creación de una instancia de `TaskUI` en un contexto incorrecto. La solución implicó crear la instancia de `TaskUI` dentro del contexto adecuado, generalmente dentro de la propia clase `TaskUI`. 



Este proyecto ha sido desarrollado por

[@CARLOSGRCIAGRCIA](https://github.com/CARLOSGRCIAGRCIA)

