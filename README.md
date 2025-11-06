#Restaurant Manager

Sistema de gestión para restaurantes desarrollado en equipo.  
Permite administrar menú, órdenes, reservas y estadísticas de ventas.



#Características Principales

- Gestión de menú (agregar / eliminar ítems)
- Procesamiento de órdenes
- Gestión de reservas
- Cálculo de estadísticas e ingresos
- Soporte Docker para despliegue rápido


#Equipo de Desarrollo



 -Maintainer : Mateo Madrigal 

 -Developer : Andres Pabon 

 -Developer : Sebastian Velasquez 

 -Developer : Andres Contreras 

#Requisitos previos

 correr sin Docker:
- Java 17+
- Maven 3+

correr con Docker:
- Docker Desktop o Docker Engine instalado
- Docker Compose

#Cómo Ejecutar

Opción 1 — Ejecutar con Maven (modo desarrollo)

```bash
mvn clean install
mvn spring-boot:run
