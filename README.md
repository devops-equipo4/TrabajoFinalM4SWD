# TrabajoFinalM4SWD

Para compilar y ejecutar este proyecto se debe tener instalado los siguientes componentes:
- Maven
- Node v16.13.1
- Npm v8.1.2
- Angular CLI 13.2.3


## Comandos para inicializar el proyecto con Maven

RUN `mvn install` para instalar todas las dependencias del proyecto, luego ejecutar lo siguiente `mvn spring-boot:run -rf :backend` para ejecutar el proyecto java con spring-boot.


## Instructivo para usar Angular

Revisa en este [enlace](https://github.com/devops-equipo4/TrabajoFinalM4SWD/blob/main/frontend/README.md) para revisar como trabajar con [Angular CLI](https://github.com/angular/angular-cli)

## Requisitos de Jenkins

Se debe descargar el drivers de chrome en el directorio del servidor de jenkins.

```
mkdir /usr/bin/chromedriver/
cd /usr/bin/chromedriver/
wget https://chromedriver.storage.googleapis.com/99.0.4844.51/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
```
En el repositorio [Pipeline](https://github.com/devops-equipo4/TrabajoFinalM4SWD_PL), requiere de este archivo para ejecutar las pruebas en selenium, en sus configuraciones tiene configurada una variable con esta ruta.



