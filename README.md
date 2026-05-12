# Sistema de Registro de Usuarios - Patrón DAO
**Desarrollado por:** Angel Damián Roa Sánchez

[cite_start]Este proyecto implementa una arquitectura de software basada en el **Patrón DAO (Data Access Object)**, siguiendo los principios de transparencia y modularidad descritos en el material de referencia sobre organizaciones descentralizadas[cite: 1, 23].

##Arquitectura del Sistema
[cite_start]Para evitar el acoplamiento y la complejidad[cite: 25], el sistema se divide en:
* [cite_start]**Entidad:** Definición de los datos del usuario[cite: 40].
* [cite_start]**Interfaz DAO:** Contrato de gobernanza para las operaciones de registro[cite: 15, 49].
* [cite_start]**Implementación DAO:** Ejecución técnica de la persistencia de datos[cite: 19, 44].

##Ejecución Inmediata
Para verificar que la aplcación es funcional sin necesidad de configuraciones locales, haz clic en el siguiente botón para abrir un entorno de ejecución en la nube:

[![Open in GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://github.com/codespaces/new?hide_repo_select=true&ref=main&repo=Kriss-San/Registro-Usuarios-DAO)

---
*Nota: Al iniciar el Codespace, ejecuta el comando `java src/com/roa/main/Main.java` en la terminal para iniciar el registro interactivo.*
