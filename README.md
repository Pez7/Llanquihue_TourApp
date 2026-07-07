Llanquihue Tour app

👤 Autor del proyecto

Nombre completo: María Paz Rojas

Sección: 2026\_202\_OL\_PRY2202\_24613392\_PCT

Carrera: Analista programador computacional

Sede: Online

📘 Descripción general del sistema



Este proyecto corresponde a la continuación del desarrollo de la aplicación Llanquihue Tour,

agencia de turismo ubicada en la Región de Los Lagos. 



\*\*Semana 7 — Aplicación de sobreescritura y polimorfismo en jerarquías  \*\*

Objetivo de la semana: gestionar dinamicamente diversos tipos de servicios turísticos.



El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.



🧱 Estructura general del proyecto
📁 src/

├── ui/      # Clase principal con el método Main
├── model/   # Clases de dominio (ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural)
├── data/    # Gestión e instanciación de servicios (GestorServicios)

📋 Clases implementadas

| Clase | Paquete | Rol |
|---|---|---|
| ServicioTuristico | model | Clase base con atributos nombre y duración en horas |
| ExcursionCultural | model | Hereda de ServicioTuristico, agrega lugar histórico |
| PaseoLacustre | model | Hereda de ServicioTuristico, agrega tipo de embarcación |
| RutaGastronomica | model | Hereda de ServicioTuristico, agrega número de paradas |
| GestorServicios | data | Instancia y retorna los servicios turísticos disponibles |
| Main | ui | Clase principal, lista todos los servicios por consola |




⚙️ Instrucciones para ejecutar el proyecto



git clone https://github.com/Pez7/Llanquihue_TourApp

Abre el proyecto en NetBeans.

Ejecuta la clase principal `Main` ubicada en el paquete `ui` con el botón Run o `F6`.

Los servicios turísticos disponibles se mostrarán listados en la consola de NetBeans.

Repositorio GitHub: https://github.com/Pez7/Llanquihue_TourApp



