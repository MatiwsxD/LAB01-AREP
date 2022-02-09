# Autor: Juan Mateo Mejia Zuluaga
# Codigo: 2154840
## _AREP- ARQUITECTURA EMPRESARIAL_

# Convercion de temperatura #
En este laboratorio vamos a crear una API que convierta de grados celsius a fahrenheit y viceversa, en este proyecto tenemos un backend que implementa spark y este devuelve la conversion en un archivo .JSON, este archivo es recogido por el front en JavaScript y lo manda a html. Tenemos varias formas de desplegar este proyecto, ya sea de forma local, o por medio de Heroku.

## Pre-requisitos

- Maven
- JDK 8 o superior
- Un IDE

# Cálculos necesarios

- Convertir de grados centigrados a fahrenheit:
```     
        public  String celToFa(Float cantidad){
        Float fahrenheit = cantidad*9/5 +32 ;.
```

- Convertir de grados fahrenheit a celsius:
```     
        public  String faToCel(Float cantidad){
        float celcius = (cantidad*5 -160)/9;
```
# Implementacion

En el backend se tiene una clase que es la encargada de hacer los calculos, luego hay una clase app que hace uso del framework spark el cual permite crear apps web, esta genera un .JSON que luego es leido por un front en JavaScript y de ahi le pasa el parametro a un archivo HTML.

# Uso del proyecto

El repositorio de descarga es:https://github.com/MatiwsxD/LAB01-AREP.git
Link de la app: https://hidden-caverns-65840.herokuapp.com/


> El programa funciona hasta donde el fron en javascript recibe el .JSON con la respuesta
>pero no pude mostrarlo en el HTML por un error de formato.
