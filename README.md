# Simulador de Viaje Interplanetario

Este proyecto es un simulador de viaje interplanetario desarrollado en Java. El programa permite a los usuarios gestionar y simular un viaje espacial desde la Tierra a distintos planetas del sistema solar.

**A través de un menú interactivo en consola, los usuarios pueden:**

- Seleccionar un planeta destino entre varias opciones. [seleccionarPlaneta]
- Elegir una nave espacial para el viaje. [seleccionarNave]
- Calcular la duración para el trayecto.
- Simular eventos aleatorios durante el viaje que afecten su progreso. [simularViaje]
- Monitorear el progreso y los recursos de la nave hasta llegar al destino o enfrentar un fallo.
- El programa está diseñado para consolidar conceptos fundamentales de Java, como estructuras de control de flujo, manejo de arrays y listas, modularidad, y validación de datos.

## **1. Selección de Destino y Nave**
- Planetas Disponibles: Marte, Júpiter, Saturno, etc.
- Cada planeta incluye información básica como distancia desde la Tierra.
- Los usuarios eligen entre naves espaciales con diferentes velocidades.

## **2. Gestión de Recursos**
- Cálculo de combustible y oxígeno necesario según la distancia y velocidad seleccionada.
- Permite ajustar recursos antes de iniciar el viaje.

## **3. Simulación del Viaje**
- Progreso mostrado en porcentaje.
- Eventos aleatorios como fallos en el sistema o desvíos inesperados que requieren la intervención del usuario.

## **4. Interfaz Interactiva**
- Menú principal que permite:
- Seleccionar destino.
- Elegir nave espacial.
- Iniciar el viaje.
- Salir del programa.
- Validación de entradas para evitar errores.

## **5. Modularidad**
- Código organizado en métodos que separan cada funcionalidad.
- Uso de arrays para manejar planetas, naves y recursos.