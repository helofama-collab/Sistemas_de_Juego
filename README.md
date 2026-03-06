# Sistemas_de_Juego: Sistema de Personajes (POO Avanzada)

Este proyecto es una simulación de un sistema de personajes para un videojuego implementado en **Java**, aplicando conceptos avanzados de **Programación Orientada a Objetos (POO)** como herencia, clases abstractas, polimorfismo e interfaces.

## 📖 Descripción y Funcionamiento

El programa permite la creación y gestión de diferentes tipos de personajes, cada uno con atributos únicos y habilidades específicas. Se ha diseñado siguiendo el patrón de arquitectura **MVC (Modelo-Vista-Controlador)** para mantener el código organizado y escalable:

*   **Modelo (`model`)**: Define la estructura principal de los personajes.
    *   La clase abstracta `Personaje` sirve como base.
    *   Se divide en dos grandes ramas: **Físicos** (`Guerrero`, `Tanque`, `Cazador`, `Ladrón`) y **Mágicos** (`Mago`, `Hechicero`, `Clérigo`, `Nigromante`).
    *   Interfaces de capacidades que añaden comportamiento extra (`Curable`, `Defendible`, `Hechizable`, `Movilizable`, `Sigiloso`).
*   **Controlador (`controller`)**: 
    *   `GestorJuego` administra la lista de personajes. Permite agregar nuevos participantes, listar sus estadísticas globales, simular turnos de batalla usando polimorfismo y comprobar sus capacidades dinámicamente mediante `instanceof`.
*   **Vista (`vista`)**: 
    *   `App.java` es la clase principal de arranque, que inicia una demostración automática por consola mostrando las funcionalidades en acción.

## 🚀 Cómo ejecutar el proyecto

Para probar y ejecutar el sistema de juego de manera local, sigue estos pasos:

1.  Asegúrate de contar con el **JDK de Java** instalado en tu sistema.
2.  Abre una terminal (consola o símbolo del sistema).
3.  Navega hasta la carpeta del código fuente:
    ```bash
    cd src
    ```
4.  Compila los archivos Java:
    ```bash
    javac vista/App.java
    ```
5.  Ejecuta la clase principal para ver la demostración:
    ```bash
    java vista.App
    ```

## 👥 Contribuciones del Equipo

Este proyecto ha sido desarrollado de forma colaborativa. A continuación, se detallan las partes desarrolladas por cada miembro del equipo:

*   **Ahmed:** Ha realizado los apartados 1, 2 y 3.
*   **Dyron:** Ha realizado parte del apartado 3 y el apartado 4.
*   **Yeison:** Ha realizado los apartados 5, 6 y 7.
