Llanquihue Tour app

👤 Autor del proyecto

Nombre completo: María Paz Rojas

Sección: 2026\_202\_OL\_PRY2202\_24613392\_PCT

Carrera: Analista programador computacional

Sede: Online

📘 Descripción general del sistema



Este proyecto corresponde a la continuación del desarrollo de la aplicación Llanquihue Tour,

agencia de turismo ubicada en la Región de Los Lagos. 



\*\*Semana 8 — Desarrollando interfaces, colecciones genéricas y validación de tipos  \*\*

Objetivo de la semana: Aprender a usar interfaces como contratos de comportamiento para construir sistemas aún más flexibles y desacoplados. También profundizarás en el uso de colecciones polimórficas, y reforzarás el uso del operador instanceof para validar tipos en tiempo de ejecución.
Estos conceptos te permitirán diseñar soluciones donde distintas clases, aunque no compartan una relación de herencia directa, puedan comportarse de forma similar, favoreciendo la escalabilidad y extensibilidad del sistema.


El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.


## 🧱 Estructura general del proyecto
 
```
📁 src/
├── ui/      # Interfaz gráfica (Main.java / Main.form)
├── model/   # Clases de dominio (Persona, RecursoAgencia, ServicioTuristico y sus subclases)
├── data/    # Gestión de la colección de registros (GestorEntidades)
```

## 📋 Clases implementadas
 
| Clase | Paquete | Rol |
|---|---|---|
| Persona | model | Clase base con atributos nombre, rut y teléfono |
| ColaboradorExterno | model | Hereda de Persona, agrega especialidad y certificaciones |
| GuiaTuristico | model | Hereda de Persona, agrega idioma y tipo de tour |
| RecursoAgencia | model | Clase base con atributos tipo de recurso, costo y estado |
| Vehiculo | model | Hereda de RecursoAgencia, agrega marca, patente, modelo y capacidad de personas |
| ServicioTuristico | model | Clase base con atributos nombre y duración en horas |
| RutaGastronomica | model | Hereda de ServicioTuristico, agrega número de paradas |
| Registrable | model | Interfaz que define el método mostrarResumen(), implementada por las clases registrables |
| GestorEntidades | data | Administra la colección de registros y genera el resumen de los servicios disponibles |
| Main | ui | Clase principal, gestiona la interfaz gráfica y lista los registros en la GUI |


🖥️ Funcionamiento de la interfaz


El usuario selecciona el tipo de registro desde un JComboBox ("Colaborador Externo", "Guía Turístico", "Vehículo" o "Ruta Gastronómica").
Según la selección, un panel con CardLayout muestra el formulario correspondiente, con los campos propios de cada tipo.
Al presionar Guardar, se validan los campos y se crea el objeto correspondiente, que se agrega a la colección List<Registrable> a través de GestorEntidades.
Al presionar Mostrar registros, se recorre la colección y se muestra un resumen de todos los objetos guardados en el área de texto de la GUI, diferenciando el tipo real de cada objeto mediante instanceof.

⚙️ Instrucciones para ejecutar el proyecto

git clone https://github.com/Pez7/Llanquihue_TourApp

Abre el proyecto en NetBeans.

Ejecuta la clase principal `Main` ubicada en el paquete `ui` con el botón Run o `F6`.
Selecciona un tipo de registro desde el combo, completa el formulario y presiona Guardar.
Presiona Mostrar registros para ver el listado de todos los registros ingresados.

Repositorio GitHub: https://github.com/Pez7/Llanquihue_TourApp



