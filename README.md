# ToDoList - Aplicación de Lista de Tareas

## Tabla de Contenido

- [ToDoList - Aplicación de Lista de Tareas](#todolist---aplicación-de-lista-de-tareas)
  - [Características](#características)
  - [Requisitos previos](#requisitos-previos)
  - [Instalación y Ejecución](#instalación-y-ejecución)
  - [Instrucciones de Uso](#instrucciones-de-uso)
  - [Configuración](#configuración)
  - [DIAGRAMA BASE DE DATOS MONGO](#diagrama-base-de-datos-mongo)
  - [Diagrama de la aplicación](#diagrama-de-la-aplicación)
- [PROBLEMAS DURANTE EL DESARROLLO DEL PROGRAMA](#problemas-durante-el-desarrollo-del-programa)
- [USO LIBRE Y FUTURAS APLICACIONES](#uso-libre-y-futuras-actualizaciones)




ToDoList es una aplicación de lista de tareas simple que te permite gestionar tus tareas diarias. Puedes agregar, editar y eliminar tareas, así como marcarlas como completadas. La aplicación está escrita en Java y utiliza una base de datos MongoDB para almacenar tus tareas.

## Roles
- Carlos Garcia Garcia: Se centrará en la interfaz de usuario (UI) de la aplicación como tambien de diseñar y crear la estructura de la base de datos MongoDB para almacenar las tareas de la aplicación To-Do List, también se encargará de establecer la conexión entre la aplicación Java y la base de datos. Con respecto a la UI Su tarea será diseñar y desarrollar la apariencia visual de la aplicación, asegurándose de que sea atractiva y fácil de usar, trabajará en la disposición de elementos, colores, tipografía y otros aspectos visuales para proporcionar una experiencia de usuario agradable.

- Daniel Mercado Chambi: Se enfocará en la experiencia del usuario (UX) de la aplicación, su función principal será garantizar que la aplicación sea intuitiva y satisfactoria para los usuarios.

- Richard Ecos Marquez: Asumirá la responsabilidad de configurar el proyecto base en Apache NetBeans, esto incluye la creación de la estructura de directorios, la configuración del entorno de desarrollo y la gestión de las herramientas y dependencias necesarias para el desarrollo colaborativo del proyecto.

## Tegnologias
Para este proyecto, se emplearon dos tecnologías principales:
- MongoDB Atlas: Esta tecnología se utilizó para gestionar la base de datos del proyecto. 

- Apache NetBeans: Para la UI de la aplicación, se optó por Apache NetBeans, un entorno de desarrollo que facilitó la creación de una interfaz de usuario atractiva y funcional.

- Git Hub: Para el almacenamiento de la aplicacion como tambien para el trabajo colaborativo de este proyecto se uso GitHub

## Características

- Agregar nuevas tareas con descripción y fecha de vencimiento.
- Editar tareas existentes.
- Marcar tareas como completadas.
- Eliminar tareas.
- Iniciar sesión y registrarse como usuario.
- Seguridad de contraseñas con almacenamiento seguro.
- Interfaz de usuario amigable.

## Seguridad

En este proyecto en la parte de segurridad, lo que se llego a implementar fue el hasheo de las contraseñas de los usuarios, lo que garantiza que las contraseñas de los usuarios no se almacenan directamente en la base de datos, este enfoque protege la información confidencial y mejora la seguridad de las credenciales de los usuarios.

## Gestion de Sesiones de Usuario

El "sesion manager" es una componente esencial de nuestra aplicación que permite gestionar y controlar la información de cada usuario de manera individual, este módulo garantiza la privacidad y seguridad de los datos, facilitando la autenticación y gestión de sesiones, lo que mejora la experiencia del usuario y garantiza la separación de datos entre distintos usuarios de la aplicación.

## Mejoras a futuro de la aplicacion

Nuestro equipo, ve las mejoras a futuro de esta aplicacion mediante mejor estabilidad, ademas de tener un mejor mantenimiento relacionado a la base de datos para poder consulatar la base de datos; como tambien el poder mejorar la UI para que sea mas amigable con el usuario

## Expectativas de la aplicacion y producto final

Las expectativas que se tuvo con la aplicacion fue pricipalmente de que no llegase a tener una UI como tambien que la aplicacion solo se utilidsace para uso personal y el producto final fue mejor que las expectativas que se tenian ya que se pudo implementar una UI para cada campo requerido como tambien el implementarlo para multiples usuarios

## Requisitos previos

Para ejecutar esta aplicación en tu máquina, debes tener instalados los siguientes requisitos:

- [Java Development Kit (JDK) 17 o superior](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MongoDB](https://docs.mongodb.com/manual/installation/)

Asegúrate de que tu entorno cumple con estos requisitos antes de continuar con la instalación.

## Instalación y Ejecución

Clona este repositorio en tu máquina local:

   ```bash
   https://github.com/Blue017/ToDoList.git
   ```
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

## Instrucciones de Uso

Sigue estos pasos para empezar a utilizar la aplicación:

1. **Registro e Inicio de Sesión**:
   - Para usar la aplicación, puedes registrarte como usuario o iniciar sesión si ya tienes una cuenta.
     ![image](https://github.com/Blue017/ToDoList/assets/115097453/4d59724c-4478-4764-9495-d515bc5a8a59)
     ![image](https://github.com/Blue017/ToDoList/assets/115097453/f8648536-7d0d-4e6d-ae28-5b3c023ee4d7)

2. **Agregar Listas**:
   - Una vez que hayas iniciado sesión, puedes agregar nuevas listas que podrás usar posteriormente para agregar tareas.
     ![image](https://github.com/Blue017/ToDoList/assets/115097453/da4ca12e-29f5-47d1-93af-1d3020b34025)

3. **Agregar Tareas**:
   - En cualquiera de tus listas puedes crear una tarea con una descripción y fecha de vencimiento.
     ![image](https://github.com/Blue017/ToDoList/assets/115097453/819a1850-8f51-4142-a682-4425e783caea)

5. **Editar Tareas**:
   - Para editar una tarea existente, selecciona la tarea que deseas modificar y haz clic en la opción de edición correspondiente.
   ![image](https://github.com/Blue017/ToDoList/assets/115097453/99792689-0fb4-42ed-8ccf-a5d355128dae)

6. **Marcar Tareas como Completadas**:
   - Cuando hayas completado una tarea, puedes marcarla como completada para mantener un registro de tus logros.
   
7. **Eliminar Tareas**:
   - Si decides que una tarea ya no es relevante, puedes eliminarla de tu lista de tareas.
   
8. **Eliminar Listas de Tareas**:
   - Si ya no necesitas una lista de tareas, puedes eliminarla junto con todas sus tareas.
   

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

## Uso Libre y Futuras Actualizaciones

Esta aplicación, ToDoList, se proporciona de forma gratuita y abierta para su uso por cualquier persona que lo desee. Puedes descargar, modificar y utilizar esta aplicación de acuerdo con tus necesidades sin restricciones.

Es importante tener en cuenta que actualmente no se esperan futuras actualizaciones para esta aplicación. Sin embargo, te animamos a utilizarla, personalizarla y, si lo deseas, contribuir con mejoras si tienes los conocimientos técnicos necesarios. La aplicación se proporciona "tal cual", y el equipo de desarrollo no se compromete a brindar soporte adicional o realizar actualizaciones futuras.

Este proyecto ha sido desarrollado por

[@CARLOSGRCIAGRCIA](https://github.com/CARLOSGRCIAGRCIA)

[@Blue017](https://github.com/Blue017)

[@DanielOmar12345](https://github.com/DanielOmar12345)

[@RichardEcosMarquez](https://github.com/RichardEcosMarquez)
