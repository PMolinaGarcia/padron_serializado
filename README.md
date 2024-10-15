# Aplicación de Gestión de Habitantes


## Autor: Pablo Molina García

## Descripción:
Esta aplicación permite gestionar un padrón de habitantes. A través de una interfaz de usuario, se pueden añadir habitantes, mostrar el padrón actual y obtener ayuda sobre cómo usar el sistema.

## Estructura del Proyecto:
El proyecto está dividido en varios paquetes:
- `dominio`: Contiene las clases principales del dominio, como `Habitante` y `OficinaPadron`.
- `aplicacion`: Contiene la clase principal `Principal`, que inicia la aplicación.
- `presentacion`: Contiene la interfaz de usuario `InterfazUsuario`, que interactúa con el usuario y la lógica del dominio.

## Diagrama UML:
Aquí tienes el diagrama UML de la estructura de clases y paquetes de la aplicación:

![Diagrama UML](Diagrama_UML.png)


## Uso:
Ejecuta la clase Principal para iniciar la aplicación.

Utiliza los comandos de la interfaz de usuario para interactuar con el padrón:

        mostrar: Muestra todos los habitantes del padrón.

        ayuda: Muestra las opciones disponibles.

        añadir <nombre> <apellido1> <apellido2>: Añade un nuevo habitante al padrón.

        salir: Guarda el padrón y finaliza la aplicación.

## Licencia:

Este proyecto está licenciado bajo la Licencia Apache 2.0.
