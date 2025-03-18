# Sistema de Gestión de Clínica Dental 🦷

Este sistema de gestión está diseñado para administrar las operaciones de una clínica dental, permitiendo el control eficiente de pacientes, doctores, citas, tratamientos y facturación.

## 📋 Características Principales

- **Gestión de Pacientes**: Registro, actualización, consulta de historial médico y eliminación de pacientes.
- **Gestión de Doctores**: Registro de profesionales y consulta de sus citas programadas.
- **Gestión de Citas**: Agendamiento, modificación y cancelación de citas médicas.
- **Gestión de Tratamientos**: Registro y consulta de tratamientos dentales aplicados a pacientes.
- **Gestión de Facturación**: Generación de facturas y registro de pagos.

## 🔧 Estructura del Proyecto

El proyecto está organizado en varios módulos representados por clases Java:

### Clases del Modelo

- **Paciente**: Almacena información de los pacientes, incluyendo datos personales y su historial médico.
- **Doctor**: Gestiona la información de los profesionales, sus especialidades y horarios disponibles.
- **Cita**: Administra las citas médicas entre pacientes y doctores.
- **Tratamiento**: Registra los procedimientos dentales realizados a los pacientes.
- **Factura**: Maneja la facturación de servicios prestados.
- **Horario**: Controla la disponibilidad de los doctores.

### Clase Principal

- **ClinicaDental**: Punto de entrada principal con el menú interactivo para utilizar todas las funcionalidades del sistema.

## 💻 Requisitos

- Java JDK 8 o superior
- IDE compatible con Java (Eclipse, IntelliJ IDEA, etc.)

## 🚀 Instalación y Uso

1. Clone este repositorio:
   ```bash
   git clone https://github.com/su-usuario/sistema-clinica-dental.git
   ```

2. Abra el proyecto en su IDE favorito

3. Compile y ejecute la clase `ClinicaDental.java` para iniciar el sistema

4. Siga las instrucciones del menú interactivo para utilizar las diferentes funcionalidades

## 📌 Guía de Usuario

### Gestión de Pacientes

- **Registrar paciente**: Permite ingresar datos personales de un nuevo paciente
- **Actualizar información**: Modifica datos existentes de un paciente
- **Consultar historial**: Visualiza el historial médico completo de un paciente
- **Eliminar paciente**: Elimina un registro de paciente del sistema

### Gestión de Doctores

- **Registrar doctor**: Registra información y especialidad de un nuevo profesional
- **Consultar citas**: Muestra todas las citas programadas para un doctor específico

### Gestión de Citas

- **Agendar cita**: Programa una nueva cita entre paciente y doctor
- **Cancelar cita**: Marca una cita como cancelada
- **Modificar cita**: Actualiza la fecha u hora de una cita existente

### Gestión de Tratamientos

- **Registrar tratamiento**: Documenta un procedimiento realizado a un paciente
- **Consultar tratamientos**: Visualiza todos los tratamientos de un paciente

### Gestión de Facturas

- **Generar factura**: Crea una nueva factura para servicios prestados
- **Registrar pago**: Actualiza el estado de una factura a "Pagada"

## 🔄 Flujo de Trabajo Recomendado

1. Registrar doctores y sus especialidades
2. Registrar pacientes nuevos
3. Agendar citas para los pacientes
4. Registrar tratamientos realizados
5. Generar facturas y registrar pagos

## 📊 Ejemplos de Uso
```
### Registrar un nuevo Doctor:
```
Opción 2 > Opción 1
Ingresar datos del doctor (nombre, apellido, especialidad, teléfono, correo)
```
### Registrar un nuevo paciente:
```
Opción 1 > Opción 1
Ingresar datos del paciente (nombre, apellido, edad, DUI, teléfono, correo)
```

### Agendar una cita:
```
Opción 3 > Opción 1
Ingresar DUI del paciente
Ingresar ID del doctor
Ingresar fecha/hora y costo
```

## 💡 Contribución

Si desea contribuir a este proyecto, por favor:

1. Haga fork del repositorio
2. Cree una rama para su funcionalidad (`git checkout -b nueva-funcionalidad`)
3. Haga commit de sus cambios (`git commit -m 'Agrega nueva funcionalidad'`)
4. Haga push a la rama (`git push origin nueva-funcionalidad`)
5. Abra un Pull Request


## 👥 Creadores 
- Christian Renderos 
- Melisa Rivas 
- Alisson Quijano 
- Alejandra Arriola

