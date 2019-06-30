# JAVAEE_SPRING_MVC
Proyecto JavaEE Web con Maven, con el framework Spring MVC, contiene configuraciones para un funcionamiento mejor y enrrutamiento

Para ejecutar el proyecto, compilar y asegurarse que se sincronicen las dependencias de Maven.

Cuando se ejecute segun el servidor podria cammbiar la ruta,pero en caso de esta explicacion se ejecuto con el server de GlassFish,
las rutas serian las siguientes: 
-Para mostrar una vista simpre: ---------->donde: prueba=controlador;prueba2=metodo del controlador; 
  http://localhost:8080/app/prueba/prueba2
-Para mostrar una vista con un parametro enviado en la ruta: ---->donde: prueba=controlador;prueba=metodo del controlador; el metodo procesa parametros de la peticion
  http://localhost:8080/app/prueba/prueba2?v=holaMundo
-Para realizar una suma  :   /prueba/sumar/{n1}/{n2}----> donde: prueba=controlador;sumar=metodo del controlador; n1,n2=parametros
  http://localhost:8080/app/prueba/sumar/5/8
 
  

