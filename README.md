# DOSW - Parcial Práctico T1

**Nombre completo:** Kevin Andrey Angel Acevedo

**Grupo DOSW:** 1

**Bitacora:** https://github.com/nivek2329/Bitacora-dosw.git 

**Enunciado asignado:** 1 (PAW CONNECT)

## Estructura del proyecto

```
DOSW-ParcialT1
|-- pom.xml
|-- src
|   |-- main
|   |   |-- java
|   |       |-- edu/dosw/parcial/App.java
|   |-- test
|       |-- java
|           |-- edu/dosw/parcial/AppTest.java
|-- docs/
|   |-- uml/            # Diagramas UML exportados en PDF o PNG
|   |-- images/         # Capturas de ejecución
|   |-- requirements/   # Requisitos funcionales y no funcionales
|-- .gitignore
|-- README.md
```

## Evidencias de prerrequisitos

### Herramienta de modelado — Lucidchart

Acceso activo a cuenta de Lucidchart, con documentos recientes visibles.

![Evidencia Lucidchart](docs/images/evidencia-lucidchart.png)

### Herramienta de diseño de interfaces — Figma

Acceso activo a cuenta de Figma, con archivos recientes visibles.

![Evidencia Figma](docs/images/evidencia-figma.png)

### Proyecto corriendo con Maven

Ejecución de `mvn compile exec:java -Dexec.mainClass="edu.dosw.parcial.App"` finalizando en `BUILD SUCCESS`.

![Evidencia Maven Build Success](docs/images/evidencia-maven-build-success.png)

### Parte 1: (diagrama de contexto)

![Diagrama contexto](docs/images/Diagram.drawio.png)

### Parte 2: (Requerimientos)

### Requerimientos funcionales:

-Paw connect debe permitir filtrar y buscar las mascotas segun los criterios definidos por el usuario

-paw connect debe permitir registrar y logear a los usuarios

-paw connect debe tener la capacidad de permitir recorrer la jerarquia del sistema de multiples formas

-paw connect debe tener la capacidad de permitir consultar al usuario el estado de adopcion de su mascota

### Requerimientos no funcionales:

-El sistema debe tener colores institucionales ,color verve (#276749)

-El sistema debe procesar y responder cualquier solicitud de consulta o navegacion en un intervalo <= 1 para el 90% de consultas


### Parte 3: (diagrama de uso)

![Diagrama contexto](docs/images/Diagrama_caso_Iterator.png)

![Diagrama contexto](docs/images/Diagrama_caso_composite.png)

