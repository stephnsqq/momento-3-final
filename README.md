<<<<<<< HEAD
# momento-3-final
=======
# momento-3-final
Proyecto: Sistema de Elevador (Java)

Este es un proyecto sencillo donde se simula como funciona un elevador usando Java.  
El elevador puede subir, bajar y mostrar en que piso esta.  
Todo funciona con un menú donde el usuario elige que© hacer.

Archivos del proyecto

- Elevador.java Clase con los métodos del elevador.
- Main.java Contiene el menú y el método main.
- Diagrama_Elevador.drawio Diagrama UML del proyecto.
- README.md Este archivo.

¿Que hace el programa?

1. Pide cuantos pisos tiene el edificio.
2. Crea un elevador con esos pisos.
3. Muestra un menor:
   - Subir un piso
   - Bajar un piso
   - Mostrar el piso actual
   - Salir
4. No deja subir más del Último piso ni bajar del piso 1.
5. Muestra mensajes explicando cada accion

Como ejecutarlo

Compilar:

```
javac Elevador.java Main.java
```

Ejecutar:

```
java Main
```

## Diagrama UML

En el archivo llamado "Diagrama_Elevador.drawio" se encuentra el diagrama del proyecto.

## Pruebas 

Prueba 1
• El usuario inicia en el piso 0.
• Selecciona '1. Subir' → El elevador sube al piso 1.
• Selecciona '4. Entrar pasajero' → Se agrega un pasajero.
• Selecciona '6. Mostrar piso' → Se muestra el piso actual.

Prueba 2
• El elevador inicia nuevamente en piso 0.
• El usuario selecciona '4. Entrar pasajero' hasta la capacidad máxima.
• Al intentar ingresar otro pasajero, el sistema muestra: 'El elevador está lleno'.
• Luego selecciona '7. Salir' y el programa finaliza correctamente.



Conclusion
- Clases y objetos en Java
- Uso de métodos
- Condiciones
- Menú básico con consola
- Diagrama
- Pruebas

Autor

Nombre: Paul Stepheen Hernandez Sanchez
Materia: Programacion Orientada A Objetos
>>>>>>> 7f16579 (Initial commit)
