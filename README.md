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

## 🧩 Funcionalidades

### CRUD para Persona:
- Crear persona
- Listar personas
- Buscar por ID
- Actualizar nombre
- Eliminar

### CRUD para Direccion:
- Crear dirección asociada a persona
- Listar direcciones
- Buscar por ID
- Actualizar ciudad
- Eliminar

---

## ⚙️ Configuración de la Base de Datos

Se utiliza H2 en **modo archivo**, y los datos se almacenan en la carpeta `./datos` del proyecto.

**Ruta de conexión:**
```java
jdbc:h2:./datos/personas_db
📎 Requisitos
Java JDK 17 o superior

Gradle instalado o wrapper (./gradlew)

Permisos de escritura en la carpeta del proyecto

🧑‍💻 Autor
Ignacio gomez  — Parcial en Java.
