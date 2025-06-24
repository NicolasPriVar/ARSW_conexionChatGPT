# ARSW - Conexión con ChatGPT mediante API  
**Autor:** Nicolás Prieto Vargas  

---

## 📌 Descripción general

Este proyecto permite realizar una conexión entre una aplicación Java y la API de OpenAI (ChatGPT), simulando una conversación entre el usuario y el modelo de lenguaje. 

---

## 🔹 Conexión normal

Este proyecto en Java crea una aplicación simple que permite al usuario conversar directamente con ChatGPT usando la API de OpenAI. El usuario escribe preguntas y recibe respuestas generadas por el modelo.  

### 🧱 Estructura:
- `ChatGPTApplication.java`: gestiona la interacción con el usuario.
- `ChatGptAdapter.java`: realiza la conexión con la API de OpenAI.
- `IAiAdapter.java`: interfaz que permite intercambiar adaptadores de IA.

---

## 🧩 Patrón de diseño usado: Adapter  
🎯 ¿Qué hace el patrón Adapter?
Se aplica el patrón de diseño **Adapter** con una interfaz (`IAiAdapter`) para desacoplar la lógica de negocio de la implementación concreta del proveedor de IA.  
Esto permite:
- Reutilizar el código fácilmente con otros servicios (como Gemini o Claude).
- Mejorar la escalabilidad y el mantenimiento.
- Cumplir principios SOLID como **inversión de dependencias**.


---

## ⚙️ Tecnologías usadas

Azure (despliegue)  
Azure es una plataforma en la nube de Microsoft que se utiliza en este proyecto para desplegar la aplicación web. Permite ejecutar el backend Spring Boot de forma pública, accesible desde cualquier parte del mundo mediante una URL.  

Maven  
Maven es una herramienta de gestión de proyectos y automatización de builds en Java. Se usa para compilar, empaquetar el proyecto y gestionar dependencias como Spring Boot y Gson.  

Spring Boot  
Spring Boot es un framework de Java que permite crear aplicaciones web fácilmente. En este proyecto, se usa para exponer servicios REST, facilitar la configuración automática y manejar las peticiones HTTP que se comunican con la API de ChatGPT.

---

## 🖋️ Pruebas

Para realizar las pruebas de este proyecto, se usó Postman. Postman es una herramienta muy popular que se usa principalmente para probar APIs REST.  
![image](https://github.com/user-attachments/assets/d9b09a62-8dff-4eaa-bc8d-194c43a8c236)  
![image](https://github.com/user-attachments/assets/2acee135-b139-4784-935f-70b3f8e76dc4)


