# Examen
Retroalimentación Examen Parcial 1 
# Errores solucionados

- En la clase `Pizza` faltaban declarar las variables `tipoSalsa`, `tipoBase` y `toppings`.

- Los parámetros `Toppings[0]` y `Toppings[1]` estaban mal escritos, ya que esa sintaxis no es válida en Java.

- Había varios métodos `anadirIngrediente` innecesarios y uno tenía dos parámetros con el mismo nombre.

- Se dejó un solo método `anadirIngrediente` para recibir todos los toppings mediante un arreglo.

- En `Orden`, los toppings estaban definidos automáticamente como jamón y pepperoni, por lo que el usuario no podía elegirlos.

- Se modificó `Orden` para que el usuario pueda elegir cuántos toppings quiere y cuáles desea agregar.

- Se agregó validación para evitar opciones incorrectas al seleccionar los toppings.


- Se modificó la selección de salsa para que el usuario pueda escogerla mediante opciones.

- Se agregaron algunos getters en `Pizza` para poder obtener la información guardada.

- El menú solamente mostraba las opciones, pero no permitía que el usuario seleccionara ninguna. Se modificó `mostrarMenu` para recibir y devolver la opción seleccionada.

- Se agregó un `switch` en el `Main` para ejecutar una acción dependiendo de la opción elegida en el menú.

- Se agregó un ciclo para que el menú vuelva a mostrarse hasta que el usuario seleccione la opción de salir.

- La clase `Cocina` prácticamente no necesitó cambios.

- El `enum Toppings` ya estaba correcto y no fue necesario modificarlo.
