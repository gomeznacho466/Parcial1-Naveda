# 📚 Proyecto de Consola en Java: Gestión de Personas y Direcciones

Este proyecto es una aplicación de consola en Java que permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre dos entidades relacionadas: `Persona` y `Direccion`. Utiliza una base de datos relacional H2 en modo archivo, y está estructurado en capas siguiendo el patrón DAO para mantener la separación entre la lógica de negocio y el acceso a datos.

---

## 🛠️ Tecnologías Utilizadas

- **Java 17 o superior**
- **JDBC**
- **H2 Database (modo archivo)**
- **Gradle**
- **Patrón DAO**
- **Estructura en capas (DAO, Modelo, Servicio, App)**

---

## 📂 Estructura del Proyecto

src/
└── main/
├── java/
│ └── com/
│ └── ejemplo/
│ ├── app/
│ │ └── App.java
│ ├── dao/
│ │ ├── PersonaDAO.java
│ │ ├── DireccionDAO.java
│ │ ├── impl/
│ │ ├── PersonaDAOImpl.java
│ │ └── DireccionDAOImpl.java
│ ├── modelo/
│ │ ├── Persona.java
│ │ └── Direccion.java
│ ├── servicio/
│ │ └── BaseService.java
│ └── conexion/
│ └── ConexionBD.java
└── resources/

yaml
Copiar
Editar

---

## 🧱 Entidades

### 👤 Persona
- `id` (autogenerado)
- `nombre`

### 🏠 Dirección
- `id` (autogenerado)
- `ciudad`
- `persona_id` (clave foránea hacia `Persona`)

---
# 🎯 Objetivo del Proyecto

El propósito es aplicar buenas prácticas de programación Java mediante:

- Separación en capas (modelo, DAO, servicio y vista de consola).
- Uso de JDBC y base de datos relacional H2.
- Implementación del patrón DAO con interfaces y clases concretas.
- Manejo de excepciones y recursos.
- Uso de Gradle como sistema de construcción.



## 🔁 Funcionalidades del Sistema

### CRUD de Persona
- Crear nueva persona
- Listar todas las personas
- Buscar persona por ID
- Actualizar nombre de persona
- Eliminar persona

### CRUD para Direccion:
- Crear dirección asociada a persona
- Listar direcciones
- Buscar por ID
- Actualizar ciudad
- Eliminar

---

## 🧩 Base de Datos

- Motor: **H2**
- Modo: **Archivo**
- Ruta: `./datos/personas_db.mv.db` (dentro del proyecto)
- Usuario: `sa`
- Contraseña: *(vacía)*

Ejemplo de conexión en `ConexionBD.java`:
```java
private static final String URL = "jdbc:h2:./datos/personas_db";
private static final String USER = "sa";
private static final String PASSWORD = "";
Gradle instalado o wrapper (./gradlew)

Permisos de escritura en la carpeta del proyecto

🧑‍💻 Autor
Ignacio gomez  — Parcial en Java.
